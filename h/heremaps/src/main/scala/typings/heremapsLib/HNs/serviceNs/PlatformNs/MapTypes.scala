package typings
package heremapsLib.HNs.serviceNs.PlatformNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * pre-configured set of HERE tile layers for convenient use with the map.
  */
trait MapTypes
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[heremapsLib.HNs.serviceNs.MapType]] {
  var normal: js.UndefOr[heremapsLib.HNs.serviceNs.MapType] = js.undefined
  var satellite: js.UndefOr[heremapsLib.HNs.serviceNs.MapType] = js.undefined
  var terrain: js.UndefOr[heremapsLib.HNs.serviceNs.MapType] = js.undefined
}

object MapTypes {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[heremapsLib.HNs.serviceNs.MapType]] = null,
    normal: heremapsLib.HNs.serviceNs.MapType = null,
    satellite: heremapsLib.HNs.serviceNs.MapType = null,
    terrain: heremapsLib.HNs.serviceNs.MapType = null
  ): MapTypes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (satellite != null) __obj.updateDynamic("satellite")(satellite)
    if (terrain != null) __obj.updateDynamic("terrain")(terrain)
    __obj.asInstanceOf[MapTypes]
  }
}

