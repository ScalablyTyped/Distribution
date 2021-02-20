package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for returning group information from authenticators.
  */
@js.native
trait SchemaAuthenticatorGroupsConfig extends StObject {
  
  /**
    * Whether this cluster should return group membership lookups during
    * authentication using a group of security groups.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the security group-of-groups to be used. Only relevant if
    * enabled = true.
    */
  var securityGroup: js.UndefOr[String] = js.native
}
object SchemaAuthenticatorGroupsConfig {
  
  @scala.inline
  def apply(): SchemaAuthenticatorGroupsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticatorGroupsConfig]
  }
  
  @scala.inline
  implicit class SchemaAuthenticatorGroupsConfigMutableBuilder[Self <: SchemaAuthenticatorGroupsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setSecurityGroup(value: String): Self = StObject.set(x, "securityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupUndefined: Self = StObject.set(x, "securityGroup", js.undefined)
  }
}
