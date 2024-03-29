package typings.joi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddRuleOptions extends StObject {
  
  var args: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var name: String
}
object AddRuleOptions {
  
  inline def apply(name: String): AddRuleOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRuleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddRuleOptions] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: StringDictionary[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
