package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableSet extends StObject {
  
  /** The placeholder string; defined by EMM. */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /** The value of the placeholder, specific to the user. */
  var userValue: js.UndefOr[String] = js.undefined
}
object VariableSet {
  
  inline def apply(): VariableSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariableSet]
  }
  
  extension [Self <: VariableSet](x: Self) {
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setUserValue(value: String): Self = StObject.set(x, "userValue", value.asInstanceOf[js.Any])
    
    inline def setUserValueUndefined: Self = StObject.set(x, "userValue", js.undefined)
  }
}
