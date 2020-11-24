package typings.grommet.menuMod

import typings.grommet.anon.CloseMenu
import typings.grommet.anon.ColorOpacity
import typings.grommet.anon.Right
import typings.grommet.dropMod.DropProps
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.JustifyContentType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuProps extends js.Object {
  
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var dropAlign: js.UndefOr[Right] = js.native
  
  var dropBackground: js.UndefOr[String | ColorOpacity] = js.native
  
  var dropProps: js.UndefOr[DropProps] = js.native
  
  var dropTarget: js.UndefOr[js.Object] = js.native
  
  var gridArea: js.UndefOr[GridAreaType] = js.native
  
  var icon: js.UndefOr[Boolean | ReactNode] = js.native
  
  var items: js.Array[js.Object] = js.native
  
  var justifyContent: js.UndefOr[JustifyContentType] = js.native
  
  var label: js.UndefOr[String | ReactNode] = js.native
  
  var margin: js.UndefOr[MarginType] = js.native
  
  var messages: js.UndefOr[CloseMenu] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
}
object MenuProps {
  
  @scala.inline
  def apply(items: js.Array[js.Object]): MenuProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
  
  @scala.inline
  implicit class MenuPropsOps[Self <: MenuProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: js.Object*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[js.Object]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDropAlign(value: Right): Self = this.set("dropAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropAlign: Self = this.set("dropAlign", js.undefined)
    
    @scala.inline
    def setDropBackground(value: String | ColorOpacity): Self = this.set("dropBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropBackground: Self = this.set("dropBackground", js.undefined)
    
    @scala.inline
    def setDropProps(value: DropProps): Self = this.set("dropProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropProps: Self = this.set("dropProps", js.undefined)
    
    @scala.inline
    def setDropTarget(value: js.Object): Self = this.set("dropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropTarget: Self = this.set("dropTarget", js.undefined)
    
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    
    @scala.inline
    def setIcon(value: Boolean | ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setJustifyContent(value: JustifyContentType): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    
    @scala.inline
    def setLabel(value: String | ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMessages(value: CloseMenu): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large | xlarge | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
