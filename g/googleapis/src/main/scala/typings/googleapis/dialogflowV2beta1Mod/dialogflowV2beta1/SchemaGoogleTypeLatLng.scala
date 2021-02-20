package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing a latitude/longitude pair. This is expressed as a
  * pair of doubles representing degrees latitude and degrees longitude. Unless
  * specified otherwise, this must conform to the &lt;a
  * href=&quot;http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf&quot;&gt;WGS84
  * standard&lt;/a&gt;. Values must be within normalized ranges.
  */
@js.native
trait SchemaGoogleTypeLatLng extends StObject {
  
  /**
    * The latitude in degrees. It must be in the range [-90.0, +90.0].
    */
  var latitude: js.UndefOr[Double] = js.native
  
  /**
    * The longitude in degrees. It must be in the range [-180.0, +180.0].
    */
  var longitude: js.UndefOr[Double] = js.native
}
object SchemaGoogleTypeLatLng {
  
  @scala.inline
  def apply(): SchemaGoogleTypeLatLng = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleTypeLatLng]
  }
  
  @scala.inline
  implicit class SchemaGoogleTypeLatLngMutableBuilder[Self <: SchemaGoogleTypeLatLng] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
