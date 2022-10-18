package typings.jupyterlabTooltip

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.jupyterlabServices.libKernelKernelMod.IKernelConnection
import typings.jupyterlabTooltip.libTokensMod.ITooltipManager.IOptions
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  trait ITooltipManager extends StObject {
    
    /**
      * Invoke a tooltip.
      */
    def invoke(options: IOptions): Unit
  }
  object ITooltipManager extends Shortcut {
    
    inline def apply(invoke: IOptions => Unit): ITooltipManager = {
      val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction1(invoke))
      __obj.asInstanceOf[ITooltipManager]
    }
    
    @JSImport("@jupyterlab/tooltip/lib/tokens", "ITooltipManager")
    @js.native
    val ^ : Token[ITooltipManager] = js.native
    
    /**
      * An interface for tooltip-compatible objects.
      */
    trait IOptions extends StObject {
      
      /**
        * The referent anchor the tooltip follows.
        */
      val anchor: Widget
      
      /**
        * The referent editor for the tooltip.
        */
      val editor: IEditor
      
      /**
        * The kernel the tooltip communicates with to populate itself.
        */
      val kernel: IKernelConnection
      
      /**
        * The renderer the tooltip uses to render API responses.
        */
      val rendermime: IRenderMimeRegistry
    }
    object IOptions {
      
      inline def apply(anchor: Widget, editor: IEditor, kernel: IKernelConnection, rendermime: IRenderMimeRegistry): IOptions = {
        val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setAnchor(value: Widget): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
        
        inline def setEditor(value: IEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
        
        inline def setKernel(value: IKernelConnection): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: ITooltipManager](x: Self) {
      
      inline def setInvoke(value: IOptions => Unit): Self = StObject.set(x, "invoke", js.Any.fromFunction1(value))
    }
    
    type _To = Token[ITooltipManager]
    
    /* This means you don't have to write `^`, but can instead just say `ITooltipManager.foo` */
    override def _to: Token[ITooltipManager] = ^
  }
}
