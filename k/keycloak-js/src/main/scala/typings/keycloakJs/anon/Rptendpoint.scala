package typings.keycloakJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rptendpoint extends js.Object {
  
  var rpt_endpoint: String = js.native
}
object Rptendpoint {
  
  @scala.inline
  def apply(rpt_endpoint: String): Rptendpoint = {
    val __obj = js.Dynamic.literal(rpt_endpoint = rpt_endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rptendpoint]
  }
  
  @scala.inline
  implicit class RptendpointOps[Self <: Rptendpoint] (val x: Self) extends AnyVal {
    
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
    def setRpt_endpoint(value: String): Self = this.set("rpt_endpoint", value.asInstanceOf[js.Any])
  }
}
