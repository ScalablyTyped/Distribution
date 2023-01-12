package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePromptOptionsWithName
  extends StObject
     with BasePromptOptions {
  
  var name: String | js.Function0[String]
}
object BasePromptOptionsWithName {
  
  inline def apply(message: String | (js.Function0[js.Promise[String] | String]), name: String | js.Function0[String]): BasePromptOptionsWithName = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePromptOptionsWithName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasePromptOptionsWithName] (val x: Self) extends AnyVal {
    
    inline def setName(value: String | js.Function0[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameFunction0(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
  }
}
