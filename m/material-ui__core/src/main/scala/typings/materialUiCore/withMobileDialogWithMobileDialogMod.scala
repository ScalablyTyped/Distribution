package typings.materialUiCore

import typings.materialUiCore.anon.PartialWithWidth
import typings.materialUiCore.createBreakpointsMod.Breakpoint
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withMobileDialogWithMobileDialogMod {
  
  @JSImport("@material-ui/core/withMobileDialog/withMobileDialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](): js.Function1[
    /* component */ ComponentType[P & InjectedProps & PartialWithWidth], 
    ComponentType[P & PartialWithWidth]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[
    /* component */ ComponentType[P & InjectedProps & PartialWithWidth], 
    ComponentType[P & PartialWithWidth]
  ]]
  inline def default[P](options: WithMobileDialogOptions): js.Function1[
    /* component */ ComponentType[P & InjectedProps & PartialWithWidth], 
    ComponentType[P & PartialWithWidth]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[P & InjectedProps & PartialWithWidth], 
    ComponentType[P & PartialWithWidth]
  ]]
  
  trait InjectedProps extends StObject {
    
    var fullScreen: js.UndefOr[Boolean] = js.undefined
  }
  object InjectedProps {
    
    inline def apply(): InjectedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectedProps]
    }
    
    extension [Self <: InjectedProps](x: Self) {
      
      inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
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
    
    extension [Self <: WithMobileDialogOptions](x: Self) {
      
      inline def setBreakpoint(value: Breakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    }
  }
}
