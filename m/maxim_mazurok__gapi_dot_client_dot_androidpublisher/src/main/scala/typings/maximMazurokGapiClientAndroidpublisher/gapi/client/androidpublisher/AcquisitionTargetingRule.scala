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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcquisitionTargetingRule] (val x: Self) extends AnyVal {
    
    inline def setScope(value: TargetingRuleScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
