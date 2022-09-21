package typings.googleapis.gmailpostmastertoolsV1Mod.gmailpostmastertoolsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomain extends StObject {
  
  /**
    * Timestamp when the user registered this domain. Assigned by the server.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the Domain. Domain names have the form `domains/{domain_name\}`, where domain_name is the fully qualified domain name (i.e., mymail.mydomain.com).
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User’s permission for this domain. Assigned by the server.
    */
  var permission: js.UndefOr[String | Null] = js.undefined
}
object SchemaDomain {
  
  inline def apply(): SchemaDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomain]
  }
  
  extension [Self <: SchemaDomain](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionNull: Self = StObject.set(x, "permission", null)
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
