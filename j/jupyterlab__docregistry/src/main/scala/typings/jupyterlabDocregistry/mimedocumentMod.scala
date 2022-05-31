package typings.jupyterlabDocregistry

import typings.jupyterlabDocregistry.defaultMod.ABCWidgetFactory
import typings.jupyterlabDocregistry.defaultMod.DocumentWidget
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.json
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.string
import typings.jupyterlabDocregistry.mimedocumentMod.MimeContent.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimedocumentMod {
  
  @JSImport("@jupyterlab/docregistry/lib/mimedocument", "MimeContent")
  @js.native
  class MimeContent protected () extends Widget {
    /**
      * Construct a new widget.
      */
    def this(options: IOptions) = this()
    
    /**
      * A bound change callback.
      */
    /* private */ var _changeCallback: js.Any = js.native
    
    /* private */ var _context: js.Any = js.native
    
    /* private */ var _dataType: js.Any = js.native
    
    /* private */ var _fragment: js.Any = js.native
    
    /* private */ var _isRendering: js.Any = js.native
    
    /* private */ var _monitor: js.Any = js.native
    
    /* private */ var _ready: js.Any = js.native
    
    /**
      * Render the mime content.
      */
    /* private */ var _render: js.Any = js.native
    
    /* private */ var _renderRequested: js.Any = js.native
    
    /**
      * The mimetype for this rendered content.
      */
    val mimeType: String = js.native
    
    /**
      * A promise that resolves when the widget is ready.
      */
    def ready: js.Promise[Unit] = js.native
    
    val renderer: IRenderer = js.native
    
    /**
      * Set URI fragment identifier.
      */
    def setFragment(fragment: String): Unit = js.native
  }
  object MimeContent {
    
    /**
      * The options used to initialize a MimeDocument.
      */
    trait IOptions extends StObject {
      
      /**
        * Context
        */
      var context: IContext[IModel]
      
      /**
        * Preferred data type from the model.
        */
      var dataType: js.UndefOr[string | json] = js.undefined
      
      /**
        * The mime type.
        */
      var mimeType: String
      
      /**
        * The render timeout.
        */
      var renderTimeout: Double
      
      /**
        * The renderer instance.
        */
      var renderer: IRenderer
    }
    object IOptions {
      
      inline def apply(context: IContext[IModel], mimeType: String, renderTimeout: Double, renderer: IRenderer): IOptions = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], renderTimeout = renderTimeout.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setContext(value: IContext[IModel]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setDataType(value: string | json): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
        
        inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
        
        inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        inline def setRenderTimeout(value: Double): Self = StObject.set(x, "renderTimeout", value.asInstanceOf[js.Any])
        
        inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/docregistry/lib/mimedocument", "MimeDocument")
  @js.native
  class MimeDocument protected () extends DocumentWidget[MimeContent, IModel] {
    def this(options: typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions[MimeContent, IModel]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry/lib/mimedocument", "MimeDocumentFactory")
  @js.native
  class MimeDocumentFactory protected () extends ABCWidgetFactory[MimeDocument, IModel] {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[MimeDocument]) = this()
    
    /* private */ var _dataType: js.Any = js.native
    
    /* private */ var _fileType: js.Any = js.native
    
    /* private */ var _renderTimeout: js.Any = js.native
    
    /* private */ var _rendermime: js.Any = js.native
  }
  object MimeDocumentFactory {
    
    /**
      * The options used to initialize a MimeDocumentFactory.
      */
    trait IOptions[T /* <: MimeDocument */]
      extends StObject
         with IWidgetFactoryOptions[T] {
      
      /**
        * Preferred data type from the model.
        */
      var dataType: js.UndefOr[string | json] = js.undefined
      
      /**
        * The primary file type associated with the document.
        */
      var primaryFileType: js.UndefOr[IFileType] = js.undefined
      
      /**
        * The render timeout.
        */
      var renderTimeout: js.UndefOr[Double] = js.undefined
      
      /**
        * The rendermime instance.
        */
      var rendermime: IRenderMimeRegistry
    }
    object IOptions {
      
      inline def apply[T /* <: MimeDocument */](fileTypes: js.Array[String], name: String, rendermime: IRenderMimeRegistry): typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[T] = {
        val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[T]]
      }
      
      extension [Self <: typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[?], T /* <: MimeDocument */](x: Self & typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[T]) {
        
        inline def setDataType(value: string | json): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
        
        inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
        
        inline def setPrimaryFileType(value: IFileType): Self = StObject.set(x, "primaryFileType", value.asInstanceOf[js.Any])
        
        inline def setPrimaryFileTypeUndefined: Self = StObject.set(x, "primaryFileType", js.undefined)
        
        inline def setRenderTimeout(value: Double): Self = StObject.set(x, "renderTimeout", value.asInstanceOf[js.Any])
        
        inline def setRenderTimeoutUndefined: Self = StObject.set(x, "renderTimeout", js.undefined)
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
  }
}
