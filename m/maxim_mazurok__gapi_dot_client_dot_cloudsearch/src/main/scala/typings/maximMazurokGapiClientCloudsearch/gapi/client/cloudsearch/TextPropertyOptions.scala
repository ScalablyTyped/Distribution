package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextPropertyOptions extends StObject {
  
  /** If set, describes how the property should be used as a search operator. */
  var operatorOptions: js.UndefOr[TextOperatorOptions] = js.undefined
  
  /** Indicates the search quality importance of the tokens within the field when used for retrieval. */
  var retrievalImportance: js.UndefOr[RetrievalImportance] = js.undefined
}
object TextPropertyOptions {
  
  inline def apply(): TextPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPropertyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextPropertyOptions] (val x: Self) extends AnyVal {
    
    inline def setOperatorOptions(value: TextOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    inline def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
    
    inline def setRetrievalImportance(value: RetrievalImportance): Self = StObject.set(x, "retrievalImportance", value.asInstanceOf[js.Any])
    
    inline def setRetrievalImportanceUndefined: Self = StObject.set(x, "retrievalImportance", js.undefined)
  }
}
