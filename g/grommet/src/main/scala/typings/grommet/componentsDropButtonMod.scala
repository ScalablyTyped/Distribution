package typings.grommet

import typings.grommet.anon.Bottom
import typings.grommet.componentsButtonMod.ButtonProps
import typings.grommet.componentsDropMod.DropProps
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDropButtonMod {
  
  @JSImport("grommet/components/DropButton", "DropButton")
  @js.native
  val DropButton: FC[DropButtonExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.ButtonHTMLAttributes<std.HTMLButtonElement>, std.HTMLButtonElement>, 'color'> ]: react.react.DetailedHTMLProps<react.react.ButtonHTMLAttributes<std.HTMLButtonElement>, std.HTMLButtonElement>[P]} */ trait DropButtonExtendedProps
    extends StObject
       with DropButtonProps
       with ButtonProps
  object DropButtonExtendedProps {
    
    inline def apply(dropContent: Element): DropButtonExtendedProps = {
      val __obj = js.Dynamic.literal(dropContent = dropContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropButtonExtendedProps]
    }
  }
  
  trait DropButtonProps extends StObject {
    
    var dropAlign: js.UndefOr[Bottom] = js.undefined
    
    var dropContent: Element
    
    var dropProps: js.UndefOr[DropProps] = js.undefined
    
    var dropTarget: js.UndefOr[js.Object] = js.undefined
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLDocument | HTMLButtonElement]] = js.undefined
    
    var onOpen: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
  }
  object DropButtonProps {
    
    inline def apply(dropContent: Element): DropButtonProps = {
      val __obj = js.Dynamic.literal(dropContent = dropContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropButtonProps]
    }
    
    extension [Self <: DropButtonProps](x: Self) {
      
      inline def setDropAlign(value: Bottom): Self = StObject.set(x, "dropAlign", value.asInstanceOf[js.Any])
      
      inline def setDropAlignUndefined: Self = StObject.set(x, "dropAlign", js.undefined)
      
      inline def setDropContent(value: Element): Self = StObject.set(x, "dropContent", value.asInstanceOf[js.Any])
      
      inline def setDropProps(value: DropProps): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      inline def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      inline def setDropTarget(value: js.Object): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      inline def setOnClose(value: MouseEvent[HTMLDocument | HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  type buttonProps = ButtonProps & (Omit[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    color
  ])
}
