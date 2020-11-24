package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeMetadata extends js.Object {
  
  /** The parameters for the template. */
  var parameters: js.UndefOr[js.Array[ParameterMetadata]] = js.native
  
  /** SDK Info for the template. */
  var sdkInfo: js.UndefOr[SDKInfo] = js.native
}
object RuntimeMetadata {
  
  @scala.inline
  def apply(): RuntimeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeMetadata]
  }
  
  @scala.inline
  implicit class RuntimeMetadataOps[Self <: RuntimeMetadata] (val x: Self) extends AnyVal {
    
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
    def setParametersVarargs(value: ParameterMetadata*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[ParameterMetadata]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setSdkInfo(value: SDKInfo): Self = this.set("sdkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkInfo: Self = this.set("sdkInfo", js.undefined)
  }
}
