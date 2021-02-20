package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHttpProxiesScopedList extends StObject {
  
  /** A list of TargetHttpProxies contained in this scope. */
  var targetHttpProxies: js.UndefOr[js.Array[TargetHttpProxy]] = js.native
  
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object TargetHttpProxiesScopedList {
  
  @scala.inline
  def apply(): TargetHttpProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHttpProxiesScopedList]
  }
  
  @scala.inline
  implicit class TargetHttpProxiesScopedListMutableBuilder[Self <: TargetHttpProxiesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetHttpProxies(value: js.Array[TargetHttpProxy]): Self = StObject.set(x, "targetHttpProxies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHttpProxiesUndefined: Self = StObject.set(x, "targetHttpProxies", js.undefined)
    
    @scala.inline
    def setTargetHttpProxiesVarargs(value: TargetHttpProxy*): Self = StObject.set(x, "targetHttpProxies", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
