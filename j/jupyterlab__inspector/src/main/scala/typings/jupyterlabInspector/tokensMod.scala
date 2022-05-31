package typings.jupyterlabInspector

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabInspector.tokensMod.IInspector.IInspectable
import typings.luminoCoreutils.mod.Token
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
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
    trait IInspectable extends StObject {
      
      /**
        * A signal emitted when the inspector should clear all items.
        */
      var cleared: ISignal[js.Any, Unit]
      
      /**
        * A signal emitted when the inspectable is disposed.
        */
      var disposed: ISignal[js.Any, Unit]
      
      /**
        * A signal emitted when an inspector value is generated.
        */
      var inspected: ISignal[js.Any, IInspectorUpdate]
      
      /**
        * Test whether the inspectable has been disposed.
        */
      var isDisposed: Boolean
      
      /**
        * Indicates whether the inspectable source emits signals.
        *
        * #### Notes
        * The use case for this attribute is to limit the API traffic when no
        * inspector is visible. It can be modified by the consumer of the source.
        */
      var standby: Boolean
    }
    object IInspectable {
      
      inline def apply(
        cleared: ISignal[js.Any, Unit],
        disposed: ISignal[js.Any, Unit],
        inspected: ISignal[js.Any, IInspectorUpdate],
        isDisposed: Boolean,
        standby: Boolean
      ): IInspectable = {
        val __obj = js.Dynamic.literal(cleared = cleared.asInstanceOf[js.Any], disposed = disposed.asInstanceOf[js.Any], inspected = inspected.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], standby = standby.asInstanceOf[js.Any])
        __obj.asInstanceOf[IInspectable]
      }
      
      extension [Self <: IInspectable](x: Self) {
        
        inline def setCleared(value: ISignal[js.Any, Unit]): Self = StObject.set(x, "cleared", value.asInstanceOf[js.Any])
        
        inline def setDisposed(value: ISignal[js.Any, Unit]): Self = StObject.set(x, "disposed", value.asInstanceOf[js.Any])
        
        inline def setInspected(value: ISignal[js.Any, IInspectorUpdate]): Self = StObject.set(x, "inspected", value.asInstanceOf[js.Any])
        
        inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
        
        inline def setStandby(value: Boolean): Self = StObject.set(x, "standby", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: IInspector](x: Self) {
      
      inline def setSource(value: IInspectable): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
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
      
      extension [Self <: IInspectorUpdate](x: Self) {
        
        inline def setContent(value: Widget): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentNull: Self = StObject.set(x, "content", null)
      }
    }
    
    type _To = Token[IInspector]
    
    /* This means you don't have to write `^`, but can instead just say `IInspector.foo` */
    override def _to: Token[IInspector] = ^
  }
}
