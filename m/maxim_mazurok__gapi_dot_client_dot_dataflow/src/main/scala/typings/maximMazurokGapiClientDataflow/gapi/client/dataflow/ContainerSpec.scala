package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerSpec extends StObject {
  
  /** Default runtime environment for the job. */
  var defaultEnvironment: js.UndefOr[FlexTemplateRuntimeEnvironment] = js.undefined
  
  /** Name of the docker container image. E.g., gcr.io/project/some-image */
  var image: js.UndefOr[String] = js.undefined
  
  /** Metadata describing a template including description and validation rules. */
  var metadata: js.UndefOr[TemplateMetadata] = js.undefined
  
  /** Required. SDK info of the Flex Template. */
  var sdkInfo: js.UndefOr[SDKInfo] = js.undefined
}
object ContainerSpec {
  
  @scala.inline
  def apply(): ContainerSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerSpec]
  }
  
  @scala.inline
  implicit class ContainerSpecMutableBuilder[Self <: ContainerSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultEnvironment(value: FlexTemplateRuntimeEnvironment): Self = StObject.set(x, "defaultEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEnvironmentUndefined: Self = StObject.set(x, "defaultEnvironment", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setMetadata(value: TemplateMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSdkInfo(value: SDKInfo): Self = StObject.set(x, "sdkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkInfoUndefined: Self = StObject.set(x, "sdkInfo", js.undefined)
  }
}
