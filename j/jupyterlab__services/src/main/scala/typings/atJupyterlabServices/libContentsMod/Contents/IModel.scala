package typings.atJupyterlabServices.libContentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contents model.
  */
trait IModel extends js.Object {
  /**
    * The chunk of the file upload.
    */
  val chunk: js.UndefOr[Double] = js.undefined
  /**
    * The optional file content.
    */
  val content: js.Any
  /**
    * File creation timestamp.
    */
  val created: String
  /**
    * The format of the file `content`.
    *
    * #### Notes
    * Only relevant for type: 'file'
    */
  val format: FileFormat
  /**
    * Last modified timestamp.
    */
  val last_modified: String
  /**
    * Specify the mime-type of file contents.
    *
    * #### Notes
    * Only non-`null` when `content` is present and `type` is `"file"`.
    */
  val mimetype: String
  /**
    * Name of the contents file.
    *
    * #### Notes
    *  Equivalent to the last part of the `path` field.
    */
  val name: String
  /**
    * The full file path.
    *
    * #### Notes
    * It will *not* start with `/`, and it will be `/`-delimited.
    */
  val path: String
  /**
    * The type of file.
    */
  val `type`: ContentType
  /**
    * Whether the requester has permission to edit the file.
    */
  val writable: Boolean
}

object IModel {
  @scala.inline
  def apply(
    content: js.Any,
    created: String,
    format: FileFormat,
    last_modified: String,
    mimetype: String,
    name: String,
    path: String,
    `type`: ContentType,
    writable: Boolean,
    chunk: Int | Double = null
  ): IModel = {
    val __obj = js.Dynamic.literal(content = content, created = created, format = format, last_modified = last_modified, mimetype = mimetype, name = name, path = path, writable = writable)
    __obj.updateDynamic("type")(`type`)
    if (chunk != null) __obj.updateDynamic("chunk")(chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
}

