package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesScopedList extends StObject {
  
  /** [Output Only] A list of instances contained in this scope. */
  var instances: js.UndefOr[js.Array[Instance]] = js.undefined
  
  /** [Output Only] Informational warning which replaces the list of instances when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object InstancesScopedList {
  
  inline def apply(): InstancesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesScopedList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstancesScopedList] (val x: Self) extends AnyVal {
    
    inline def setInstances(value: js.Array[Instance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
