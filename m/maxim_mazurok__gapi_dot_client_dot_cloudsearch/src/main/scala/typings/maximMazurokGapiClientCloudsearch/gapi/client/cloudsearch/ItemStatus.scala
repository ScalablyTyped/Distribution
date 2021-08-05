package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemStatus extends StObject {
  
  /** Status code. */
  var code: js.UndefOr[String] = js.undefined
  
  /** Error details in case the item is in ERROR state. */
  var processingErrors: js.UndefOr[js.Array[ProcessingError]] = js.undefined
  
  /** Repository error reported by connector. */
  var repositoryErrors: js.UndefOr[js.Array[RepositoryError]] = js.undefined
}
object ItemStatus {
  
  inline def apply(): ItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStatus]
  }
  
  extension [Self <: ItemStatus](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setProcessingErrors(value: js.Array[ProcessingError]): Self = StObject.set(x, "processingErrors", value.asInstanceOf[js.Any])
    
    inline def setProcessingErrorsUndefined: Self = StObject.set(x, "processingErrors", js.undefined)
    
    inline def setProcessingErrorsVarargs(value: ProcessingError*): Self = StObject.set(x, "processingErrors", js.Array(value :_*))
    
    inline def setRepositoryErrors(value: js.Array[RepositoryError]): Self = StObject.set(x, "repositoryErrors", value.asInstanceOf[js.Any])
    
    inline def setRepositoryErrorsUndefined: Self = StObject.set(x, "repositoryErrors", js.undefined)
    
    inline def setRepositoryErrorsVarargs(value: RepositoryError*): Self = StObject.set(x, "repositoryErrors", js.Array(value :_*))
  }
}
