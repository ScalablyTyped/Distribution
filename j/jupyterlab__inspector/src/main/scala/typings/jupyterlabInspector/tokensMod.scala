package typings.jupyterlabInspector

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabInspector.tokensMod.IInspector.IInspectable
import typings.luminoCoreutils.mod.Token
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @js.native
  trait IInspector extends StObject {
    
    /**
      * The source of events the inspector listens for.
      */
    var source: IInspectable | Null = js.native
  }
  object IInspector extends Shortcut {
    
    @scala.inline
    def apply(): IInspector = {
      val __obj = js.Dynamic.literal()
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
      var cleared: ISignal[_, Unit] = js.native
      
      /**
        * A signal emitted when the inspectable is disposed.
        */
      var disposed: ISignal[_, Unit] = js.native
      
      /**
        * A signal emitted when an inspector value is generated.
        */
      var inspected: ISignal[_, IInspectorUpdate] = js.native
      
      /**
        * Test whether the inspectable has been disposed.
        */
      var isDisposed: Boolean = js.native
      
      /**
        * Indicates whether the inspectable source emits signals.
        *
        * #### Notes
        * The use case for this attribute is to limit the API traffic when no
        * inspector is visible. It can be modified by the consumer of the source.
        */
      var standby: Boolean = js.native
    }
    object IInspectable {
      
      @scala.inline
      def apply(
        cleared: ISignal[_, Unit],
        disposed: ISignal[_, Unit],
        inspected: ISignal[_, IInspectorUpdate],
        isDisposed: Boolean,
        standby: Boolean
      ): IInspectable = {
        val __obj = js.Dynamic.literal(cleared = cleared.asInstanceOf[js.Any], disposed = disposed.asInstanceOf[js.Any], inspected = inspected.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], standby = standby.asInstanceOf[js.Any])
        __obj.asInstanceOf[IInspectable]
      }
      
      @scala.inline
      implicit class IInspectableMutableBuilder[Self <: IInspectable] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCleared(value: ISignal[_, Unit]): Self = StObject.set(x, "cleared", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisposed(value: ISignal[_, Unit]): Self = StObject.set(x, "disposed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInspected(value: ISignal[_, IInspectorUpdate]): Self = StObject.set(x, "inspected", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStandby(value: Boolean): Self = StObject.set(x, "standby", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class IInspectorMutableBuilder[Self <: IInspector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: IInspectable): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceNull: Self = StObject.set(x, "source", null)
    }
    
    /**
      * An update value for code inspectors.
      */
    @js.native
    trait IInspectorUpdate extends StObject {
      
      /**
        * The content being sent to the inspector for display.
        */
      var content: Widget | Null = js.native
    }
    object IInspectorUpdate {
      
      @scala.inline
      def apply(): IInspectorUpdate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IInspectorUpdate]
      }
      
      @scala.inline
      implicit class IInspectorUpdateMutableBuilder[Self <: IInspectorUpdate] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent(value: Widget): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentNull: Self = StObject.set(x, "content", null)
      }
    }
    
    type _To = Token[IInspector]
    
    /* This means you don't have to write `^`, but can instead just say `IInspector.foo` */
    override def _to: Token[IInspector] = ^
  }
}
