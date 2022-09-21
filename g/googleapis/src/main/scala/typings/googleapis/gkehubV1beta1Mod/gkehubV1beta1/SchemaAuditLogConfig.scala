package typings.googleapis.gkehubV1beta1Mod.gkehubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuditLogConfig extends StObject {
  
  /**
    * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
    */
  var exemptedMembers: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The log type that this config enables.
    */
  var logType: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuditLogConfig {
  
  inline def apply(): SchemaAuditLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditLogConfig]
  }
  
  extension [Self <: SchemaAuditLogConfig](x: Self) {
    
    inline def setExemptedMembers(value: js.Array[String]): Self = StObject.set(x, "exemptedMembers", value.asInstanceOf[js.Any])
    
    inline def setExemptedMembersNull: Self = StObject.set(x, "exemptedMembers", null)
    
    inline def setExemptedMembersUndefined: Self = StObject.set(x, "exemptedMembers", js.undefined)
    
    inline def setExemptedMembersVarargs(value: String*): Self = StObject.set(x, "exemptedMembers", js.Array(value*))
    
    inline def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    inline def setLogTypeNull: Self = StObject.set(x, "logType", null)
    
    inline def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
  }
}
