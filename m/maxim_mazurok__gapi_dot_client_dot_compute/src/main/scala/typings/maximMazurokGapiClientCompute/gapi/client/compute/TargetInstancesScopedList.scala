package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetInstancesScopedList extends StObject {
  
  /** A list of target instances contained in this scope. */
  var targetInstances: js.UndefOr[js.Array[TargetInstance]] = js.undefined
  
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object TargetInstancesScopedList {
  
  inline def apply(): TargetInstancesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetInstancesScopedList]
  }
  
  extension [Self <: TargetInstancesScopedList](x: Self) {
    
    inline def setTargetInstances(value: js.Array[TargetInstance]): Self = StObject.set(x, "targetInstances", value.asInstanceOf[js.Any])
    
    inline def setTargetInstancesUndefined: Self = StObject.set(x, "targetInstances", js.undefined)
    
    inline def setTargetInstancesVarargs(value: TargetInstance*): Self = StObject.set(x, "targetInstances", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
