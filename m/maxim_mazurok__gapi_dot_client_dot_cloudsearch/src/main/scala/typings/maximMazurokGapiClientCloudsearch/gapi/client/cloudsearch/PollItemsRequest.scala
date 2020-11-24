package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PollItemsRequest extends js.Object {
  
  /** Name of connector making this call. Format: datasources/{source_id}/connectors/{ID} */
  var connectorName: js.UndefOr[String] = js.native
  
  /** Common debug options. */
  var debugOptions: js.UndefOr[DebugOptions] = js.native
  
  /** Maximum number of items to return. The maximum value is 100 and the default value is 20. */
  var limit: js.UndefOr[Double] = js.native
  
  /** Queue name to fetch items from. If unspecified, PollItems will fetch from 'default' queue. The maximum length is 100 characters. */
  var queue: js.UndefOr[String] = js.native
  
  /** Limit the items polled to the ones with these statuses. */
  var statusCodes: js.UndefOr[js.Array[String]] = js.native
}
object PollItemsRequest {
  
  @scala.inline
  def apply(): PollItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollItemsRequest]
  }
  
  @scala.inline
  implicit class PollItemsRequestOps[Self <: PollItemsRequest] (val x: Self) extends AnyVal {
    
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
    def setConnectorName(value: String): Self = this.set("connectorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorName: Self = this.set("connectorName", js.undefined)
    
    @scala.inline
    def setDebugOptions(value: DebugOptions): Self = this.set("debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugOptions: Self = this.set("debugOptions", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    
    @scala.inline
    def setStatusCodesVarargs(value: String*): Self = this.set("statusCodes", js.Array(value :_*))
    
    @scala.inline
    def setStatusCodes(value: js.Array[String]): Self = this.set("statusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCodes: Self = this.set("statusCodes", js.undefined)
  }
}
