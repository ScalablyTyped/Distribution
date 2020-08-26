package typings.grommet.tabsMod

import typings.grommet.anon.TabContents
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.grow
import typings.grommet.grommetStrings.shrink
import typings.grommet.grommetStrings.start
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  var activeIndex: js.UndefOr[Double] = js.native
  var alignControls: js.UndefOr[AlignSelfType] = js.native
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  var children: ReactNode = js.native
  var flex: js.UndefOr[grow | shrink | Boolean] = js.native
  var gridArea: js.UndefOr[GridAreaType] = js.native
  var justify: js.UndefOr[start | center | end] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var messages: js.UndefOr[TabContents] = js.native
  var onActive: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
}

object TabsProps {
  @scala.inline
  def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
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
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    @scala.inline
    def setAlignControls(value: AlignSelfType): Self = this.set("alignControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignControls: Self = this.set("alignControls", js.undefined)
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setFlex(value: grow | shrink | Boolean): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setJustify(value: start | center | end): Self = this.set("justify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustify: Self = this.set("justify", js.undefined)
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMessages(value: TabContents): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setOnActive(value: /* index */ Double => Unit): Self = this.set("onActive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnActive: Self = this.set("onActive", js.undefined)
  }
  
}

