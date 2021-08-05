package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetHttpsProxiesScopedList extends StObject {
  
  /** A list of TargetHttpsProxies contained in this scope. */
  var targetHttpsProxies: js.UndefOr[js.Array[TargetHttpsProxy]] = js.undefined
  
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object TargetHttpsProxiesScopedList {
  
  inline def apply(): TargetHttpsProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHttpsProxiesScopedList]
  }
  
  extension [Self <: TargetHttpsProxiesScopedList](x: Self) {
    
    inline def setTargetHttpsProxies(value: js.Array[TargetHttpsProxy]): Self = StObject.set(x, "targetHttpsProxies", value.asInstanceOf[js.Any])
    
    inline def setTargetHttpsProxiesUndefined: Self = StObject.set(x, "targetHttpsProxies", js.undefined)
    
    inline def setTargetHttpsProxiesVarargs(value: TargetHttpsProxy*): Self = StObject.set(x, "targetHttpsProxies", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
