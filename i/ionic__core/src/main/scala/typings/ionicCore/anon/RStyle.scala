package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RStyle extends StObject {
  
  var r: Double
  
  var style: Left
}
object RStyle {
  
  inline def apply(r: Double, style: Left): RStyle = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RStyle]
  }
  
  extension [Self <: RStyle](x: Self) {
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Left): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
