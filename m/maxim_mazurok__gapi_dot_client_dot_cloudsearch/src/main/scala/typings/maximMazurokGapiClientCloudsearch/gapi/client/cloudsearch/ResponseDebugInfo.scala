package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseDebugInfo extends js.Object {
  
  /** General debug info formatted for display. */
  var formattedDebugInfo: js.UndefOr[String] = js.native
}
object ResponseDebugInfo {
  
  @scala.inline
  def apply(): ResponseDebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseDebugInfo]
  }
  
  @scala.inline
  implicit class ResponseDebugInfoOps[Self <: ResponseDebugInfo] (val x: Self) extends AnyVal {
    
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
    def setFormattedDebugInfo(value: String): Self = this.set("formattedDebugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedDebugInfo: Self = this.set("formattedDebugInfo", js.undefined)
  }
}
