package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesPackedBubbleDataLabelsTextPathOptionsObject extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable `textPath`
    * option for link's or marker's data labels.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object SeriesPackedBubbleDataLabelsTextPathOptionsObject {
  
  @scala.inline
  def apply(): SeriesPackedBubbleDataLabelsTextPathOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsTextPathOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesPackedBubbleDataLabelsTextPathOptionsObjectOps[Self <: SeriesPackedBubbleDataLabelsTextPathOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
}
