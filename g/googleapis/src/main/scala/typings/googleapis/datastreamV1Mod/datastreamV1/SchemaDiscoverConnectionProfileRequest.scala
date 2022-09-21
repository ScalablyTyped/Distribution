package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiscoverConnectionProfileRequest extends StObject {
  
  /**
    * An ad-hoc connection profile configuration.
    */
  var connectionProfile: js.UndefOr[SchemaConnectionProfile] = js.undefined
  
  /**
    * A reference to an existing connection profile.
    */
  var connectionProfileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to retrieve the full hierarchy of data objects (TRUE) or only the current level (FALSE).
    */
  var fullHierarchy: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The number of hierarchy levels below the current level to be retrieved.
    */
  var hierarchyDepth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * MySQL RDBMS to enrich with child data objects and metadata.
    */
  var mysqlRdbms: js.UndefOr[SchemaMysqlRdbms] = js.undefined
  
  /**
    * Oracle RDBMS to enrich with child data objects and metadata.
    */
  var oracleRdbms: js.UndefOr[SchemaOracleRdbms] = js.undefined
}
object SchemaDiscoverConnectionProfileRequest {
  
  inline def apply(): SchemaDiscoverConnectionProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiscoverConnectionProfileRequest]
  }
  
  extension [Self <: SchemaDiscoverConnectionProfileRequest](x: Self) {
    
    inline def setConnectionProfile(value: SchemaConnectionProfile): Self = StObject.set(x, "connectionProfile", value.asInstanceOf[js.Any])
    
    inline def setConnectionProfileName(value: String): Self = StObject.set(x, "connectionProfileName", value.asInstanceOf[js.Any])
    
    inline def setConnectionProfileNameNull: Self = StObject.set(x, "connectionProfileName", null)
    
    inline def setConnectionProfileNameUndefined: Self = StObject.set(x, "connectionProfileName", js.undefined)
    
    inline def setConnectionProfileUndefined: Self = StObject.set(x, "connectionProfile", js.undefined)
    
    inline def setFullHierarchy(value: Boolean): Self = StObject.set(x, "fullHierarchy", value.asInstanceOf[js.Any])
    
    inline def setFullHierarchyNull: Self = StObject.set(x, "fullHierarchy", null)
    
    inline def setFullHierarchyUndefined: Self = StObject.set(x, "fullHierarchy", js.undefined)
    
    inline def setHierarchyDepth(value: Double): Self = StObject.set(x, "hierarchyDepth", value.asInstanceOf[js.Any])
    
    inline def setHierarchyDepthNull: Self = StObject.set(x, "hierarchyDepth", null)
    
    inline def setHierarchyDepthUndefined: Self = StObject.set(x, "hierarchyDepth", js.undefined)
    
    inline def setMysqlRdbms(value: SchemaMysqlRdbms): Self = StObject.set(x, "mysqlRdbms", value.asInstanceOf[js.Any])
    
    inline def setMysqlRdbmsUndefined: Self = StObject.set(x, "mysqlRdbms", js.undefined)
    
    inline def setOracleRdbms(value: SchemaOracleRdbms): Self = StObject.set(x, "oracleRdbms", value.asInstanceOf[js.Any])
    
    inline def setOracleRdbmsUndefined: Self = StObject.set(x, "oracleRdbms", js.undefined)
  }
}
