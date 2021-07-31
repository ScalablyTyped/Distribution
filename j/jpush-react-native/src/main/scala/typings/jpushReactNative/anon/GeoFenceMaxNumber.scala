package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoFenceMaxNumber extends StObject {
  
  var geoFenceMaxNumber: Double
}
object GeoFenceMaxNumber {
  
  @scala.inline
  def apply(geoFenceMaxNumber: Double): GeoFenceMaxNumber = {
    val __obj = js.Dynamic.literal(geoFenceMaxNumber = geoFenceMaxNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoFenceMaxNumber]
  }
  
  @scala.inline
  implicit class GeoFenceMaxNumberMutableBuilder[Self <: GeoFenceMaxNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoFenceMaxNumber(value: Double): Self = StObject.set(x, "geoFenceMaxNumber", value.asInstanceOf[js.Any])
  }
}
