package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHiveMetastoreVersion extends StObject {
  
  /**
    * Whether version will be chosen by the server if a metastore service is created with a HiveMetastoreConfig that omits the version.
    */
  var isDefault: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The semantic version of the Hive Metastore software.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaHiveMetastoreVersion {
  
  inline def apply(): SchemaHiveMetastoreVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHiveMetastoreVersion]
  }
  
  extension [Self <: SchemaHiveMetastoreVersion](x: Self) {
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
