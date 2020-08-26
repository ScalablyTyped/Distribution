package typings.luminoWidgets.boxpanelMod.BoxPanel

import typings.luminoWidgets.boxlayoutMod.BoxLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a box panel.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The content alignment of the panel.
    *
    * The default is `'start'`.
    */
  var alignment: js.UndefOr[Alignment] = js.native
  /**
    * The layout direction of the panel.
    *
    * The default is `'top-to-bottom'`.
    */
  var direction: js.UndefOr[Direction] = js.native
  /**
    * The box layout to use for the box panel.
    *
    * If this is provided, the other options are ignored.
    *
    * The default is a new `BoxLayout`.
    */
  var layout: js.UndefOr[BoxLayout] = js.native
  /**
    * The spacing between items in the panel.
    *
    * The default is `4`.
    */
  var spacing: js.UndefOr[Double] = js.native
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
    def setAlignment(value: Alignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setLayout(value: BoxLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
  }
  
}

