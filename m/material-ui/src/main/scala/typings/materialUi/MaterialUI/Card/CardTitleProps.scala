package typings.materialUi.MaterialUI.Card

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardTitleProps extends js.Object {
  var actAsExpander: js.UndefOr[Boolean] = js.native
  var expandable: js.UndefOr[Boolean] = js.native
  var showExpandableButton: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var subtitle: js.UndefOr[ReactNode] = js.native
  var subtitleColor: js.UndefOr[String] = js.native
  var subtitleStyle: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[ReactNode] = js.native
  var titleColor: js.UndefOr[String] = js.native
  var titleStyle: js.UndefOr[CSSProperties] = js.native
}

object CardTitleProps {
  @scala.inline
  def apply(): CardTitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardTitleProps]
  }
  @scala.inline
  implicit class CardTitlePropsOps[Self <: CardTitleProps] (val x: Self) extends AnyVal {
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
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    @scala.inline
    def setShowExpandableButton(value: Boolean): Self = this.set("showExpandableButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowExpandableButton: Self = this.set("showExpandableButton", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSubtitle(value: ReactNode): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setSubtitleColor(value: String): Self = this.set("subtitleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleColor: Self = this.set("subtitleColor", js.undefined)
    @scala.inline
    def setSubtitleStyle(value: CSSProperties): Self = this.set("subtitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleStyle: Self = this.set("subtitleStyle", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleColor(value: String): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleColor: Self = this.set("titleColor", js.undefined)
    @scala.inline
    def setTitleStyle(value: CSSProperties): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
  }
  
}

