package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleArgs extends StObject {
  
  var assert: js.UndefOr[(js.Function1[/* value */ js.Any, Boolean]) | AnySchema] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  /**
    * Undocumented properties
    */
  var normalize: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  var ref: js.UndefOr[Boolean] = js.native
}
object RuleArgs {
  
  @scala.inline
  def apply(name: String): RuleArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleArgs]
  }
  
  @scala.inline
  implicit class RuleArgsMutableBuilder[Self <: RuleArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssert(value: (js.Function1[/* value */ js.Any, Boolean]) | AnySchema): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertFunction1(value: /* value */ js.Any => Boolean): Self = StObject.set(x, "assert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalize(value: /* value */ js.Any => _): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    @scala.inline
    def setRef(value: Boolean): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
