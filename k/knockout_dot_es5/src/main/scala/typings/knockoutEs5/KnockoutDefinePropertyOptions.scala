package typings.knockoutEs5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutDefinePropertyOptions extends StObject {
  
  def get(): js.Any = js.native
  
  var set: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
}
object KnockoutDefinePropertyOptions {
  
  @scala.inline
  def apply(get: () => js.Any): KnockoutDefinePropertyOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[KnockoutDefinePropertyOptions]
  }
  
  @scala.inline
  implicit class KnockoutDefinePropertyOptionsMutableBuilder[Self <: KnockoutDefinePropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: /* value */ js.Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
