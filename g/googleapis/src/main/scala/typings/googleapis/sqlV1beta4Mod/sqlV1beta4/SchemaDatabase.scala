package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatabase extends StObject {
  
  /**
    * The Cloud SQL charset value.
    */
  var charset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Cloud SQL collation value.
    */
  var collation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field is deprecated and will be removed from a future version of the API.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the Cloud SQL instance. This does not include the project ID.
    */
  var instance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always *sql#database*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the database in the Cloud SQL instance. This does not include the project ID or instance name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project ID of the project containing the Cloud SQL database. The Google apps domain is prefixed if applicable.
    */
  var project: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI of this resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  var sqlserverDatabaseDetails: js.UndefOr[SchemaSqlServerDatabaseDetails] = js.undefined
}
object SchemaDatabase {
  
  inline def apply(): SchemaDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabase]
  }
  
  extension [Self <: SchemaDatabase](x: Self) {
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetNull: Self = StObject.set(x, "charset", null)
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationNull: Self = StObject.set(x, "collation", null)
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSqlserverDatabaseDetails(value: SchemaSqlServerDatabaseDetails): Self = StObject.set(x, "sqlserverDatabaseDetails", value.asInstanceOf[js.Any])
    
    inline def setSqlserverDatabaseDetailsUndefined: Self = StObject.set(x, "sqlserverDatabaseDetails", js.undefined)
  }
}
