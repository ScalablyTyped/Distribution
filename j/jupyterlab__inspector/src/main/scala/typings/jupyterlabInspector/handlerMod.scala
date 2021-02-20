package typings.jupyterlabInspector

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabInspector.handlerMod.InspectionHandler.IOptions
import typings.jupyterlabInspector.tokensMod.IInspector.IInspectorUpdate
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jupyterlabInspector.tokensMod.IInspector.IInspectable because var conflicts: isDisposed. Inlined cleared, disposed, inspected, standby */ @JSImport("@jupyterlab/inspector/lib/handler", "InspectionHandler")
  @js.native
  class InspectionHandler protected () extends IDisposable {
    /**
      * Construct a new inspection handler for a widget.
      */
    def this(options: IOptions) = this()
    
    var _cleared: js.Any = js.native
    
    var _connector: js.Any = js.native
    
    var _debouncer: js.Any = js.native
    
    var _disposed: js.Any = js.native
    
    var _editor: js.Any = js.native
    
    var _inspected: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    /**
      * Handle changes to the editor state, debouncing.
      */
    var _onChange: js.Any = js.native
    
    var _pending: js.Any = js.native
    
    var _rendermime: js.Any = js.native
    
    var _standby: js.Any = js.native
    
    /**
      * A signal emitted when the inspector should clear all items.
      */
    def cleared: ISignal[InspectionHandler, Unit] = js.native
    /**
      * A signal emitted when the inspector should clear all items.
      */
    @JSName("cleared")
    var cleared_FInspectionHandler: ISignal[_, Unit] = js.native
    
    /**
      * A signal emitted when the handler is disposed.
      */
    def disposed: ISignal[InspectionHandler, Unit] = js.native
    /**
      * A signal emitted when the inspectable is disposed.
      */
    @JSName("disposed")
    var disposed_FInspectionHandler: ISignal[_, Unit] = js.native
    
    /**
      * The editor widget used by the inspection handler.
      */
    def editor: IEditor | Null = js.native
    def editor_=(newValue: IEditor | Null): Unit = js.native
    
    /**
      * A signal emitted when an inspector value is generated.
      */
    def inspected: ISignal[InspectionHandler, IInspectorUpdate] = js.native
    /**
      * A signal emitted when an inspector value is generated.
      */
    @JSName("inspected")
    var inspected_FInspectionHandler: ISignal[_, IInspectorUpdate] = js.native
    
    /**
      * Get whether the inspection handler is disposed.
      *
      * #### Notes
      * This is a read-only property.
      */
    @JSName("isDisposed")
    def isDisposed_MInspectionHandler: Boolean = js.native
    
    /**
      * Handle a text changed signal from an editor.
      *
      * #### Notes
      * Update the hints inspector based on a text change.
      */
    /* protected */ def onEditorChange(): Unit = js.native
    
    /**
      * Indicates whether the handler makes API inspection requests or stands by.
      *
      * #### Notes
      * The use case for this attribute is to limit the API traffic when no
      * inspector is visible.
      */
    def standby: Boolean = js.native
    def standby_=(value: Boolean): Unit = js.native
    /**
      * Indicates whether the inspectable source emits signals.
      *
      * #### Notes
      * The use case for this attribute is to limit the API traffic when no
      * inspector is visible. It can be modified by the consumer of the source.
      */
    @JSName("standby")
    var standby_FInspectionHandler: Boolean = js.native
  }
  object InspectionHandler {
    
    /**
      * The instantiation options for an inspection handler.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The connector used to make inspection requests.
        *
        * #### Notes
        * The only method of this connector that will ever be called is `fetch`, so
        * it is acceptable for the other methods to be simple functions that return
        * rejected promises.
        */
      var connector: IDataConnector[IReply, Unit, IRequest, String] = js.native
      
      /**
        * The mime renderer for the inspection handler.
        */
      var rendermime: IRenderMimeRegistry = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(connector: IDataConnector[IReply, Unit, IRequest, String], rendermime: IRenderMimeRegistry): IOptions = {
        val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnector(value: IDataConnector[IReply, Unit, IRequest, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A reply to an inspection request.
      */
    @js.native
    trait IReply extends StObject {
      
      /**
        * The MIME bundle data returned from an inspection request.
        */
      var data: ReadonlyJSONObject = js.native
      
      /**
        * Any metadata that accompanies the MIME bundle returning from a request.
        */
      var metadata: ReadonlyJSONObject = js.native
    }
    object IReply {
      
      @scala.inline
      def apply(data: ReadonlyJSONObject, metadata: ReadonlyJSONObject): IReply = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
        __obj.asInstanceOf[IReply]
      }
      
      @scala.inline
      implicit class IReplyMutableBuilder[Self <: IReply] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: ReadonlyJSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ReadonlyJSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The details of an inspection request.
      */
    @js.native
    trait IRequest extends StObject {
      
      /**
        * The cursor offset position within the text being inspected.
        */
      var offset: Double = js.native
      
      /**
        * The text being inspected.
        */
      var text: String = js.native
    }
    object IRequest {
      
      @scala.inline
      def apply(offset: Double, text: String): IRequest = {
        val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRequest]
      }
      
      @scala.inline
      implicit class IRequestMutableBuilder[Self <: IRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
  }
}
