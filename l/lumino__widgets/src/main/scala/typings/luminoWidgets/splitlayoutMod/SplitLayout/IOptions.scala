package typings.luminoWidgets.splitlayoutMod.SplitLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a split layout.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The content alignment of the layout.
    *
    * The default is `'start'`.
    */
  var alignment: js.UndefOr[Alignment] = js.native
  /**
    * The orientation of the layout.
    *
    * The default is `'horizontal'`.
    */
  var orientation: js.UndefOr[Orientation] = js.native
  /**
    * The renderer to use for the split layout.
    */
  var renderer: IRenderer = js.native
  /**
    * The spacing between items in the layout.
    *
    * The default is `4`.
    */
  var spacing: js.UndefOr[Double] = js.native
}

object IOptions {
  @scala.inline
  def apply(renderer: IRenderer): IOptions = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
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
    def setRenderer(value: IRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlignment(value: Alignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setOrientation(value: Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
  }
  
}

