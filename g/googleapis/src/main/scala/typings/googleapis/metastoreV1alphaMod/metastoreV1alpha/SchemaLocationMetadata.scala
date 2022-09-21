package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationMetadata extends StObject {
  
  /**
    * The versions of Hive Metastore that can be used when creating a new metastore service in this location. The server guarantees that exactly one HiveMetastoreVersion in the list will set is_default.
    */
  var supportedHiveMetastoreVersions: js.UndefOr[js.Array[SchemaHiveMetastoreVersion]] = js.undefined
}
object SchemaLocationMetadata {
  
  inline def apply(): SchemaLocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationMetadata]
  }
  
  extension [Self <: SchemaLocationMetadata](x: Self) {
    
    inline def setSupportedHiveMetastoreVersions(value: js.Array[SchemaHiveMetastoreVersion]): Self = StObject.set(x, "supportedHiveMetastoreVersions", value.asInstanceOf[js.Any])
    
    inline def setSupportedHiveMetastoreVersionsUndefined: Self = StObject.set(x, "supportedHiveMetastoreVersions", js.undefined)
    
    inline def setSupportedHiveMetastoreVersionsVarargs(value: SchemaHiveMetastoreVersion*): Self = StObject.set(x, "supportedHiveMetastoreVersions", js.Array(value*))
  }
}
