package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to lease WorkItems.
  */
@js.native
trait SchemaLeaseWorkItemResponse extends js.Object {
  /**
    * Untranslated bag-of-bytes WorkResponse for UnifiedWorker.
    */
  var unifiedWorkerResponse: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * A list of the leased WorkItems.
    */
  var workItems: js.UndefOr[js.Array[SchemaWorkItem]] = js.native
}

object SchemaLeaseWorkItemResponse {
  @scala.inline
  def apply(): SchemaLeaseWorkItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseWorkItemResponse]
  }
  @scala.inline
  implicit class SchemaLeaseWorkItemResponseOps[Self <: SchemaLeaseWorkItemResponse] (val x: Self) extends AnyVal {
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
    def setUnifiedWorkerResponse(value: StringDictionary[js.Any]): Self = this.set("unifiedWorkerResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnifiedWorkerResponse: Self = this.set("unifiedWorkerResponse", js.undefined)
    @scala.inline
    def setWorkItemsVarargs(value: SchemaWorkItem*): Self = this.set("workItems", js.Array(value :_*))
    @scala.inline
    def setWorkItems(value: js.Array[SchemaWorkItem]): Self = this.set("workItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkItems: Self = this.set("workItems", js.undefined)
  }
  
}

