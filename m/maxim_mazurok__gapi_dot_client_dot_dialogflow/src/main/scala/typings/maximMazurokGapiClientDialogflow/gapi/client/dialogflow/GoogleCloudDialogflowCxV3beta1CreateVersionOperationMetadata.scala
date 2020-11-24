package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1CreateVersionOperationMetadata extends js.Object {
  
  /** Name of the created version. Format: `projects//locations//agents//flows//versions/`. */
  var version: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowCxV3beta1CreateVersionOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1CreateVersionOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1CreateVersionOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1CreateVersionOperationMetadataOps[Self <: GoogleCloudDialogflowCxV3beta1CreateVersionOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
