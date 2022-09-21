package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentityServiceMembershipState extends StObject {
  
  /**
    * The reason of the failure.
    */
  var failureReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Installed AIS version. This is the AIS version installed on this member. The values makes sense iff state is OK.
    */
  var installedVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last reconciled membership configuration
    */
  var memberConfig: js.UndefOr[SchemaIdentityServiceMembershipSpec] = js.undefined
  
  /**
    * Deployment state on this member
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentityServiceMembershipState {
  
  inline def apply(): SchemaIdentityServiceMembershipState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentityServiceMembershipState]
  }
  
  extension [Self <: SchemaIdentityServiceMembershipState](x: Self) {
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonNull: Self = StObject.set(x, "failureReason", null)
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setInstalledVersion(value: String): Self = StObject.set(x, "installedVersion", value.asInstanceOf[js.Any])
    
    inline def setInstalledVersionNull: Self = StObject.set(x, "installedVersion", null)
    
    inline def setInstalledVersionUndefined: Self = StObject.set(x, "installedVersion", js.undefined)
    
    inline def setMemberConfig(value: SchemaIdentityServiceMembershipSpec): Self = StObject.set(x, "memberConfig", value.asInstanceOf[js.Any])
    
    inline def setMemberConfigUndefined: Self = StObject.set(x, "memberConfig", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
