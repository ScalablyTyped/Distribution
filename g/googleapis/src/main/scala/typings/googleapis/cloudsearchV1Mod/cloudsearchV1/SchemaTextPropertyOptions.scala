package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextPropertyOptions extends StObject {
  
  /**
    * If set, describes how the property should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaTextOperatorOptions] = js.undefined
  
  /**
    * Indicates the search quality importance of the tokens within the field when used for retrieval.
    */
  var retrievalImportance: js.UndefOr[SchemaRetrievalImportance] = js.undefined
}
object SchemaTextPropertyOptions {
  
  inline def apply(): SchemaTextPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextPropertyOptions]
  }
  
  extension [Self <: SchemaTextPropertyOptions](x: Self) {
    
    inline def setOperatorOptions(value: SchemaTextOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    inline def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
    
    inline def setRetrievalImportance(value: SchemaRetrievalImportance): Self = StObject.set(x, "retrievalImportance", value.asInstanceOf[js.Any])
    
    inline def setRetrievalImportanceUndefined: Self = StObject.set(x, "retrievalImportance", js.undefined)
  }
}
