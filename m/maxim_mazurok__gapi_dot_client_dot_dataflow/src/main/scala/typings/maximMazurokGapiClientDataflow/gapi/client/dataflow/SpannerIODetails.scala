package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpannerIODetails extends js.Object {
  
  /** DatabaseId accessed in the connection. */
  var databaseId: js.UndefOr[String] = js.native
  
  /** InstanceId accessed in the connection. */
  var instanceId: js.UndefOr[String] = js.native
  
  /** ProjectId accessed in the connection. */
  var projectId: js.UndefOr[String] = js.native
}
object SpannerIODetails {
  
  @scala.inline
  def apply(): SpannerIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpannerIODetails]
  }
  
  @scala.inline
  implicit class SpannerIODetailsOps[Self <: SpannerIODetails] (val x: Self) extends AnyVal {
    
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
    def setDatabaseId(value: String): Self = this.set("databaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseId: Self = this.set("databaseId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
}
