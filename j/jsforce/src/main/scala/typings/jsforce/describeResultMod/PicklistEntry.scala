package typings.jsforce.describeResultMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PicklistEntry extends StObject {
  
  var active: Boolean
  
  var defaultValue: Boolean
  
  var label: js.UndefOr[maybe[String]] = js.undefined
  
  var validFor: js.UndefOr[maybe[String]] = js.undefined
  
  var value: String
}
object PicklistEntry {
  
  inline def apply(active: Boolean, defaultValue: Boolean, value: String): PicklistEntry = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PicklistEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PicklistEntry] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: maybe[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setValidFor(value: maybe[String]): Self = StObject.set(x, "validFor", value.asInstanceOf[js.Any])
    
    inline def setValidForNull: Self = StObject.set(x, "validFor", null)
    
    inline def setValidForUndefined: Self = StObject.set(x, "validFor", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
