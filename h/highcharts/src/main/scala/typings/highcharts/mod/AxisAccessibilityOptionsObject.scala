package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisAccessibilityOptionsObject extends js.Object {
  
  /**
    * (Highcharts) Description for an axis to expose to screen reader users.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) Enable axis accessibility features, including axis
    * information in the screen reader information region. If this is disabled
    * on the xAxis, the x values are not exposed to screen readers for the
    * individual data points by default.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Range description for an axis. Overrides the default range
    * description. Set to empty to disable range description for this axis.
    */
  var rangeDescription: js.UndefOr[String] = js.native
}
object AxisAccessibilityOptionsObject {
  
  @scala.inline
  def apply(): AxisAccessibilityOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisAccessibilityOptionsObject]
  }
  
  @scala.inline
  implicit class AxisAccessibilityOptionsObjectOps[Self <: AxisAccessibilityOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setRangeDescription(value: String): Self = this.set("rangeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeDescription: Self = this.set("rangeDescription", js.undefined)
  }
}
