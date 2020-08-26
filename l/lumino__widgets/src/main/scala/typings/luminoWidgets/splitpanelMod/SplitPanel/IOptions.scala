package typings.luminoWidgets.splitpanelMod.SplitPanel

import typings.luminoWidgets.splitlayoutMod.SplitLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a split panel.
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
    * The split layout to use for the split panel.
    *
    * If this is provided, the other options are ignored.
    *
    * The default is a new `SplitLayout`.
    */
  var layout: js.UndefOr[SplitLayout] = js.native
  /**
    * The layout orientation of the panel.
    *
    * The default is `'horizontal'`.
    */
  var orientation: js.UndefOr[Orientation] = js.native
  /**
    * The renderer to use for the split panel.
    *
    * The default is a shared renderer instance.
    */
  var renderer: js.UndefOr[IRenderer] = js.native
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
    def setLayout(value: SplitLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setOrientation(value: Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setRenderer(value: IRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
  }
  
}

