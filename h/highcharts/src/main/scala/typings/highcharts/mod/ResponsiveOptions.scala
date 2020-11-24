package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A set of rules for responsive
    * settings. The rules are executed from the top down.
    */
  var rules: js.UndefOr[js.Array[ResponsiveRulesOptions]] = js.native
}
object ResponsiveOptions {
  
  @scala.inline
  def apply(): ResponsiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveOptions]
  }
  
  @scala.inline
  implicit class ResponsiveOptionsOps[Self <: ResponsiveOptions] (val x: Self) extends AnyVal {
    
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
    def setRulesVarargs(value: ResponsiveRulesOptions*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[ResponsiveRulesOptions]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
}
