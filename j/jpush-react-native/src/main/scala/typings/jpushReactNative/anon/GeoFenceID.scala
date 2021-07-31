package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoFenceID extends StObject {
  
  var geoFenceID: String
}
object GeoFenceID {
  
  @scala.inline
  def apply(geoFenceID: String): GeoFenceID = {
    val __obj = js.Dynamic.literal(geoFenceID = geoFenceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoFenceID]
  }
  
  @scala.inline
  implicit class GeoFenceIDMutableBuilder[Self <: GeoFenceID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoFenceID(value: String): Self = StObject.set(x, "geoFenceID", value.asInstanceOf[js.Any])
  }
}
