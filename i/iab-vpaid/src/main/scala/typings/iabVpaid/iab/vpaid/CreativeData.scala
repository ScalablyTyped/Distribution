package typings.iabVpaid.iab.vpaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creative Data with AdParameters field */
@js.native
trait CreativeData extends js.Object {
  
  var AdParameters: String = js.native
}
object CreativeData {
  
  @scala.inline
  def apply(AdParameters: String): CreativeData = {
    val __obj = js.Dynamic.literal(AdParameters = AdParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeData]
  }
  
  @scala.inline
  implicit class CreativeDataOps[Self <: CreativeData] (val x: Self) extends AnyVal {
    
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
    def setAdParameters(value: String): Self = this.set("AdParameters", value.asInstanceOf[js.Any])
  }
}
