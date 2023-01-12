package typings.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhiteColor extends StObject {
  
  var normal: String
  
  var normalActive: String
  
  var normalHover: String
}
object WhiteColor {
  
  inline def apply(normal: String, normalActive: String, normalHover: String): WhiteColor = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], normalActive = normalActive.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhiteColor] (val x: Self) extends AnyVal {
    
    inline def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalActive(value: String): Self = StObject.set(x, "normalActive", value.asInstanceOf[js.Any])
    
    inline def setNormalHover(value: String): Self = StObject.set(x, "normalHover", value.asInstanceOf[js.Any])
  }
}
