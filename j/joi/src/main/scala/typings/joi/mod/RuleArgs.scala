package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleArgs extends StObject {
  
  var assert: js.UndefOr[(js.Function1[/* value */ js.Any, Boolean]) | AnySchema] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var name: String
  
  /**
    * Undocumented properties
    */
  var normalize: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
  
  var ref: js.UndefOr[Boolean] = js.undefined
}
object RuleArgs {
  
  inline def apply(name: String): RuleArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleArgs]
  }
  
  extension [Self <: RuleArgs](x: Self) {
    
    inline def setAssert(value: (js.Function1[/* value */ js.Any, Boolean]) | AnySchema): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setAssertFunction1(value: /* value */ js.Any => Boolean): Self = StObject.set(x, "assert", js.Any.fromFunction1(value))
    
    inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
    
    inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    inline def setRef(value: Boolean): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
