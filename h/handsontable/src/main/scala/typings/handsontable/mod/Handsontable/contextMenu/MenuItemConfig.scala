package typings.handsontable.mod.Handsontable.contextMenu

import typings.handsontable.mod._Handsontable.Core
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemConfig extends js.Object {
  var callback: js.UndefOr[
    js.ThisFunction3[
      /* this */ Core, 
      /* key */ String, 
      /* selection */ js.Array[Selection], 
      /* clickEvent */ MouseEvent, 
      Unit
    ]
  ] = js.native
  var disableSelection: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean | (js.ThisFunction0[/* this */ Core, Boolean | Unit])] = js.native
  var hidden: js.UndefOr[Boolean | (js.ThisFunction0[/* this */ Core, Boolean | Unit])] = js.native
  var isCommand: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var name: js.UndefOr[String | (js.ThisFunction0[/* this */ Core, String])] = js.native
  var renderer: js.UndefOr[
    js.ThisFunction6[
      /* this */ this.type, 
      /* hot */ Core, 
      /* wrapper */ HTMLElement, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ Double | String, 
      /* itemValue */ String, 
      HTMLElement
    ]
  ] = js.native
  var submenu: js.UndefOr[SubmenuConfig] = js.native
}

object MenuItemConfig {
  @scala.inline
  def apply(): MenuItemConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemConfig]
  }
  @scala.inline
  implicit class MenuItemConfigOps[Self <: MenuItemConfig] (val x: Self) extends AnyVal {
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
    def setCallback(
      value: js.ThisFunction3[
          /* this */ Core, 
          /* key */ String, 
          /* selection */ js.Array[Selection], 
          /* clickEvent */ MouseEvent, 
          Unit
        ]
    ): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setDisableSelection(value: Boolean): Self = this.set("disableSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSelection: Self = this.set("disableSelection", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean | (js.ThisFunction0[/* this */ Core, Boolean | Unit])): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHidden(value: Boolean | (js.ThisFunction0[/* this */ Core, Boolean | Unit])): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIsCommand(value: Boolean): Self = this.set("isCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCommand: Self = this.set("isCommand", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setName(value: String | (js.ThisFunction0[/* this */ Core, String])): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRenderer(
      value: js.ThisFunction6[
          MenuItemConfig, 
          /* hot */ Core, 
          /* wrapper */ HTMLElement, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ Double | String, 
          /* itemValue */ String, 
          HTMLElement
        ]
    ): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setSubmenu(value: SubmenuConfig): Self = this.set("submenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmenu: Self = this.set("submenu", js.undefined)
  }
  
}

