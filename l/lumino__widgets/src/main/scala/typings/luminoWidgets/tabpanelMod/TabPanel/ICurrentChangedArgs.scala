package typings.luminoWidgets.tabpanelMod.TabPanel

import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `currentChanged` signal.
  */
@js.native
trait ICurrentChangedArgs extends js.Object {
  /**
    * The currently selected index.
    */
  var currentIndex: Double = js.native
  /**
    * The currently selected widget.
    */
  var currentWidget: Widget | Null = js.native
  /**
    * The previously selected index.
    */
  var previousIndex: Double = js.native
  /**
    * The previously selected widget.
    */
  var previousWidget: Widget | Null = js.native
}

object ICurrentChangedArgs {
  @scala.inline
  def apply(currentIndex: Double, previousIndex: Double): ICurrentChangedArgs = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentChangedArgs]
  }
  @scala.inline
  implicit class ICurrentChangedArgsOps[Self <: ICurrentChangedArgs] (val x: Self) extends AnyVal {
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
    def setCurrentIndex(value: Double): Self = this.set("currentIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousIndex(value: Double): Self = this.set("previousIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentWidget(value: Widget): Self = this.set("currentWidget", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentWidgetNull: Self = this.set("currentWidget", null)
    @scala.inline
    def setPreviousWidget(value: Widget): Self = this.set("previousWidget", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousWidgetNull: Self = this.set("previousWidget", null)
  }
  
}

