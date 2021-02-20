package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemStatus extends StObject {
  
  /** Status code. */
  var code: js.UndefOr[String] = js.native
  
  /** Error details in case the item is in ERROR state. */
  var processingErrors: js.UndefOr[js.Array[ProcessingError]] = js.native
  
  /** Repository error reported by connector. */
  var repositoryErrors: js.UndefOr[js.Array[RepositoryError]] = js.native
}
object ItemStatus {
  
  @scala.inline
  def apply(): ItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStatus]
  }
  
  @scala.inline
  implicit class ItemStatusMutableBuilder[Self <: ItemStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setProcessingErrors(value: js.Array[ProcessingError]): Self = StObject.set(x, "processingErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingErrorsUndefined: Self = StObject.set(x, "processingErrors", js.undefined)
    
    @scala.inline
    def setProcessingErrorsVarargs(value: ProcessingError*): Self = StObject.set(x, "processingErrors", js.Array(value :_*))
    
    @scala.inline
    def setRepositoryErrors(value: js.Array[RepositoryError]): Self = StObject.set(x, "repositoryErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryErrorsUndefined: Self = StObject.set(x, "repositoryErrors", js.undefined)
    
    @scala.inline
    def setRepositoryErrorsVarargs(value: RepositoryError*): Self = StObject.set(x, "repositoryErrors", js.Array(value :_*))
  }
}
