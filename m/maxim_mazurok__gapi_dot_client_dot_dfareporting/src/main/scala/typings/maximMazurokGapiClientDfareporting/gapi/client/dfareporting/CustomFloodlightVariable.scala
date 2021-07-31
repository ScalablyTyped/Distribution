package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFloodlightVariable extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customFloodlightVariable". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The type of custom floodlight variable to supply a value for. These map to the "u[1-20]=" in the tags. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The value of the custom floodlight variable. The length of string must not exceed 50 characters. */
  var value: js.UndefOr[String] = js.undefined
}
object CustomFloodlightVariable {
  
  @scala.inline
  def apply(): CustomFloodlightVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFloodlightVariable]
  }
  
  @scala.inline
  implicit class CustomFloodlightVariableMutableBuilder[Self <: CustomFloodlightVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
