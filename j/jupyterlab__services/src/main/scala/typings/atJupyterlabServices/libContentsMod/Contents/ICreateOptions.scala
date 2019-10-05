package typings.atJupyterlabServices.libContentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a file.
  */
trait ICreateOptions extends js.Object {
  /**
    * The optional file extension for the new file (e.g. `".txt"`).
    *
    * #### Notes
    * This ignored if `type` is `'notebook'`.
    */
  var ext: js.UndefOr[String] = js.undefined
  /**
    * The directory in which to create the file.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The file type.
    */
  var `type`: js.UndefOr[ContentType] = js.undefined
}

object ICreateOptions {
  @scala.inline
  def apply(ext: String = null, path: String = null, `type`: ContentType = null): ICreateOptions = {
    val __obj = js.Dynamic.literal()
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICreateOptions]
  }
}

