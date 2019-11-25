package typings.heremaps.H.service.Platform

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.H.service.MapType
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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (satellite != null) __obj.updateDynamic("satellite")(satellite.asInstanceOf[js.Any])
    if (terrain != null) __obj.updateDynamic("terrain")(terrain.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypes]
  }
}

