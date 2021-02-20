package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPoolsScopedList extends StObject {
  
  /** A list of target pools contained in this scope. */
  var targetPools: js.UndefOr[js.Array[TargetPool]] = js.native
  
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object TargetPoolsScopedList {
  
  @scala.inline
  def apply(): TargetPoolsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsScopedList]
  }
  
  @scala.inline
  implicit class TargetPoolsScopedListMutableBuilder[Self <: TargetPoolsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetPools(value: js.Array[TargetPool]): Self = StObject.set(x, "targetPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPoolsUndefined: Self = StObject.set(x, "targetPools", js.undefined)
    
    @scala.inline
    def setTargetPoolsVarargs(value: TargetPool*): Self = StObject.set(x, "targetPools", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
