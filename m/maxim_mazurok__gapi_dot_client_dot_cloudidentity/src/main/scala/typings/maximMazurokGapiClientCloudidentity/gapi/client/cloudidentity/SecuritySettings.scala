package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySettings extends StObject {
  
  /** The Member Restriction value */
  var memberRestriction: js.UndefOr[MemberRestriction] = js.undefined
  
  /** Output only. The resource name of the security settings. Shall be of the form `groups/{group_id}/securitySettings`. */
  var name: js.UndefOr[String] = js.undefined
}
object SecuritySettings {
  
  inline def apply(): SecuritySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuritySettings]
  }
  
  extension [Self <: SecuritySettings](x: Self) {
    
    inline def setMemberRestriction(value: MemberRestriction): Self = StObject.set(x, "memberRestriction", value.asInstanceOf[js.Any])
    
    inline def setMemberRestrictionUndefined: Self = StObject.set(x, "memberRestriction", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
