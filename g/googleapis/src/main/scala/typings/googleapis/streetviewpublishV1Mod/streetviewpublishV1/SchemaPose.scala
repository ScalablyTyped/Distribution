package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Raw pose measurement for an entity.
  */
@js.native
trait SchemaPose extends js.Object {
  
  /**
    * The estimated horizontal accuracy of this pose in meters with 68%
    * confidence (one standard deviation). For example, on Android, this value
    * is available from this method:
    * https://developer.android.com/reference/android/location/Location#getAccuracy().
    * Other platforms have different methods of obtaining similar accuracy
    * estimations.
    */
  var accuracyMeters: js.UndefOr[Double] = js.native
  
  /**
    * Altitude of the pose in meters above WGS84 ellipsoid. NaN indicates an
    * unmeasured quantity.
    */
  var altitude: js.UndefOr[Double] = js.native
  
  /**
    * Compass heading, measured at the center of the photo in degrees clockwise
    * from North. Value must be &gt;=0 and &lt;360. NaN indicates an unmeasured
    * quantity.
    */
  var heading: js.UndefOr[Double] = js.native
  
  /**
    * Latitude and longitude pair of the pose, as explained here:
    * https://cloud.google.com/datastore/docs/reference/rest/Shared.Types/LatLng
    * When creating a Photo, if the latitude and longitude pair are not
    * provided, the geolocation from the exif header is used. A latitude and
    * longitude pair not provided in the photo or exif header causes the photo
    * process to fail.
    */
  var latLngPair: js.UndefOr[SchemaLatLng] = js.native
  
  /**
    * Level (the floor in a building) used to configure vertical navigation.
    */
  var level: js.UndefOr[SchemaLevel] = js.native
  
  /**
    * Pitch, measured at the center of the photo in degrees. Value must be
    * &gt;=-90 and &lt;= 90. A value of -90 means looking directly down, and a
    * value of 90 means looking directly up. NaN indicates an unmeasured
    * quantity.
    */
  var pitch: js.UndefOr[Double] = js.native
  
  /**
    * Roll, measured in degrees. Value must be &gt;= 0 and &lt;360. A value of
    * 0 means level with the horizon. NaN indicates an unmeasured quantity.
    */
  var roll: js.UndefOr[Double] = js.native
}
object SchemaPose {
  
  @scala.inline
  def apply(): SchemaPose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPose]
  }
  
  @scala.inline
  implicit class SchemaPoseOps[Self <: SchemaPose] (val x: Self) extends AnyVal {
    
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
    def setAccuracyMeters(value: Double): Self = this.set("accuracyMeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccuracyMeters: Self = this.set("accuracyMeters", js.undefined)
    
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    
    @scala.inline
    def setLatLngPair(value: SchemaLatLng): Self = this.set("latLngPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatLngPair: Self = this.set("latLngPair", js.undefined)
    
    @scala.inline
    def setLevel(value: SchemaLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    
    @scala.inline
    def setRoll(value: Double): Self = this.set("roll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoll: Self = this.set("roll", js.undefined)
  }
}
