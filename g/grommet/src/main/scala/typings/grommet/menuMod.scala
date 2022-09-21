package typings.grommet

import typings.grommet.anon.ColorOpacity
import typings.grommet.anon.Left
import typings.grommet.anon.OpenMenu
import typings.grommet.buttonMod.ButtonExtendedProps
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
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("grommet/components/Menu", "Menu")
  @js.native
  val Menu: FC[MenuExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof grommet.grommet/components/Button.ButtonType, 'icon' | 'size' | 'children'> ]: grommet.grommet/components/Button.ButtonType[P]} */ trait MenuExtendedProps
    extends StObject
       with MenuProps
  object MenuExtendedProps {
    
    inline def apply(items: js.Array[js.Array[ButtonExtendedProps] | ButtonExtendedProps]): MenuExtendedProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuExtendedProps]
    }
  }
  
  trait MenuProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var children: js.UndefOr[js.Function | ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dropAlign: js.UndefOr[Left] = js.undefined
    
    var dropBackground: js.UndefOr[String | ColorOpacity] = js.undefined
    
    var dropProps: js.UndefOr[DropProps] = js.undefined
    
    var dropTarget: js.UndefOr[js.Object] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var icon: js.UndefOr[Boolean | ReactNode] = js.undefined
    
    var items: js.Array[js.Array[ButtonExtendedProps] | ButtonExtendedProps]
    
    var justifyContent: js.UndefOr[JustifyContentType] = js.undefined
    
    var label: js.UndefOr[String | ReactNode] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var messages: js.UndefOr[OpenMenu] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  }
  object MenuProps {
    
    inline def apply(items: js.Array[js.Array[ButtonExtendedProps] | ButtonExtendedProps]): MenuProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuProps]
    }
    
    extension [Self <: MenuProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setChildren(value: js.Function | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropAlign(value: Left): Self = StObject.set(x, "dropAlign", value.asInstanceOf[js.Any])
      
      inline def setDropAlignUndefined: Self = StObject.set(x, "dropAlign", js.undefined)
      
      inline def setDropBackground(value: String | ColorOpacity): Self = StObject.set(x, "dropBackground", value.asInstanceOf[js.Any])
      
      inline def setDropBackgroundUndefined: Self = StObject.set(x, "dropBackground", js.undefined)
      
      inline def setDropProps(value: DropProps): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      inline def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      inline def setDropTarget(value: js.Object): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setIcon(value: Boolean | ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setItems(value: js.Array[js.Array[ButtonExtendedProps] | ButtonExtendedProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: (js.Array[ButtonExtendedProps] | ButtonExtendedProps)*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setJustifyContent(value: JustifyContentType): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setLabel(value: String | ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMessages(value: OpenMenu): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
