package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomVariable extends StObject {
  
  /** The index of the custom variable. */
  var index: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customVariable". */
  var kind: js.UndefOr[String] = js.native
  
  /** The value of the custom variable. The length of string must not exceed 50 characters. */
  var value: js.UndefOr[String] = js.native
}
object CustomVariable {
  
  @scala.inline
  def apply(): CustomVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomVariable]
  }
  
  @scala.inline
  implicit class CustomVariableMutableBuilder[Self <: CustomVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
