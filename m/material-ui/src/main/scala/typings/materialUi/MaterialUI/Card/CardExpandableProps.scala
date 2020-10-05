package typings.materialUi.MaterialUI.Card

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardExpandableProps extends js.Object {
  var expanded: js.UndefOr[Boolean] = js.native
  var onExpanding: js.UndefOr[js.Function1[/* isExpanded */ Boolean, Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object CardExpandableProps {
  @scala.inline
  def apply(): CardExpandableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardExpandableProps]
  }
  @scala.inline
  implicit class CardExpandablePropsOps[Self <: CardExpandableProps] (val x: Self) extends AnyVal {
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
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setOnExpanding(value: /* isExpanded */ Boolean => Unit): Self = this.set("onExpanding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExpanding: Self = this.set("onExpanding", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

