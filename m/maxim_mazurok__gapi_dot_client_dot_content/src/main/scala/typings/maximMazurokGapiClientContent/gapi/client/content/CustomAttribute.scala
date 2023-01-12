package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAttribute extends StObject {
  
  /** Subattributes within this attribute group. Exactly one of value or groupValues must be provided. */
  var groupValues: js.UndefOr[js.Array[CustomAttribute]] = js.undefined
  
  /** The name of the attribute. Underscores will be replaced by spaces upon insertion. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The value of the attribute. */
  var value: js.UndefOr[String] = js.undefined
}
object CustomAttribute {
  
  inline def apply(): CustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomAttribute] (val x: Self) extends AnyVal {
    
    inline def setGroupValues(value: js.Array[CustomAttribute]): Self = StObject.set(x, "groupValues", value.asInstanceOf[js.Any])
    
    inline def setGroupValuesUndefined: Self = StObject.set(x, "groupValues", js.undefined)
    
    inline def setGroupValuesVarargs(value: CustomAttribute*): Self = StObject.set(x, "groupValues", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
