package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataResource extends js.Object {
  
  var ga: GaResource = js.native
  
  var mcf: McfResource = js.native
  
  var realtime: RealtimeResource = js.native
}
object DataResource {
  
  @scala.inline
  def apply(ga: GaResource, mcf: McfResource, realtime: RealtimeResource): DataResource = {
    val __obj = js.Dynamic.literal(ga = ga.asInstanceOf[js.Any], mcf = mcf.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResource]
  }
  
  @scala.inline
  implicit class DataResourceOps[Self <: DataResource] (val x: Self) extends AnyVal {
    
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
    def setGa(value: GaResource): Self = this.set("ga", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMcf(value: McfResource): Self = this.set("mcf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtime(value: RealtimeResource): Self = this.set("realtime", value.asInstanceOf[js.Any])
  }
}
