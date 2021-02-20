package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableSet extends StObject {
  
  /** The placeholder string; defined by EMM. */
  var placeholder: js.UndefOr[String] = js.native
  
  /** The value of the placeholder, specific to the user. */
  var userValue: js.UndefOr[String] = js.native
}
object VariableSet {
  
  @scala.inline
  def apply(): VariableSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariableSet]
  }
  
  @scala.inline
  implicit class VariableSetMutableBuilder[Self <: VariableSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setUserValue(value: String): Self = StObject.set(x, "userValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserValueUndefined: Self = StObject.set(x, "userValue", js.undefined)
  }
}
