package typings.jsforce.describeResultMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PicklistEntry extends StObject {
  
  var active: Boolean = js.native
  
  var defaultValue: Boolean = js.native
  
  var label: js.UndefOr[maybe[String]] = js.native
  
  var validFor: js.UndefOr[maybe[String]] = js.native
  
  var value: String = js.native
}
object PicklistEntry {
  
  @scala.inline
  def apply(active: Boolean, defaultValue: Boolean, value: String): PicklistEntry = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PicklistEntry]
  }
  
  @scala.inline
  implicit class PicklistEntryMutableBuilder[Self <: PicklistEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: maybe[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setValidFor(value: maybe[String]): Self = StObject.set(x, "validFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidForNull: Self = StObject.set(x, "validFor", null)
    
    @scala.inline
    def setValidForUndefined: Self = StObject.set(x, "validFor", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
