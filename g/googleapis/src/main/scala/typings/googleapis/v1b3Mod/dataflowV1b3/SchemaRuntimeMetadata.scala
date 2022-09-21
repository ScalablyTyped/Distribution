package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRuntimeMetadata extends StObject {
  
  /**
    * The parameters for the template.
    */
  var parameters: js.UndefOr[js.Array[SchemaParameterMetadata]] = js.undefined
  
  /**
    * SDK Info for the template.
    */
  var sdkInfo: js.UndefOr[SchemaSDKInfo] = js.undefined
}
object SchemaRuntimeMetadata {
  
  inline def apply(): SchemaRuntimeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeMetadata]
  }
  
  extension [Self <: SchemaRuntimeMetadata](x: Self) {
    
    inline def setParameters(value: js.Array[SchemaParameterMetadata]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaParameterMetadata*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setSdkInfo(value: SchemaSDKInfo): Self = StObject.set(x, "sdkInfo", value.asInstanceOf[js.Any])
    
    inline def setSdkInfoUndefined: Self = StObject.set(x, "sdkInfo", js.undefined)
  }
}
