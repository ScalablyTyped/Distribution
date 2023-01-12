package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupsScopedList extends StObject {
  
  /** [Output Only] The list of instance groups that are contained in this scope. */
  var instanceGroups: js.UndefOr[js.Array[InstanceGroup]] = js.undefined
  
  /** [Output Only] An informational warning that replaces the list of instance groups when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object InstanceGroupsScopedList {
  
  inline def apply(): InstanceGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupsScopedList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceGroupsScopedList] (val x: Self) extends AnyVal {
    
    inline def setInstanceGroups(value: js.Array[InstanceGroup]): Self = StObject.set(x, "instanceGroups", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupsUndefined: Self = StObject.set(x, "instanceGroups", js.undefined)
    
    inline def setInstanceGroupsVarargs(value: InstanceGroup*): Self = StObject.set(x, "instanceGroups", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
