package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1alpha1GcsFolderDestination extends StObject {
  
  /** Required. Cloud Storage directory to export data to. */
  var outputFolderUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1alpha1GcsFolderDestination {
  
  inline def apply(): GoogleCloudDatalabelingV1alpha1GcsFolderDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1alpha1GcsFolderDestination]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1alpha1GcsFolderDestination](x: Self) {
    
    inline def setOutputFolderUri(value: String): Self = StObject.set(x, "outputFolderUri", value.asInstanceOf[js.Any])
    
    inline def setOutputFolderUriUndefined: Self = StObject.set(x, "outputFolderUri", js.undefined)
  }
}
