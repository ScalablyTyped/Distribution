package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRuntimeActionSchema extends StObject {
  
  /**
    * Output only. Name of the action.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. List of input parameter metadata for the action.
    */
  var inputParameters: js.UndefOr[js.Array[SchemaInputParameter]] = js.undefined
  
  /**
    * Output only. List of result field metadata.
    */
  var resultMetadata: js.UndefOr[js.Array[SchemaResultMetadata]] = js.undefined
}
object SchemaRuntimeActionSchema {
  
  inline def apply(): SchemaRuntimeActionSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeActionSchema]
  }
  
  extension [Self <: SchemaRuntimeActionSchema](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setInputParameters(value: js.Array[SchemaInputParameter]): Self = StObject.set(x, "inputParameters", value.asInstanceOf[js.Any])
    
    inline def setInputParametersUndefined: Self = StObject.set(x, "inputParameters", js.undefined)
    
    inline def setInputParametersVarargs(value: SchemaInputParameter*): Self = StObject.set(x, "inputParameters", js.Array(value*))
    
    inline def setResultMetadata(value: js.Array[SchemaResultMetadata]): Self = StObject.set(x, "resultMetadata", value.asInstanceOf[js.Any])
    
    inline def setResultMetadataUndefined: Self = StObject.set(x, "resultMetadata", js.undefined)
    
    inline def setResultMetadataVarargs(value: SchemaResultMetadata*): Self = StObject.set(x, "resultMetadata", js.Array(value*))
  }
}
