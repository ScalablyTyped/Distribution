package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionContext extends StObject {
  
  /** The hypothetical access timestamp to evaluate IAM conditions. Note that this value must not be earlier than the current time; otherwise, an INVALID_ARGUMENT error will be returned. */
  var accessTime: js.UndefOr[String] = js.undefined
}
object ConditionContext {
  
  inline def apply(): ConditionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionContext]
  }
  
  extension [Self <: ConditionContext](x: Self) {
    
    inline def setAccessTime(value: String): Self = StObject.set(x, "accessTime", value.asInstanceOf[js.Any])
    
    inline def setAccessTimeUndefined: Self = StObject.set(x, "accessTime", js.undefined)
  }
}
