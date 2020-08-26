package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolOptionsObject extends js.Object {
  /**
    * The anchor X position for the `callout` symbol. This is where the chevron
    * points to.
    */
  var anchorX: js.UndefOr[Double] = js.native
  /**
    * The anchor Y position for the `callout` symbol. This is where the chevron
    * points to.
    */
  var anchorY: js.UndefOr[Double] = js.native
  /**
    * The end angle of an `arc` symbol.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * Whether to draw `arc` symbol open or closed.
    */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * The radius of an `arc` symbol, or the border radius for the `callout`
    * symbol.
    */
  var r: js.UndefOr[Double] = js.native
  /**
    * Whether to draw rounded edges.
    */
  var rounded: js.UndefOr[Boolean] = js.native
  /**
    * The start angle of an `arc` symbol.
    */
  var start: js.UndefOr[Double] = js.native
}

object SymbolOptionsObject {
  @scala.inline
  def apply(): SymbolOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolOptionsObject]
  }
  @scala.inline
  implicit class SymbolOptionsObjectOps[Self <: SymbolOptionsObject] (val x: Self) extends AnyVal {
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
    def setAnchorX(value: Double): Self = this.set("anchorX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorX: Self = this.set("anchorX", js.undefined)
    @scala.inline
    def setAnchorY(value: Double): Self = this.set("anchorY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorY: Self = this.set("anchorY", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setRounded(value: Boolean): Self = this.set("rounded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

