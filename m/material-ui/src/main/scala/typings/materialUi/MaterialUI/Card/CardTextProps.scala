package typings.materialUi.MaterialUI.Card

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardTextProps extends js.Object {
  var actAsExpander: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var expandable: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object CardTextProps {
  @scala.inline
  def apply(): CardTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardTextProps]
  }
  @scala.inline
  implicit class CardTextPropsOps[Self <: CardTextProps] (val x: Self) extends AnyVal {
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
    def setActAsExpander(value: Boolean): Self = this.set("actAsExpander", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActAsExpander: Self = this.set("actAsExpander", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

