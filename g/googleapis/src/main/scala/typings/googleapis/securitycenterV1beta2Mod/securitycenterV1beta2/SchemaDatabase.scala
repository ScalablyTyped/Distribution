package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatabase extends StObject {
  
  /**
    * The human readable name of the database the user connected to.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target usernames/roles/groups of a SQL privilege grant (not an IAM policy change).
    */
  var grantees: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The full resource name of the database the user connected to, if it is supported by CAI. (https://google.aip.dev/122#full-resource-names)
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The SQL statement associated with the relevant access.
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The username used to connect to the DB. This may not necessarily be an IAM principal, and has no required format.
    */
  var userName: js.UndefOr[String | Null] = js.undefined
}
object SchemaDatabase {
  
  inline def apply(): SchemaDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabase]
  }
  
  extension [Self <: SchemaDatabase](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGrantees(value: js.Array[String]): Self = StObject.set(x, "grantees", value.asInstanceOf[js.Any])
    
    inline def setGranteesNull: Self = StObject.set(x, "grantees", null)
    
    inline def setGranteesUndefined: Self = StObject.set(x, "grantees", js.undefined)
    
    inline def setGranteesVarargs(value: String*): Self = StObject.set(x, "grantees", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
