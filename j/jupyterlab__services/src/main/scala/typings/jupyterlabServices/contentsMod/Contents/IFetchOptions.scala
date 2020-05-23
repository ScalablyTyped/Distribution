package typings.jupyterlabServices.contentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to fetch a file.
  */
trait IFetchOptions extends js.Object {
  /**
    * Whether to include the file content.
    *
    * The default is `true`.
    */
  var content: js.UndefOr[Boolean] = js.undefined
  /**
    * The override file format for the request.
    */
  var format: js.UndefOr[FileFormat] = js.undefined
  /**
    * The override file type for the request.
    */
  var `type`: js.UndefOr[ContentType] = js.undefined
}

object IFetchOptions {
  @scala.inline
  def apply(content: js.UndefOr[Boolean] = js.undefined, format: FileFormat = null, `type`: ContentType = null): IFetchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFetchOptions]
  }
}

