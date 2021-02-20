package typings.jupyterlabTooltip

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.jupyterlabTooltip.tokensMod.ITooltipManager.IOptions
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @js.native
  trait ITooltipManager extends StObject {
    
    /**
      * Invoke a tooltip.
      */
    def invoke(options: IOptions): Unit = js.native
  }
  object ITooltipManager extends Shortcut {
    
    @scala.inline
    def apply(invoke: IOptions => Unit): ITooltipManager = {
      val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction1(invoke))
      __obj.asInstanceOf[ITooltipManager]
    }
    
    @JSImport("@jupyterlab/tooltip/lib/tokens", "ITooltipManager")
    @js.native
    val ^ : Token[ITooltipManager] = js.native
    
    /**
      * An interface for tooltip-compatible objects.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The referent anchor the tooltip follows.
        */
      val anchor: Widget = js.native
      
      /**
        * The referent editor for the tooltip.
        */
      val editor: IEditor = js.native
      
      /**
        * The kernel the tooltip communicates with to populate itself.
        */
      val kernel: IKernelConnection = js.native
      
      /**
        * The renderer the tooltip uses to render API responses.
        */
      val rendermime: IRenderMimeRegistry = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(anchor: Widget, editor: IEditor, kernel: IKernelConnection, rendermime: IRenderMimeRegistry): IOptions = {
        val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnchor(value: Widget): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditor(value: IEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKernel(value: IKernelConnection): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class ITooltipManagerMutableBuilder[Self <: ITooltipManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvoke(value: IOptions => Unit): Self = StObject.set(x, "invoke", js.Any.fromFunction1(value))
    }
    
    type _To = Token[ITooltipManager]
    
    /* This means you don't have to write `^`, but can instead just say `ITooltipManager.foo` */
    override def _to: Token[ITooltipManager] = ^
  }
}
