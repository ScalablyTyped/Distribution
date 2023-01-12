package typings.kakaoJsSdk.Kakao

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Navi {
  
  trait ViaPoint extends StObject {
    
    var name: String
    
    var x: Double
    
    var y: Double
  }
  object ViaPoint {
    
    inline def apply(name: String, x: Double, y: Double): ViaPoint = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViaPoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViaPoint] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
