package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1BigQueryRoutineSpec extends StObject {
  
  /** Paths of the imported libraries. */
  var importedLibraries: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDatacatalogV1BigQueryRoutineSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1BigQueryRoutineSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1BigQueryRoutineSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1BigQueryRoutineSpec] (val x: Self) extends AnyVal {
    
    inline def setImportedLibraries(value: js.Array[String]): Self = StObject.set(x, "importedLibraries", value.asInstanceOf[js.Any])
    
    inline def setImportedLibrariesUndefined: Self = StObject.set(x, "importedLibraries", js.undefined)
    
    inline def setImportedLibrariesVarargs(value: String*): Self = StObject.set(x, "importedLibraries", js.Array(value*))
  }
}
