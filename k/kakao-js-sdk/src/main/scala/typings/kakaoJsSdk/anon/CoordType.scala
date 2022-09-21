package typings.kakaoJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordType extends StObject {
  
  var coordType: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var x: Double
  
  var y: Double
}
object CoordType {
  
  inline def apply(name: String, x: Double, y: Double): CoordType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordType]
  }
  
  extension [Self <: CoordType](x: Self) {
    
    inline def setCoordType(value: String): Self = StObject.set(x, "coordType", value.asInstanceOf[js.Any])
    
    inline def setCoordTypeUndefined: Self = StObject.set(x, "coordType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
