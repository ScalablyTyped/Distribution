package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the configuration for logging a type of permissions. Example: {
  * &quot;audit_log_configs&quot;: [         {           &quot;log_type&quot;:
  * &quot;DATA_READ&quot;,           &quot;exempted_members&quot;: [
  * &quot;user:foo@gmail.com&quot;           ]         },         {
  * &quot;log_type&quot;: &quot;DATA_WRITE&quot;,         }       ]     }  This
  * enables &#39;DATA_READ&#39; and &#39;DATA_WRITE&#39; logging, while
  * exempting foo@gmail.com from DATA_READ logging.
  */
@js.native
trait SchemaAuditLogConfig extends StObject {
  
  /**
    * Specifies the identities that do not cause logging for this type of
    * permission. Follows the same format of Binding.members.
    */
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The log type that this config enables.
    */
  var logType: js.UndefOr[String] = js.native
}
object SchemaAuditLogConfig {
  
  @scala.inline
  def apply(): SchemaAuditLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditLogConfig]
  }
  
  @scala.inline
  implicit class SchemaAuditLogConfigMutableBuilder[Self <: SchemaAuditLogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExemptedMembers(value: js.Array[String]): Self = StObject.set(x, "exemptedMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExemptedMembersUndefined: Self = StObject.set(x, "exemptedMembers", js.undefined)
    
    @scala.inline
    def setExemptedMembersVarargs(value: String*): Self = StObject.set(x, "exemptedMembers", js.Array(value :_*))
    
    @scala.inline
    def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
  }
}
