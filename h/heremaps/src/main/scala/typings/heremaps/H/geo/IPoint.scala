package typings.heremaps.H.geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface to represent a geographic point. Every point in geo space is represented by three coordinates latitude, longitude and optional altitude.
  * @property lat {H.geo.Latitude} - The latitude coordinate.
  * @property lng {H.geo.Longitude} - The longitude coordinate.
  * @property alt {H.geo.Altitude=} - The altitude coordinate.
  * @property ctx {H.geo.AltitudeContext=} - The altitude context.
  */
@js.native
trait IPoint extends js.Object {
  
  var alt: js.UndefOr[Altitude] = js.native
  
  var ctx: js.UndefOr[AltitudeContext] = js.native
  
  var lat: Latitude = js.native
  
  var lng: Longitude = js.native
}
object IPoint {
  
  @scala.inline
  def apply(lat: Latitude, lng: Longitude): IPoint = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPoint]
  }
  
  @scala.inline
  implicit class IPointOps[Self <: IPoint] (val x: Self) extends AnyVal {
    
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
    def setLat(value: Latitude): Self = this.set("lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: Longitude): Self = this.set("lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlt(value: Altitude): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setCtx(value: AltitudeContext): Self = this.set("ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtx: Self = this.set("ctx", js.undefined)
  }
}
