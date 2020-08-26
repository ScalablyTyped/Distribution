package typings.luminoWidgets.stackedpanelMod.StackedPanel

import typings.luminoWidgets.stackedlayoutMod.StackedLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a stacked panel.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The stacked layout to use for the stacked panel.
    *
    * The default is a new `StackedLayout`.
    */
  var layout: js.UndefOr[StackedLayout] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setLayout(value: StackedLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
  }
  
}

