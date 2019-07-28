package typings.heremaps.HNs.serviceNs.PlatformNs

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.HNs.serviceNs.MapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * pre-configured set of HERE tile layers for convenient use with the map.
  */
trait MapTypes
  extends /* key */ StringDictionary[js.UndefOr[MapType]] {
  var normal: js.UndefOr[MapType] = js.undefined
  var satellite: js.UndefOr[MapType] = js.undefined
  var terrain: js.UndefOr[MapType] = js.undefined
}

object MapTypes {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[MapType]] = null,
    normal: MapType = null,
    satellite: MapType = null,
    terrain: MapType = null
  ): MapTypes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (satellite != null) __obj.updateDynamic("satellite")(satellite)
    if (terrain != null) __obj.updateDynamic("terrain")(terrain)
    __obj.asInstanceOf[MapTypes]
  }
}

