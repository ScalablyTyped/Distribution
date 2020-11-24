package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Boundary extends js.Object {
  
  /** The boundary of the location as a set of loops containing pairs of latitude, longitude coordinates. */
  var boundary: js.UndefOr[js.Array[String]] = js.native
  
  /** The cache policy active for this data. EX: UNRESTRICTED, RESTRICTED, NEVER */
  var cachePolicy: js.UndefOr[String] = js.native
  
  /** The country code of the location. */
  var countryCode: js.UndefOr[String] = js.native
  
  /** The latitude of the location. */
  var latitude: js.UndefOr[Double] = js.native
  
  /** The longitude of the location. */
  var longitude: js.UndefOr[Double] = js.native
  
  /** The type of map that should be used for this location. EX: HYBRID, ROADMAP, SATELLITE, TERRAIN */
  var mapType: js.UndefOr[String] = js.native
  
  /** The viewport for showing this location. This is a latitude, longitude rectangle. */
  var viewport: js.UndefOr[Hi] = js.native
  
  /**
    * The Zoom level to use for the map. Zoom levels between 0 (the lowest zoom level, in which the entire world can be seen on one map) to 21+ (down to individual buildings). See:
    * https: //developers.google.com/maps/documentation/staticmaps/#Zoomlevels
    */
  var zoom: js.UndefOr[Double] = js.native
}
object Boundary {
  
  @scala.inline
  def apply(): Boundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Boundary]
  }
  
  @scala.inline
  implicit class BoundaryOps[Self <: Boundary] (val x: Self) extends AnyVal {
    
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
    def setBoundaryVarargs(value: String*): Self = this.set("boundary", js.Array(value :_*))
    
    @scala.inline
    def setBoundary(value: js.Array[String]): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    
    @scala.inline
    def setCachePolicy(value: String): Self = this.set("cachePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachePolicy: Self = this.set("cachePolicy", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setMapType(value: String): Self = this.set("mapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapType: Self = this.set("mapType", js.undefined)
    
    @scala.inline
    def setViewport(value: Hi): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
