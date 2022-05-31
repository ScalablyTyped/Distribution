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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jupyterlabInspector.tokensMod.IInspector.IInspectable because var conflicts: isDisposed. Inlined cleared, disposed, inspected, standby */ @JSImport("@jupyterlab/inspector/lib/handler", "InspectionHandler")
  @js.native
  class InspectionHandler protected ()
    extends StObject
       with IDisposable {
    /**
      * Construct a new inspection handler for a widget.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _cleared: js.Any = js.native
    
    /* private */ var _connector: js.Any = js.native
    
    /* private */ var _debouncer: js.Any = js.native
    
    /* private */ var _disposed: js.Any = js.native
    
    /* private */ var _editor: js.Any = js.native
    
    /* private */ var _inspected: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /**
      * Handle changes to the editor state, debouncing.
      */
    /* private */ var _onChange: js.Any = js.native
    
    /* private */ var _pending: js.Any = js.native
    
    /* private */ var _rendermime: js.Any = js.native
    
    /* private */ var _standby: js.Any = js.native
    
    /**
      * A signal emitted when the inspector should clear all items.
      */
    def cleared: ISignal[InspectionHandler, Unit] = js.native
    /**
      * A signal emitted when the inspector should clear all items.
      */
    @JSName("cleared")
    var cleared_FInspectionHandler: ISignal[js.Any, Unit] = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * A signal emitted when the handler is disposed.
      */
    def disposed: ISignal[InspectionHandler, Unit] = js.native
    /**
      * A signal emitted when the inspectable is disposed.
      */
    @JSName("disposed")
    var disposed_FInspectionHandler: ISignal[js.Any, Unit] = js.native
    
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
    var inspected_FInspectionHandler: ISignal[js.Any, IInspectorUpdate] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
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
    trait IOptions extends StObject {
      
      /**
        * The connector used to make inspection requests.
        *
        * #### Notes
        * The only method of this connector that will ever be called is `fetch`, so
        * it is acceptable for the other methods to be simple functions that return
        * rejected promises.
        */
      var connector: IDataConnector[IReply, Unit, IRequest, String]
      
      /**
        * The mime renderer for the inspection handler.
        */
      var rendermime: IRenderMimeRegistry
    }
    object IOptions {
      
      inline def apply(connector: IDataConnector[IReply, Unit, IRequest, String], rendermime: IRenderMimeRegistry): IOptions = {
        val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setConnector(value: IDataConnector[IReply, Unit, IRequest, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A reply to an inspection request.
      */
    trait IReply extends StObject {
      
      /**
        * The MIME bundle data returned from an inspection request.
        */
      var data: ReadonlyJSONObject
      
      /**
        * Any metadata that accompanies the MIME bundle returning from a request.
        */
      var metadata: ReadonlyJSONObject
    }
    object IReply {
      
      inline def apply(data: ReadonlyJSONObject, metadata: ReadonlyJSONObject): IReply = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
        __obj.asInstanceOf[IReply]
      }
      
      extension [Self <: IReply](x: Self) {
        
        inline def setData(value: ReadonlyJSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: ReadonlyJSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The details of an inspection request.
      */
    trait IRequest extends StObject {
      
      /**
        * The cursor offset position within the text being inspected.
        */
      var offset: Double
      
      /**
        * The text being inspected.
        */
      var text: String
    }
    object IRequest {
      
      inline def apply(offset: Double, text: String): IRequest = {
        val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRequest]
      }
      
      extension [Self <: IRequest](x: Self) {
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
  }
}
