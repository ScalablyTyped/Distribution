package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedOptions extends StObject {
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object LinkedOptions {
  
  inline def apply(): LinkedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedOptions] (val x: Self) extends AnyVal {
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
