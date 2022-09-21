package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1BigQueryRoutineSpec extends StObject {
  
  /**
    * Paths of the imported libraries.
    */
  var importedLibraries: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1BigQueryRoutineSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1BigQueryRoutineSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1BigQueryRoutineSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1BigQueryRoutineSpec](x: Self) {
    
    inline def setImportedLibraries(value: js.Array[String]): Self = StObject.set(x, "importedLibraries", value.asInstanceOf[js.Any])
    
    inline def setImportedLibrariesNull: Self = StObject.set(x, "importedLibraries", null)
    
    inline def setImportedLibrariesUndefined: Self = StObject.set(x, "importedLibraries", js.undefined)
    
    inline def setImportedLibrariesVarargs(value: String*): Self = StObject.set(x, "importedLibraries", js.Array(value*))
  }
}
