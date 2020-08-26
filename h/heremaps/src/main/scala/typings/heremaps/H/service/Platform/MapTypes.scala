package typings.heremaps.H.service.Platform

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.H.service.MapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * pre-configured set of HERE tile layers for convenient use with the map.
  */
@js.native
trait MapTypes
  extends /* key */ StringDictionary[js.UndefOr[MapType]] {
  var normal: js.UndefOr[MapType] = js.native
  var satellite: js.UndefOr[MapType] = js.native
  var terrain: js.UndefOr[MapType] = js.native
}

object MapTypes {
  @scala.inline
  def apply(): MapTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypes]
  }
  @scala.inline
  implicit class MapTypesOps[Self <: MapTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNormal(value: MapType): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormal: Self = this.set("normal", js.undefined)
    @scala.inline
    def setSatellite(value: MapType): Self = this.set("satellite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSatellite: Self = this.set("satellite", js.undefined)
    @scala.inline
    def setTerrain(value: MapType): Self = this.set("terrain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerrain: Self = this.set("terrain", js.undefined)
  }
  
}

