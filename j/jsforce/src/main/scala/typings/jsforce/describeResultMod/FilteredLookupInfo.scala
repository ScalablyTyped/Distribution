package typings.jsforce.describeResultMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilteredLookupInfo extends StObject {
  
  var controllingFields: js.Array[String]
  
  var dependent: Boolean
  
  var optionalFilter: Boolean
}
object FilteredLookupInfo {
  
  inline def apply(controllingFields: js.Array[String], dependent: Boolean, optionalFilter: Boolean): FilteredLookupInfo = {
    val __obj = js.Dynamic.literal(controllingFields = controllingFields.asInstanceOf[js.Any], dependent = dependent.asInstanceOf[js.Any], optionalFilter = optionalFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteredLookupInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilteredLookupInfo] (val x: Self) extends AnyVal {
    
    inline def setControllingFields(value: js.Array[String]): Self = StObject.set(x, "controllingFields", value.asInstanceOf[js.Any])
    
    inline def setControllingFieldsVarargs(value: String*): Self = StObject.set(x, "controllingFields", js.Array(value*))
    
    inline def setDependent(value: Boolean): Self = StObject.set(x, "dependent", value.asInstanceOf[js.Any])
    
    inline def setOptionalFilter(value: Boolean): Self = StObject.set(x, "optionalFilter", value.asInstanceOf[js.Any])
  }
}
