package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUser extends StObject {
  
  /**
    * This field is deprecated and will be removed from a future version of the API.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The host name from which the user can connect. For *insert* operations, host defaults to an empty string. For *update* operations, host is specified as part of the request URL. The host name cannot be updated after insertion.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the Cloud SQL instance. This does not include the project ID. Can be omitted for *update* since it is already specified on the URL.
    */
  var instance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always *sql#user*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the user in the Cloud SQL instance. Can be omitted for *update* since it is already specified in the URL.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The password for the user.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project ID of the project containing the Cloud SQL database. The Google apps domain is prefixed if applicable. Can be omitted for *update* since it is already specified on the URL.
    */
  var project: js.UndefOr[String | Null] = js.undefined
  
  var sqlserverUserDetails: js.UndefOr[SchemaSqlServerUserDetails] = js.undefined
  
  /**
    * The user type. It determines the method to authenticate the user during login. The default is the database&#39;s built-in user type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaUser {
  
  inline def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  extension [Self <: SchemaUser](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setSqlserverUserDetails(value: SchemaSqlServerUserDetails): Self = StObject.set(x, "sqlserverUserDetails", value.asInstanceOf[js.Any])
    
    inline def setSqlserverUserDetailsUndefined: Self = StObject.set(x, "sqlserverUserDetails", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
