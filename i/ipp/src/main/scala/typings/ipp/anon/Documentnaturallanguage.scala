package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import typings.ipp.mod.MimeMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Documentnaturallanguage extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  var compression: js.UndefOr[typings.ipp.mod.Compression] = js.undefined
  var `document-format`: js.UndefOr[MimeMediaType] = js.undefined
  var `document-name`: js.UndefOr[String] = js.undefined
  var `document-natural-language`: js.UndefOr[String] = js.undefined
  var `job-id`: js.UndefOr[Double] = js.undefined
  var `job-uri`: js.UndefOr[String] = js.undefined
  var `last-document`: Boolean
  var `printer-uri`: js.UndefOr[String] = js.undefined
  var `requesting-user-name`: String
}

object Documentnaturallanguage {
  @scala.inline
  def apply(
    `last-document`: Boolean,
    `requesting-user-name`: String,
    `attributes-charset`: CharacterSet = null,
    `attributes-natural-language`: String = null,
    compression: typings.ipp.mod.Compression = null,
    `document-format`: MimeMediaType = null,
    `document-name`: String = null,
    `document-natural-language`: String = null,
    `job-id`: js.UndefOr[Double] = js.undefined,
    `job-uri`: String = null,
    `printer-uri`: String = null
  ): Documentnaturallanguage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("last-document")(`last-document`.asInstanceOf[js.Any])
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    if (`attributes-charset` != null) __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    if (`attributes-natural-language` != null) __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (`document-format` != null) __obj.updateDynamic("document-format")(`document-format`.asInstanceOf[js.Any])
    if (`document-name` != null) __obj.updateDynamic("document-name")(`document-name`.asInstanceOf[js.Any])
    if (`document-natural-language` != null) __obj.updateDynamic("document-natural-language")(`document-natural-language`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-id`)) __obj.updateDynamic("job-id")(`job-id`.get.asInstanceOf[js.Any])
    if (`job-uri` != null) __obj.updateDynamic("job-uri")(`job-uri`.asInstanceOf[js.Any])
    if (`printer-uri` != null) __obj.updateDynamic("printer-uri")(`printer-uri`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documentnaturallanguage]
  }
}

