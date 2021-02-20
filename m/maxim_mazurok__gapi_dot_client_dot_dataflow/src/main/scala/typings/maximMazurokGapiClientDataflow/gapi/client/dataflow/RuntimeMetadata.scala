package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeMetadata extends StObject {
  
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
  implicit class RuntimeMetadataMutableBuilder[Self <: RuntimeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: js.Array[ParameterMetadata]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ParameterMetadata*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setSdkInfo(value: SDKInfo): Self = StObject.set(x, "sdkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkInfoUndefined: Self = StObject.set(x, "sdkInfo", js.undefined)
  }
}
