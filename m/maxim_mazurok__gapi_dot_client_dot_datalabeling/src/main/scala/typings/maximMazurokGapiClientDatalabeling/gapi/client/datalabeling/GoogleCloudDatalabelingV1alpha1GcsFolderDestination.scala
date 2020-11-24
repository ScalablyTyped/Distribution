package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1alpha1GcsFolderDestination extends js.Object {
  
  /** Required. Cloud Storage directory to export data to. */
  var outputFolderUri: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1alpha1GcsFolderDestination {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1alpha1GcsFolderDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1alpha1GcsFolderDestination]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1alpha1GcsFolderDestinationOps[Self <: GoogleCloudDatalabelingV1alpha1GcsFolderDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOutputFolderUri(value: String): Self = this.set("outputFolderUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFolderUri: Self = this.set("outputFolderUri", js.undefined)
  }
}
