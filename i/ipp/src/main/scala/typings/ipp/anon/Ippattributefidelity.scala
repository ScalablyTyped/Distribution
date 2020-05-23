package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ippattributefidelity extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  var `ipp-attribute-fidelity`: js.UndefOr[Boolean] = js.undefined
  var `job-impressions`: js.UndefOr[Double] = js.undefined
  var `job-k-octets`: js.UndefOr[Double] = js.undefined
  var `job-media-sheets`: js.UndefOr[Double] = js.undefined
  var `job-name`: js.UndefOr[String] = js.undefined
  var `printer-uri`: js.UndefOr[String] = js.undefined
  var `requesting-user-name`: String
}

object Ippattributefidelity {
  @scala.inline
  def apply(
    `requesting-user-name`: String,
    `attributes-charset`: CharacterSet = null,
    `attributes-natural-language`: String = null,
    `ipp-attribute-fidelity`: js.UndefOr[Boolean] = js.undefined,
    `job-impressions`: js.UndefOr[Double] = js.undefined,
    `job-k-octets`: js.UndefOr[Double] = js.undefined,
    `job-media-sheets`: js.UndefOr[Double] = js.undefined,
    `job-name`: String = null,
    `printer-uri`: String = null
  ): Ippattributefidelity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    if (`attributes-charset` != null) __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    if (`attributes-natural-language` != null) __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    if (!js.isUndefined(`ipp-attribute-fidelity`)) __obj.updateDynamic("ipp-attribute-fidelity")(`ipp-attribute-fidelity`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-impressions`)) __obj.updateDynamic("job-impressions")(`job-impressions`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-k-octets`)) __obj.updateDynamic("job-k-octets")(`job-k-octets`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-media-sheets`)) __obj.updateDynamic("job-media-sheets")(`job-media-sheets`.get.asInstanceOf[js.Any])
    if (`job-name` != null) __obj.updateDynamic("job-name")(`job-name`.asInstanceOf[js.Any])
    if (`printer-uri` != null) __obj.updateDynamic("printer-uri")(`printer-uri`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ippattributefidelity]
  }
}

