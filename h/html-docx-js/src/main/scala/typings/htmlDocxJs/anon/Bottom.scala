package typings.htmlDocxJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bottom extends js.Object {
  /** The bottom page margin (default: 1440). */
  var bottom: js.UndefOr[Double] = js.native
  /** The margin for the footer (default: 720). */
  var footer: js.UndefOr[Double] = js.native
  /** The margin for the gutter (default: 0). */
  var gutter: js.UndefOr[Double] = js.native
  /** The margin for the header (default: 720). */
  var header: js.UndefOr[Double] = js.native
  /** The left page margin (default: 1440). */
  var left: js.UndefOr[Double] = js.native
  /** The right page margin (default: 1440). */
  var right: js.UndefOr[Double] = js.native
  /** The top page margin (default: 1440, i.e. 2.54 cm). */
  var top: js.UndefOr[Double] = js.native
}

object Bottom {
  @scala.inline
  def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  @scala.inline
  implicit class BottomOps[Self <: Bottom] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setFooter(value: Double): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    @scala.inline
    def setHeader(value: Double): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

