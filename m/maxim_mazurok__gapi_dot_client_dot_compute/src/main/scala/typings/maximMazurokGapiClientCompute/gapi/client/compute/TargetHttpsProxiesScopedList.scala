package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHttpsProxiesScopedList extends StObject {
  
  /** A list of TargetHttpsProxies contained in this scope. */
  var targetHttpsProxies: js.UndefOr[js.Array[TargetHttpsProxy]] = js.native
  
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object TargetHttpsProxiesScopedList {
  
  @scala.inline
  def apply(): TargetHttpsProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHttpsProxiesScopedList]
  }
  
  @scala.inline
  implicit class TargetHttpsProxiesScopedListMutableBuilder[Self <: TargetHttpsProxiesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetHttpsProxies(value: js.Array[TargetHttpsProxy]): Self = StObject.set(x, "targetHttpsProxies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHttpsProxiesUndefined: Self = StObject.set(x, "targetHttpsProxies", js.undefined)
    
    @scala.inline
    def setTargetHttpsProxiesVarargs(value: TargetHttpsProxy*): Self = StObject.set(x, "targetHttpsProxies", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
