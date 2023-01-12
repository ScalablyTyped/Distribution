package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryPositionOptions extends StObject {
  
  var at: js.UndefOr[String] = js.undefined
  
  var collision: js.UndefOr[String] = js.undefined
  
  var my: js.UndefOr[String] = js.undefined
  
  var of: js.UndefOr[Any] = js.undefined
  
  var `using`: js.UndefOr[js.Function] = js.undefined
  
  var within: js.UndefOr[Any] = js.undefined
}
object JQueryPositionOptions {
  
  inline def apply(): JQueryPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryPositionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryPositionOptions] (val x: Self) extends AnyVal {
    
    inline def setAt(value: String): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setCollision(value: String): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
    
    inline def setMy(value: String): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
    
    inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
    
    inline def setOf(value: Any): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    inline def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
    
    inline def setUsing(value: js.Function): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
    
    inline def setUsingUndefined: Self = StObject.set(x, "using", js.undefined)
    
    inline def setWithin(value: Any): Self = StObject.set(x, "within", value.asInstanceOf[js.Any])
    
    inline def setWithinUndefined: Self = StObject.set(x, "within", js.undefined)
  }
}
