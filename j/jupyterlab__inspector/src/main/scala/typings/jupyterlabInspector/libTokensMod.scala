package typings.jupyterlabInspector

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabInspector.libTokensMod.IInspector.IInspectable
import typings.luminoCoreutils.mod.Token
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  trait IInspector extends StObject {
    
    /**
      * The source of events the inspector listens for.
      */
    var source: IInspectable | Null
  }
  object IInspector extends Shortcut {
    
    inline def apply(): IInspector = {
      val __obj = js.Dynamic.literal(source = null)
      __obj.asInstanceOf[IInspector]
    }
    
    @JSImport("@jupyterlab/inspector/lib/tokens", "IInspector")
    @js.native
    val ^ : Token[IInspector] = js.native
    
    /**
      * The definition of an inspectable source.
      */
    @js.native
    trait IInspectable extends StObject {
      
      /**
        * A signal emitted when the inspector should clear all items.
        */
      var cleared: ISignal[Any, Unit] = js.native
      
      /**
        * A signal emitted when the inspectable is disposed.
        */
      var disposed: ISignal[Any, Unit] = js.native
      
      /**
        * A signal emitted when an inspector value is generated.
        */
      var inspected: ISignal[Any, IInspectorUpdate] = js.native
      
      /**
        * Test whether the inspectable has been disposed.
        */
      var isDisposed: Boolean = js.native
      
      /**
        * Handle a text changed signal from an editor.
        *
        * #### Notes
        * Update the hints inspector based on a text change.
        */
      def onEditorChange(): Unit = js.native
      def onEditorChange(customText: String): Unit = js.native
      
      /**
        * Indicates whether the inspectable source emits signals.
        *
        * #### Notes
        * The use case for this attribute is to limit the API traffic when no
        * inspector is visible. It can be modified by the consumer of the source.
        */
      var standby: Boolean = js.native
    }
    
    /**
      * An update value for code inspectors.
      */
    trait IInspectorUpdate extends StObject {
      
      /**
        * The content being sent to the inspector for display.
        */
      var content: Widget | Null
    }
    object IInspectorUpdate {
      
      inline def apply(): IInspectorUpdate = {
        val __obj = js.Dynamic.literal(content = null)
        __obj.asInstanceOf[IInspectorUpdate]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IInspectorUpdate] (val x: Self) extends AnyVal {
        
        inline def setContent(value: Widget): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentNull: Self = StObject.set(x, "content", null)
      }
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IInspector] (val x: Self) extends AnyVal {
      
      inline def setSource(value: IInspectable): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
    }
    
    type _To = Token[IInspector]
    
    /* This means you don't have to write `^`, but can instead just say `IInspector.foo` */
    override def _to: Token[IInspector] = ^
  }
}
