package typings.lobibox.LobiboxModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptMethods extends StObject {
  
  var getValue: js.UndefOr[js.Function0[String]] = js.undefined
  
  var setValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[String], this.type]] = js.undefined
}
object PromptMethods {
  
  inline def apply(): PromptMethods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromptMethods] (val x: Self) extends AnyVal {
    
    inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setSetValue(value: /* val */ js.UndefOr[String] => PromptMethods): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
  }
}
