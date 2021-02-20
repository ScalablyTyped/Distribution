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
import scala.scalajs.js.`|`
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
    var _changeCallback: js.Any = js.native
    
    var _context: js.Any = js.native
    
    var _dataType: js.Any = js.native
    
    var _fragment: js.Any = js.native
    
    var _isRendering: js.Any = js.native
    
    var _monitor: js.Any = js.native
    
    var _ready: js.Any = js.native
    
    /**
      * Render the mime content.
      */
    var _render: js.Any = js.native
    
    var _renderRequested: js.Any = js.native
    
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
    @js.native
    trait IOptions extends StObject {
      
      /**
        * Context
        */
      var context: IContext[IModel] = js.native
      
      /**
        * Preferred data type from the model.
        */
      var dataType: js.UndefOr[string | json] = js.native
      
      /**
        * The mime type.
        */
      var mimeType: String = js.native
      
      /**
        * The render timeout.
        */
      var renderTimeout: Double = js.native
      
      /**
        * The renderer instance.
        */
      var renderer: IRenderer = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(context: IContext[IModel], mimeType: String, renderTimeout: Double, renderer: IRenderer): IOptions = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], renderTimeout = renderTimeout.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContext(value: IContext[IModel]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataType(value: string | json): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
        
        @scala.inline
        def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderTimeout(value: Double): Self = StObject.set(x, "renderTimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
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
    
    var _dataType: js.Any = js.native
    
    var _fileType: js.Any = js.native
    
    var _renderTimeout: js.Any = js.native
    
    var _rendermime: js.Any = js.native
  }
  object MimeDocumentFactory {
    
    /**
      * The options used to initialize a MimeDocumentFactory.
      */
    @js.native
    trait IOptions[T /* <: MimeDocument */] extends IWidgetFactoryOptions[T] {
      
      /**
        * Preferred data type from the model.
        */
      var dataType: js.UndefOr[string | json] = js.native
      
      /**
        * The primary file type associated with the document.
        */
      var primaryFileType: js.UndefOr[IFileType] = js.native
      
      /**
        * The render timeout.
        */
      var renderTimeout: js.UndefOr[Double] = js.native
      
      /**
        * The rendermime instance.
        */
      var rendermime: IRenderMimeRegistry = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply[T /* <: MimeDocument */](fileTypes: js.Array[String], name: String, rendermime: IRenderMimeRegistry): typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[T] = {
        val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[T]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[_], T /* <: MimeDocument */] (val x: Self with typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[T]) extends AnyVal {
        
        @scala.inline
        def setDataType(value: string | json): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
        
        @scala.inline
        def setPrimaryFileType(value: IFileType): Self = StObject.set(x, "primaryFileType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimaryFileTypeUndefined: Self = StObject.set(x, "primaryFileType", js.undefined)
        
        @scala.inline
        def setRenderTimeout(value: Double): Self = StObject.set(x, "renderTimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderTimeoutUndefined: Self = StObject.set(x, "renderTimeout", js.undefined)
        
        @scala.inline
        def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
  }
}
