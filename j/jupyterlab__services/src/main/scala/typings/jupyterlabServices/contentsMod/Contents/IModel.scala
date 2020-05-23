package typings.jupyterlabServices.contentsMod.Contents

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
    * The size of then file in bytes.
    */
  val size: js.UndefOr[Double] = js.undefined
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
    chunk: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined
  ): IModel = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], last_modified = last_modified.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(chunk)) __obj.updateDynamic("chunk")(chunk.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
}

