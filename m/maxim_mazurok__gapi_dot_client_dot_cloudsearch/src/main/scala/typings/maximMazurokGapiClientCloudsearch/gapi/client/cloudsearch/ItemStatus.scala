package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemStatus extends js.Object {
  
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
  implicit class ItemStatusOps[Self <: ItemStatus] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setProcessingErrorsVarargs(value: ProcessingError*): Self = this.set("processingErrors", js.Array(value :_*))
    
    @scala.inline
    def setProcessingErrors(value: js.Array[ProcessingError]): Self = this.set("processingErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingErrors: Self = this.set("processingErrors", js.undefined)
    
    @scala.inline
    def setRepositoryErrorsVarargs(value: RepositoryError*): Self = this.set("repositoryErrors", js.Array(value :_*))
    
    @scala.inline
    def setRepositoryErrors(value: js.Array[RepositoryError]): Self = this.set("repositoryErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryErrors: Self = this.set("repositoryErrors", js.undefined)
  }
}
