package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusinessDayConfig extends js.Object {
  
  /** Regular business days. May not be empty. */
  var businessDays: js.UndefOr[js.Array[String]] = js.native
}
object BusinessDayConfig {
  
  @scala.inline
  def apply(): BusinessDayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessDayConfig]
  }
  
  @scala.inline
  implicit class BusinessDayConfigOps[Self <: BusinessDayConfig] (val x: Self) extends AnyVal {
    
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
    def setBusinessDaysVarargs(value: String*): Self = this.set("businessDays", js.Array(value :_*))
    
    @scala.inline
    def setBusinessDays(value: js.Array[String]): Self = this.set("businessDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessDays: Self = this.set("businessDays", js.undefined)
  }
}
