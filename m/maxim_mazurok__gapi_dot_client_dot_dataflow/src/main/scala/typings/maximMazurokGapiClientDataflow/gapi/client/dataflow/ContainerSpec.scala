package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerSpec extends js.Object {
  
  /** Default runtime environment for the job. */
  var defaultEnvironment: js.UndefOr[FlexTemplateRuntimeEnvironment] = js.native
  
  /** Name of the docker container image. E.g., gcr.io/project/some-image */
  var image: js.UndefOr[String] = js.native
  
  /** Metadata describing a template including description and validation rules. */
  var metadata: js.UndefOr[TemplateMetadata] = js.native
  
  /** Required. SDK info of the Flex Template. */
  var sdkInfo: js.UndefOr[SDKInfo] = js.native
}
object ContainerSpec {
  
  @scala.inline
  def apply(): ContainerSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerSpec]
  }
  
  @scala.inline
  implicit class ContainerSpecOps[Self <: ContainerSpec] (val x: Self) extends AnyVal {
    
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
    def setDefaultEnvironment(value: FlexTemplateRuntimeEnvironment): Self = this.set("defaultEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEnvironment: Self = this.set("defaultEnvironment", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setMetadata(value: TemplateMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setSdkInfo(value: SDKInfo): Self = this.set("sdkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkInfo: Self = this.set("sdkInfo", js.undefined)
  }
}
