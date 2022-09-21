package typings.kakaoJsSdk.anon

import typings.kakaoJsSdk.Kakao.Navi.ViaPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var coordType: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var returnUri: js.UndefOr[String] = js.undefined
  
  // default 100
  var routeInfo: js.UndefOr[Boolean] = js.undefined
  
  // default 1,
  var rpOptio: js.UndefOr[Double] = js.undefined
  
  var sAngle: js.UndefOr[Double] = js.undefined
  
  // default false
  var sX: js.UndefOr[Double] = js.undefined
  
  var sY: js.UndefOr[Double] = js.undefined
  
  // default 'katec', union type 'wgs84' | 'katec';
  var vehicleType: js.UndefOr[Double] = js.undefined
  
  var viaPoints: js.UndefOr[js.Array[ViaPoint]] = js.undefined
  
  var x: Double
  
  var y: Double
}
object Name {
  
  inline def apply(name: String, x: Double, y: Double): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setCoordType(value: String): Self = StObject.set(x, "coordType", value.asInstanceOf[js.Any])
    
    inline def setCoordTypeUndefined: Self = StObject.set(x, "coordType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReturnUri(value: String): Self = StObject.set(x, "returnUri", value.asInstanceOf[js.Any])
    
    inline def setReturnUriUndefined: Self = StObject.set(x, "returnUri", js.undefined)
    
    inline def setRouteInfo(value: Boolean): Self = StObject.set(x, "routeInfo", value.asInstanceOf[js.Any])
    
    inline def setRouteInfoUndefined: Self = StObject.set(x, "routeInfo", js.undefined)
    
    inline def setRpOptio(value: Double): Self = StObject.set(x, "rpOptio", value.asInstanceOf[js.Any])
    
    inline def setRpOptioUndefined: Self = StObject.set(x, "rpOptio", js.undefined)
    
    inline def setSAngle(value: Double): Self = StObject.set(x, "sAngle", value.asInstanceOf[js.Any])
    
    inline def setSAngleUndefined: Self = StObject.set(x, "sAngle", js.undefined)
    
    inline def setSX(value: Double): Self = StObject.set(x, "sX", value.asInstanceOf[js.Any])
    
    inline def setSXUndefined: Self = StObject.set(x, "sX", js.undefined)
    
    inline def setSY(value: Double): Self = StObject.set(x, "sY", value.asInstanceOf[js.Any])
    
    inline def setSYUndefined: Self = StObject.set(x, "sY", js.undefined)
    
    inline def setVehicleType(value: Double): Self = StObject.set(x, "vehicleType", value.asInstanceOf[js.Any])
    
    inline def setVehicleTypeUndefined: Self = StObject.set(x, "vehicleType", js.undefined)
    
    inline def setViaPoints(value: js.Array[ViaPoint]): Self = StObject.set(x, "viaPoints", value.asInstanceOf[js.Any])
    
    inline def setViaPointsUndefined: Self = StObject.set(x, "viaPoints", js.undefined)
    
    inline def setViaPointsVarargs(value: ViaPoint*): Self = StObject.set(x, "viaPoints", js.Array(value*))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
