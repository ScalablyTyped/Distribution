package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import typings.ipp.mod.MimeMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Documentformat extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  var compression: js.UndefOr[typings.ipp.mod.Compression] = js.undefined
  var `document-format`: js.UndefOr[MimeMediaType] = js.undefined
  var `document-name`: js.UndefOr[String] = js.undefined
  var `document-natural-language`: js.UndefOr[String] = js.undefined
  var `document-uri`: String
  var `ipp-attribute-fidelity`: js.UndefOr[Boolean] = js.undefined
  var `job-impressions`: js.UndefOr[Double] = js.undefined
  var `job-k-octets`: js.UndefOr[Double] = js.undefined
  var `job-media-sheets`: js.UndefOr[Double] = js.undefined
  var `job-name`: js.UndefOr[String] = js.undefined
  var `printer-uri`: js.UndefOr[String] = js.undefined
  var `requesting-user-name`: String
}

object Documentformat {
  @scala.inline
  def apply(
    `document-uri`: String,
    `requesting-user-name`: String,
    `attributes-charset`: CharacterSet = null,
    `attributes-natural-language`: String = null,
    compression: typings.ipp.mod.Compression = null,
    `document-format`: MimeMediaType = null,
    `document-name`: String = null,
    `document-natural-language`: String = null,
    `ipp-attribute-fidelity`: js.UndefOr[Boolean] = js.undefined,
    `job-impressions`: js.UndefOr[Double] = js.undefined,
    `job-k-octets`: js.UndefOr[Double] = js.undefined,
    `job-media-sheets`: js.UndefOr[Double] = js.undefined,
    `job-name`: String = null,
    `printer-uri`: String = null
  ): Documentformat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("document-uri")(`document-uri`.asInstanceOf[js.Any])
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    if (`attributes-charset` != null) __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    if (`attributes-natural-language` != null) __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (`document-format` != null) __obj.updateDynamic("document-format")(`document-format`.asInstanceOf[js.Any])
    if (`document-name` != null) __obj.updateDynamic("document-name")(`document-name`.asInstanceOf[js.Any])
    if (`document-natural-language` != null) __obj.updateDynamic("document-natural-language")(`document-natural-language`.asInstanceOf[js.Any])
    if (!js.isUndefined(`ipp-attribute-fidelity`)) __obj.updateDynamic("ipp-attribute-fidelity")(`ipp-attribute-fidelity`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-impressions`)) __obj.updateDynamic("job-impressions")(`job-impressions`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-k-octets`)) __obj.updateDynamic("job-k-octets")(`job-k-octets`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-media-sheets`)) __obj.updateDynamic("job-media-sheets")(`job-media-sheets`.get.asInstanceOf[js.Any])
    if (`job-name` != null) __obj.updateDynamic("job-name")(`job-name`.asInstanceOf[js.Any])
    if (`printer-uri` != null) __obj.updateDynamic("printer-uri")(`printer-uri`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documentformat]
  }
}

