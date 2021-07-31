package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a SQL database on the Cloud SQL instance.
  */
trait SchemaDatabase extends StObject {
  
  /**
    * The MySQL charset value.
    */
  var charset: js.UndefOr[String] = js.undefined
  
  /**
    * The MySQL collation value.
    */
  var collation: js.UndefOr[String] = js.undefined
  
  /**
    * This field is deprecated and will be removed from a future version of the
    * API.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Cloud SQL instance. This does not include the project ID.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * This is always sql#database.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the database in the Cloud SQL instance. This does not include
    * the project ID or instance name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID of the project containing the Cloud SQL database. The
    * Google apps domain is prefixed if applicable.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The URI of this resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaDatabase {
  
  @scala.inline
  def apply(): SchemaDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabase]
  }
  
  @scala.inline
  implicit class SchemaDatabaseMutableBuilder[Self <: SchemaDatabase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    @scala.inline
    def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
