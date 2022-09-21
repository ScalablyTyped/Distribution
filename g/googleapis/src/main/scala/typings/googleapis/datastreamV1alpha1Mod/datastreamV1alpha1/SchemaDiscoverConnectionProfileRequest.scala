package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiscoverConnectionProfileRequest extends StObject {
  
  /**
    * An ad-hoc ConnectionProfile configuration.
    */
  var connectionProfile: js.UndefOr[SchemaConnectionProfile] = js.undefined
  
  /**
    * A reference to an existing ConnectionProfile.
    */
  var connectionProfileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * MySQL RDBMS to enrich with child data objects and metadata.
    */
  var mysqlRdbms: js.UndefOr[SchemaMysqlRdbms] = js.undefined
  
  /**
    * Oracle RDBMS to enrich with child data objects and metadata.
    */
  var oracleRdbms: js.UndefOr[SchemaOracleRdbms] = js.undefined
  
  /**
    * The number of hierarchy levels below the current level to be retrieved.
    */
  var recursionDepth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether to retrieve the full hierarchy of data objects (TRUE) or only the current level (FALSE).
    */
  var recursive: js.UndefOr[Boolean | Null] = js.undefined
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
    
    inline def setMysqlRdbms(value: SchemaMysqlRdbms): Self = StObject.set(x, "mysqlRdbms", value.asInstanceOf[js.Any])
    
    inline def setMysqlRdbmsUndefined: Self = StObject.set(x, "mysqlRdbms", js.undefined)
    
    inline def setOracleRdbms(value: SchemaOracleRdbms): Self = StObject.set(x, "oracleRdbms", value.asInstanceOf[js.Any])
    
    inline def setOracleRdbmsUndefined: Self = StObject.set(x, "oracleRdbms", js.undefined)
    
    inline def setRecursionDepth(value: Double): Self = StObject.set(x, "recursionDepth", value.asInstanceOf[js.Any])
    
    inline def setRecursionDepthNull: Self = StObject.set(x, "recursionDepth", null)
    
    inline def setRecursionDepthUndefined: Self = StObject.set(x, "recursionDepth", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveNull: Self = StObject.set(x, "recursive", null)
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
