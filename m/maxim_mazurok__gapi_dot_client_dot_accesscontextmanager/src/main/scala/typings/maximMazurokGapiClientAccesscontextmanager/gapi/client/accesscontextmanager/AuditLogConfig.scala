package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditLogConfig extends StObject {
  
  /** Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members. */
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The log type that this config enables. */
  var logType: js.UndefOr[String] = js.undefined
}
object AuditLogConfig {
  
  inline def apply(): AuditLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditLogConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditLogConfig] (val x: Self) extends AnyVal {
    
    inline def setExemptedMembers(value: js.Array[String]): Self = StObject.set(x, "exemptedMembers", value.asInstanceOf[js.Any])
    
    inline def setExemptedMembersUndefined: Self = StObject.set(x, "exemptedMembers", js.undefined)
    
    inline def setExemptedMembersVarargs(value: String*): Self = StObject.set(x, "exemptedMembers", js.Array(value*))
    
    inline def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    inline def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
  }
}
