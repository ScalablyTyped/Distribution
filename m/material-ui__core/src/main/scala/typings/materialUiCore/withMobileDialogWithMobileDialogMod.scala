package typings.materialUiCore

import typings.materialUiCore.anon.PartialWithMobileDialog
import typings.materialUiCore.stylesCreateBreakpointsMod.Breakpoint
import typings.materialUiCore.withWidthWithWidthMod.WithWidth
import typings.materialUiTypes.mod.PropInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withMobileDialogWithMobileDialogMod {
  
  @JSImport("@material-ui/core/withMobileDialog/withMobileDialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](): PropInjector[WithMobileDialog, PartialWithMobileDialog] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PropInjector[WithMobileDialog, PartialWithMobileDialog]]
  inline def default[P](options: WithMobileDialogOptions): PropInjector[WithMobileDialog, PartialWithMobileDialog] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[PropInjector[WithMobileDialog, PartialWithMobileDialog]]
  
  type InjectedProps = WithMobileDialog
  
  trait WithMobileDialog
    extends StObject
       with WithWidth {
    
    var fullScreen: Boolean
  }
  object WithMobileDialog {
    
    inline def apply(fullScreen: Boolean, width: Breakpoint): WithMobileDialog = {
      val __obj = js.Dynamic.literal(fullScreen = fullScreen.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithMobileDialog]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithMobileDialog] (val x: Self) extends AnyVal {
      
      inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithMobileDialogOptions extends StObject {
    
    var breakpoint: Breakpoint
  }
  object WithMobileDialogOptions {
    
    inline def apply(breakpoint: Breakpoint): WithMobileDialogOptions = {
      val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithMobileDialogOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithMobileDialogOptions] (val x: Self) extends AnyVal {
      
      inline def setBreakpoint(value: Breakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    }
  }
}
