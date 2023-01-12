package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPoolsScopedList extends StObject {
  
  /** A list of target pools contained in this scope. */
  var targetPools: js.UndefOr[js.Array[TargetPool]] = js.undefined
  
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object TargetPoolsScopedList {
  
  inline def apply(): TargetPoolsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsScopedList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetPoolsScopedList] (val x: Self) extends AnyVal {
    
    inline def setTargetPools(value: js.Array[TargetPool]): Self = StObject.set(x, "targetPools", value.asInstanceOf[js.Any])
    
    inline def setTargetPoolsUndefined: Self = StObject.set(x, "targetPools", js.undefined)
    
    inline def setTargetPoolsVarargs(value: TargetPool*): Self = StObject.set(x, "targetPools", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
