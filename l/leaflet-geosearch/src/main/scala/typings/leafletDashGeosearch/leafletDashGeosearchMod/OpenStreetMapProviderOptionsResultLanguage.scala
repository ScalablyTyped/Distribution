package typings.leafletDashGeosearch.leafletDashGeosearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenStreetMapProviderOptionsResultLanguage extends js.Object {
  var `accept-language`: js.UndefOr[String] = js.undefined
}

object OpenStreetMapProviderOptionsResultLanguage {
  @scala.inline
  def apply(`accept-language`: String = null): OpenStreetMapProviderOptionsResultLanguage = {
    val __obj = js.Dynamic.literal()
    if (`accept-language` != null) __obj.updateDynamic("accept-language")(`accept-language`)
    __obj.asInstanceOf[OpenStreetMapProviderOptionsResultLanguage]
  }
}

