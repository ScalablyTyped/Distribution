package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDicomFilterConfig extends StObject {
  
  /**
    * The Cloud Storage location of the filter configuration file. The `gcs_uri` must be in the format `gs://bucket/path/to/object`. The filter configuration file must contain a list of resource paths separated by newline characters (\n or \r\n). Each resource path must be in the format "/studies/{studyUID\}[/series/{seriesUID\}[/instances/{instanceUID\}]]" The Cloud Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for this Cloud Storage location.
    */
  var resourcePathsGcsUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaDicomFilterConfig {
  
  inline def apply(): SchemaDicomFilterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDicomFilterConfig]
  }
  
  extension [Self <: SchemaDicomFilterConfig](x: Self) {
    
    inline def setResourcePathsGcsUri(value: String): Self = StObject.set(x, "resourcePathsGcsUri", value.asInstanceOf[js.Any])
    
    inline def setResourcePathsGcsUriNull: Self = StObject.set(x, "resourcePathsGcsUri", null)
    
    inline def setResourcePathsGcsUriUndefined: Self = StObject.set(x, "resourcePathsGcsUri", js.undefined)
  }
}
