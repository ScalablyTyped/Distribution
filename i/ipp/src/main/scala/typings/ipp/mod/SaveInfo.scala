package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveInfo extends js.Object {
  var `save-document-format`: js.UndefOr[MimeMediaType] = js.undefined
  var `save-location`: js.UndefOr[String] = js.undefined
  var `save-name`: js.UndefOr[String] = js.undefined
}

object SaveInfo {
  @scala.inline
  def apply(
    `save-document-format`: MimeMediaType = null,
    `save-location`: String = null,
    `save-name`: String = null
  ): SaveInfo = {
    val __obj = js.Dynamic.literal()
    if (`save-document-format` != null) __obj.updateDynamic("save-document-format")(`save-document-format`.asInstanceOf[js.Any])
    if (`save-location` != null) __obj.updateDynamic("save-location")(`save-location`.asInstanceOf[js.Any])
    if (`save-name` != null) __obj.updateDynamic("save-name")(`save-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveInfo]
  }
}

