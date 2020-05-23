package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFormatDetails extends js.Object {
  var `document-format`: js.UndefOr[MimeMediaType] = js.undefined
  var `document-format-device-id`: js.UndefOr[String] = js.undefined
  var `document-format-version`: js.UndefOr[String] = js.undefined
  var `document-natural-language`: js.UndefOr[js.Array[String]] = js.undefined
  var `document-source-application-name`: js.UndefOr[String] = js.undefined
  var `document-source-application-version`: js.UndefOr[String] = js.undefined
  var `document-source-os-name`: js.UndefOr[String] = js.undefined
  var `document-source-os-version`: js.UndefOr[String] = js.undefined
}

object DocumentFormatDetails {
  @scala.inline
  def apply(
    `document-format`: MimeMediaType = null,
    `document-format-device-id`: String = null,
    `document-format-version`: String = null,
    `document-natural-language`: js.Array[String] = null,
    `document-source-application-name`: String = null,
    `document-source-application-version`: String = null,
    `document-source-os-name`: String = null,
    `document-source-os-version`: String = null
  ): DocumentFormatDetails = {
    val __obj = js.Dynamic.literal()
    if (`document-format` != null) __obj.updateDynamic("document-format")(`document-format`.asInstanceOf[js.Any])
    if (`document-format-device-id` != null) __obj.updateDynamic("document-format-device-id")(`document-format-device-id`.asInstanceOf[js.Any])
    if (`document-format-version` != null) __obj.updateDynamic("document-format-version")(`document-format-version`.asInstanceOf[js.Any])
    if (`document-natural-language` != null) __obj.updateDynamic("document-natural-language")(`document-natural-language`.asInstanceOf[js.Any])
    if (`document-source-application-name` != null) __obj.updateDynamic("document-source-application-name")(`document-source-application-name`.asInstanceOf[js.Any])
    if (`document-source-application-version` != null) __obj.updateDynamic("document-source-application-version")(`document-source-application-version`.asInstanceOf[js.Any])
    if (`document-source-os-name` != null) __obj.updateDynamic("document-source-os-name")(`document-source-os-name`.asInstanceOf[js.Any])
    if (`document-source-os-version` != null) __obj.updateDynamic("document-source-os-version")(`document-source-os-version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFormatDetails]
  }
}

