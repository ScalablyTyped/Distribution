package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthenticatorGroupsConfig extends StObject {
  
  /**
    * Whether this cluster should return group membership lookups during authentication using a group of security groups.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the security group-of-groups to be used. Only relevant if enabled = true.
    */
  var securityGroup: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuthenticatorGroupsConfig {
  
  inline def apply(): SchemaAuthenticatorGroupsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticatorGroupsConfig]
  }
  
  extension [Self <: SchemaAuthenticatorGroupsConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setSecurityGroup(value: String): Self = StObject.set(x, "securityGroup", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupNull: Self = StObject.set(x, "securityGroup", null)
    
    inline def setSecurityGroupUndefined: Self = StObject.set(x, "securityGroup", js.undefined)
  }
}
