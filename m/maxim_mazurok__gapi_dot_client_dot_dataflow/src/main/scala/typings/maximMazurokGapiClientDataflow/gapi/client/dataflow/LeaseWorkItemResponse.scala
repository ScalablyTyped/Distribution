package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaseWorkItemResponse extends js.Object {
  
  /** Untranslated bag-of-bytes WorkResponse for UnifiedWorker. */
  var unifiedWorkerResponse: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LeaseWorkItemResponse with TopLevel[js.Any]
  ] = js.native
  
  /** A list of the leased WorkItems. */
  var workItems: js.UndefOr[js.Array[WorkItem]] = js.native
}
object LeaseWorkItemResponse {
  
  @scala.inline
  def apply(): LeaseWorkItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseWorkItemResponse]
  }
  
  @scala.inline
  implicit class LeaseWorkItemResponseOps[Self <: LeaseWorkItemResponse] (val x: Self) extends AnyVal {
    
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
    def setUnifiedWorkerResponse(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LeaseWorkItemResponse with TopLevel[js.Any]
    ): Self = this.set("unifiedWorkerResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnifiedWorkerResponse: Self = this.set("unifiedWorkerResponse", js.undefined)
    
    @scala.inline
    def setWorkItemsVarargs(value: WorkItem*): Self = this.set("workItems", js.Array(value :_*))
    
    @scala.inline
    def setWorkItems(value: js.Array[WorkItem]): Self = this.set("workItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkItems: Self = this.set("workItems", js.undefined)
  }
}
