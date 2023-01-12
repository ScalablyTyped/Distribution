package typings.knockoutAmdHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutBindingHandlers extends StObject {
  
  var module: KnockoutAMDModule
}
object KnockoutBindingHandlers {
  
  inline def apply(module: KnockoutAMDModule): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutBindingHandlers] (val x: Self) extends AnyVal {
    
    inline def setModule(value: KnockoutAMDModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
  }
}
