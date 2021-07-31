package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A geographic location that can be associated with a timeline item.
  */
trait SchemaLocation extends StObject {
  
  /**
    * The accuracy of the location fix in meters.
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  
  /**
    * The full address of the location.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * The name to be displayed. This may be a business name or a user-defined
    * place, such as &quot;Home&quot;.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the location.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The type of resource. This is always mirror#location.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The latitude, in degrees.
    */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /**
    * The longitude, in degrees.
    */
  var longitude: js.UndefOr[Double] = js.undefined
  
  /**
    * The time at which this location was captured, formatted according to RFC
    * 3339.
    */
  var timestamp: js.UndefOr[String] = js.undefined
}
object SchemaLocation {
  
  @scala.inline
  def apply(): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocation]
  }
  
  @scala.inline
  implicit class SchemaLocationMutableBuilder[Self <: SchemaLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
