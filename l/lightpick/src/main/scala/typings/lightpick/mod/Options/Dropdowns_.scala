package typings.lightpick.mod.Options

import typings.lightpick.mod.Options.Dropdowns.Years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dropdowns_ extends js.Object {
  
  /**
    * true/false for enable/disable dropdown of months.
    */
  var months: js.UndefOr[Boolean] = js.native
  
  /**
    * Can be false for disable dropdown of years.
    */
  var years: js.UndefOr[Boolean | Years] = js.native
}
object Dropdowns_ {
  
  @scala.inline
  def apply(): Dropdowns_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dropdowns_]
  }
  
  @scala.inline
  implicit class Dropdowns_Ops[Self <: Dropdowns_] (val x: Self) extends AnyVal {
    
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
    def setMonths(value: Boolean): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setYears(value: Boolean | Years): Self = this.set("years", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYears: Self = this.set("years", js.undefined)
  }
}
