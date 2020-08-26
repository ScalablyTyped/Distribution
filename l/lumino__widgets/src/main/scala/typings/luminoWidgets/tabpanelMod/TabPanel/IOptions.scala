package typings.luminoWidgets.tabpanelMod.TabPanel

import typings.luminoWidgets.tabbarMod.TabBar.IRenderer
import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a tab panel.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The renderer for the panel's tab bar.
    *
    * The default is a shared renderer instance.
    */
  var renderer: js.UndefOr[IRenderer[Widget]] = js.native
  /**
    * The placement of the tab bar relative to the content.
    *
    * The default is `'top'`.
    */
  var tabPlacement: js.UndefOr[TabPlacement] = js.native
  /**
    * Whether the tabs are movable by the user.
    *
    * The default is `false`.
    */
  var tabsMovable: js.UndefOr[Boolean] = js.native
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
    def setRenderer(value: IRenderer[Widget]): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setTabPlacement(value: TabPlacement): Self = this.set("tabPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabPlacement: Self = this.set("tabPlacement", js.undefined)
    @scala.inline
    def setTabsMovable(value: Boolean): Self = this.set("tabsMovable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabsMovable: Self = this.set("tabsMovable", js.undefined)
  }
  
}

