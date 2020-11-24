package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  A resource that represents a location with full geographic
  * information.
  */
@js.native
trait SchemaJobLocation extends js.Object {
  
  /**
    * An object representing a latitude/longitude pair.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.native
  
  /**
    * The type of a location, which corresponds to the address lines field of
    * PostalAddress. For example, &quot;Downtown, Atlanta, GA, USA&quot; has a
    * type of LocationType#NEIGHBORHOOD, and &quot;Kansas City, KS, USA&quot;
    * has a type of LocationType#LOCALITY.
    */
  var locationType: js.UndefOr[String] = js.native
  
  /**
    * Postal address of the location that includes human readable information,
    * such as postal delivery and payments addresses. Given a postal address, a
    * postal service can deliver items to a premises, P.O. Box, or other
    * delivery location.
    */
  var postalAddress: js.UndefOr[SchemaPostalAddress] = js.native
  
  /**
    * Radius in meters of the job location. This value is derived from the
    * location bounding box in which a circle with the specified radius
    * centered from LatLng coves the area associated with the job location. For
    * example, currently, &quot;Mountain View, CA, USA&quot; has a radius of
    * 7885.79 meters.
    */
  var radiusMeters: js.UndefOr[Double] = js.native
}
object SchemaJobLocation {
  
  @scala.inline
  def apply(): SchemaJobLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobLocation]
  }
  
  @scala.inline
  implicit class SchemaJobLocationOps[Self <: SchemaJobLocation] (val x: Self) extends AnyVal {
    
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
    def setLatLng(value: SchemaLatLng): Self = this.set("latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatLng: Self = this.set("latLng", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
    
    @scala.inline
    def setPostalAddress(value: SchemaPostalAddress): Self = this.set("postalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalAddress: Self = this.set("postalAddress", js.undefined)
    
    @scala.inline
    def setRadiusMeters(value: Double): Self = this.set("radiusMeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusMeters: Self = this.set("radiusMeters", js.undefined)
  }
}
