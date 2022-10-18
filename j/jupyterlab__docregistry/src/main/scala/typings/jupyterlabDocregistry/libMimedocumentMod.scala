package typings.jupyterlabDocregistry

import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.json
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.string
import typings.jupyterlabDocregistry.libDefaultMod.ABCWidgetFactory
import typings.jupyterlabDocregistry.libDefaultMod.DocumentWidget
import typings.jupyterlabDocregistry.libMimedocumentMod.MimeContent.IOptions
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IFileType
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMimedocumentMod {
  
  @JSImport("@jupyterlab/docregistry/lib/mimedocument", "MimeContent")
  @js.native
  open class MimeContent protected () extends Widget {
    /**
      * Construct a new widget.
      */
    def this(options: IOptions) = this()
    
    /**
      * A bound change callback.
      */
    /* private */ var _changeCallback: Any = js.native
    
    /* private */ var _context: Any = js.native
    
    /* private */ var _dataType: Any = js.native
    
    /* private */ var _fragment: Any = js.native
    
    /* private */ var _isRendering: Any = js.native
    
    /* private */ var _monitor: Any = js.native
    
    /* private */ var _ready: Any = js.native
    
    /**
      * Render the mime content.
      */
    /* private */ var _render: Any = js.native
    
    /* private */ var _renderRequested: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
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
    
    /* protected */ var translator: ITranslator = js.native
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
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
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
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/docregistry/lib/mimedocument", "MimeDocument")
  @js.native
  open class MimeDocument protected () extends DocumentWidget[MimeContent, IModel] {
    def this(options: typings.jupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptions[MimeContent, IModel]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry/lib/mimedocument", "MimeDocumentFactory")
  @js.native
  open class MimeDocumentFactory protected () extends ABCWidgetFactory[MimeDocument, IModel] {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typings.jupyterlabDocregistry.libMimedocumentMod.MimeDocumentFactory.IOptions[MimeDocument]) = this()
    
    /* private */ var _dataType: Any = js.native
    
    /* private */ var _factory: Any = js.native
    
    /* private */ var _fileType: Any = js.native
    
    /* private */ var _renderTimeout: Any = js.native
    
    /* private */ var _rendermime: Any = js.native
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
        * Optional renderer to use (overriding the renderer in the registry)
        */
      var factory: js.UndefOr[IRendererFactory] = js.undefined
      
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
      
      inline def apply[T /* <: MimeDocument */](fileTypes: js.Array[String], name: String, rendermime: IRenderMimeRegistry): typings.jupyterlabDocregistry.libMimedocumentMod.MimeDocumentFactory.IOptions[T] = {
        val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabDocregistry.libMimedocumentMod.MimeDocumentFactory.IOptions[T]]
      }
      
      extension [Self <: typings.jupyterlabDocregistry.libMimedocumentMod.MimeDocumentFactory.IOptions[?], T /* <: MimeDocument */](x: Self & typings.jupyterlabDocregistry.libMimedocumentMod.MimeDocumentFactory.IOptions[T]) {
        
        inline def setDataType(value: string | json): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
        
        inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
        
        inline def setFactory(value: IRendererFactory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
        
        inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
        
        inline def setPrimaryFileType(value: IFileType): Self = StObject.set(x, "primaryFileType", value.asInstanceOf[js.Any])
        
        inline def setPrimaryFileTypeUndefined: Self = StObject.set(x, "primaryFileType", js.undefined)
        
        inline def setRenderTimeout(value: Double): Self = StObject.set(x, "renderTimeout", value.asInstanceOf[js.Any])
        
        inline def setRenderTimeoutUndefined: Self = StObject.set(x, "renderTimeout", js.undefined)
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
  }
}
