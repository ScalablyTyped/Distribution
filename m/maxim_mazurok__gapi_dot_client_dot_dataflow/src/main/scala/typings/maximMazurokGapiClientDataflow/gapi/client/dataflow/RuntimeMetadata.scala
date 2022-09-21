package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeMetadata extends StObject {
  
  /** The parameters for the template. */
  var parameters: js.UndefOr[js.Array[ParameterMetadata]] = js.undefined
  
  /** SDK Info for the template. */
  var sdkInfo: js.UndefOr[SDKInfo] = js.undefined
}
object RuntimeMetadata {
  
  inline def apply(): RuntimeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeMetadata]
  }
  
  extension [Self <: RuntimeMetadata](x: Self) {
    
    inline def setParameters(value: js.Array[ParameterMetadata]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: ParameterMetadata*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setSdkInfo(value: SDKInfo): Self = StObject.set(x, "sdkInfo", value.asInstanceOf[js.Any])
    
    inline def setSdkInfoUndefined: Self = StObject.set(x, "sdkInfo", js.undefined)
  }
}
