package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcquisitionTargetingRule extends StObject {
  
  /** Required. The scope of subscriptions this rule considers. Only allows "this subscription" and "any subscription in app". */
  var scope: js.UndefOr[TargetingRuleScope] = js.undefined
}
object AcquisitionTargetingRule {
  
  inline def apply(): AcquisitionTargetingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcquisitionTargetingRule]
  }
  
  extension [Self <: AcquisitionTargetingRule](x: Self) {
    
    inline def setScope(value: TargetingRuleScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
