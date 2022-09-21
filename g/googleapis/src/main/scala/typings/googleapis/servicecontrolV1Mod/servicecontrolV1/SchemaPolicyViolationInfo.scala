package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyViolationInfo extends StObject {
  
  /**
    * Indicates the orgpolicy violations for this resource.
    */
  var orgPolicyViolationInfo: js.UndefOr[SchemaOrgPolicyViolationInfo] = js.undefined
}
object SchemaPolicyViolationInfo {
  
  inline def apply(): SchemaPolicyViolationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyViolationInfo]
  }
  
  extension [Self <: SchemaPolicyViolationInfo](x: Self) {
    
    inline def setOrgPolicyViolationInfo(value: SchemaOrgPolicyViolationInfo): Self = StObject.set(x, "orgPolicyViolationInfo", value.asInstanceOf[js.Any])
    
    inline def setOrgPolicyViolationInfoUndefined: Self = StObject.set(x, "orgPolicyViolationInfo", js.undefined)
  }
}
