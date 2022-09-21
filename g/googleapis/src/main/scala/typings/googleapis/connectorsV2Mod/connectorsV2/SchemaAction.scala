package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAction extends StObject {
  
  /**
    * List containing input parameter metadata.
    */
  var inputParameters: js.UndefOr[js.Array[SchemaInputParameter]] = js.undefined
  
  /**
    * Name of the action.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List containing the metadata of result fields.
    */
  var resultMetadata: js.UndefOr[js.Array[SchemaResultMetadata]] = js.undefined
}
object SchemaAction {
  
  inline def apply(): SchemaAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAction]
  }
  
  extension [Self <: SchemaAction](x: Self) {
    
    inline def setInputParameters(value: js.Array[SchemaInputParameter]): Self = StObject.set(x, "inputParameters", value.asInstanceOf[js.Any])
    
    inline def setInputParametersUndefined: Self = StObject.set(x, "inputParameters", js.undefined)
    
    inline def setInputParametersVarargs(value: SchemaInputParameter*): Self = StObject.set(x, "inputParameters", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResultMetadata(value: js.Array[SchemaResultMetadata]): Self = StObject.set(x, "resultMetadata", value.asInstanceOf[js.Any])
    
    inline def setResultMetadataUndefined: Self = StObject.set(x, "resultMetadata", js.undefined)
    
    inline def setResultMetadataVarargs(value: SchemaResultMetadata*): Self = StObject.set(x, "resultMetadata", js.Array(value*))
  }
}
