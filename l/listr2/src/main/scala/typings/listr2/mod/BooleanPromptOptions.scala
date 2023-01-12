package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanPromptOptions
  extends StObject
     with BasePromptOptions {
  
  @JSName("initial")
  var initial_BooleanPromptOptions: js.UndefOr[Boolean | (js.Function0[js.Promise[String] | String])] = js.undefined
}
object BooleanPromptOptions {
  
  inline def apply(message: String | (js.Function0[js.Promise[String] | String])): BooleanPromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanPromptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BooleanPromptOptions] (val x: Self) extends AnyVal {
    
    inline def setInitial(value: Boolean | (js.Function0[js.Promise[String] | String])): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialFunction0(value: () => js.Promise[String] | String): Self = StObject.set(x, "initial", js.Any.fromFunction0(value))
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
  }
}
