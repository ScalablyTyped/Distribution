package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1GcsFolderDestination extends StObject {
  
  /** Required. Cloud Storage directory to export data to. */
  var outputFolderUri: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1GcsFolderDestination {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1GcsFolderDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1GcsFolderDestination]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1GcsFolderDestinationMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1GcsFolderDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputFolderUri(value: String): Self = StObject.set(x, "outputFolderUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFolderUriUndefined: Self = StObject.set(x, "outputFolderUri", js.undefined)
  }
}
