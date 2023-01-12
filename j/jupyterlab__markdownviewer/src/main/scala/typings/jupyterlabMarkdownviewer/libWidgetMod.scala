package typings.jupyterlabMarkdownviewer

import typings.jupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptions
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IFileType
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.mod.DocumentWidget
import typings.jupyterlabMarkdownviewer.jupyterlabMarkdownviewerStrings.fontFamily
import typings.jupyterlabMarkdownviewer.jupyterlabMarkdownviewerStrings.fontSize
import typings.jupyterlabMarkdownviewer.jupyterlabMarkdownviewerStrings.hideFrontMatter
import typings.jupyterlabMarkdownviewer.jupyterlabMarkdownviewerStrings.lineHeight
import typings.jupyterlabMarkdownviewer.jupyterlabMarkdownviewerStrings.lineWidth
import typings.jupyterlabMarkdownviewer.jupyterlabMarkdownviewerStrings.renderTimeout
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWidgetMod {
  
  @JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownDocument")
  @js.native
  open class MarkdownDocument protected () extends DocumentWidget[MarkdownViewer, IModel] {
    def this(options: IOptions[MarkdownViewer, IModel]) = this()
  }
  
  @JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownViewer")
  @js.native
  open class MarkdownViewer protected () extends Widget {
    /**
      * Construct a new markdown viewer widget.
      */
    def this(options: typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer.IOptions) = this()
    
    /* private */ var _config: Any = js.native
    
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
    
    val context: Context = js.native
    
    /**
      * A promise that resolves when the markdown viewer is ready.
      */
    def ready: js.Promise[Unit] = js.native
    
    val renderer: IRenderer = js.native
    
    /**
      * Set URI fragment identifier.
      */
    def setFragment(fragment: String): Unit = js.native
    
    /**
      * Set a config option for the markdown viewer.
      */
    @JSName("setOption")
    def setOption_fontFamily(option: fontFamily): Unit = js.native
    @JSName("setOption")
    def setOption_fontFamily(option: fontFamily, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_fontSize(option: fontSize): Unit = js.native
    @JSName("setOption")
    def setOption_fontSize(option: fontSize, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_hideFrontMatter(option: hideFrontMatter, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_lineHeight(option: lineHeight): Unit = js.native
    @JSName("setOption")
    def setOption_lineHeight(option: lineHeight, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_lineWidth(option: lineWidth): Unit = js.native
    @JSName("setOption")
    def setOption_lineWidth(option: lineWidth, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_renderTimeout(option: renderTimeout, value: Double): Unit = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  object MarkdownViewer {
    
    /**
      * The default configuration options for an editor.
      */
    @JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownViewer.defaultConfig")
    @js.native
    val defaultConfig: IConfig = js.native
    
    trait IConfig extends StObject {
      
      /**
        * User preferred font family for markdown viewer.
        */
      var fontFamily: String | Null
      
      /**
        * User preferred size in pixel of the font used in markdown viewer.
        */
      var fontSize: Double | Null
      
      /**
        * Whether to hide the YALM front matter.
        */
      var hideFrontMatter: Boolean
      
      /**
        * User preferred text line height, as a multiplier of font size.
        */
      var lineHeight: Double | Null
      
      /**
        * User preferred text line width expressed in CSS ch units.
        */
      var lineWidth: Double | Null
      
      /**
        * The render timeout.
        */
      var renderTimeout: Double
    }
    object IConfig {
      
      inline def apply(hideFrontMatter: Boolean, renderTimeout: Double): IConfig = {
        val __obj = js.Dynamic.literal(hideFrontMatter = hideFrontMatter.asInstanceOf[js.Any], renderTimeout = renderTimeout.asInstanceOf[js.Any], fontFamily = null, fontSize = null, lineHeight = null, lineWidth = null)
        __obj.asInstanceOf[IConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
        
        inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        inline def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
        
        inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
        
        inline def setHideFrontMatter(value: Boolean): Self = StObject.set(x, "hideFrontMatter", value.asInstanceOf[js.Any])
        
        inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
        
        inline def setLineHeightNull: Self = StObject.set(x, "lineHeight", null)
        
        inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
        
        inline def setLineWidthNull: Self = StObject.set(x, "lineWidth", null)
        
        inline def setRenderTimeout(value: Double): Self = StObject.set(x, "renderTimeout", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The options used to initialize a MarkdownViewer.
      */
    trait IOptions extends StObject {
      
      /**
        * Context
        */
      var context: IContext[IModel]
      
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
      
      inline def apply(context: IContext[IModel], renderer: IRenderer): typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer.IOptions = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer.IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer.IOptions] (val x: Self) extends AnyVal {
        
        inline def setContext(value: IContext[IModel]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownViewerFactory")
  @js.native
  open class MarkdownViewerFactory protected () extends ABCWidgetFactory[MarkdownDocument, IModel] {
    /**
      * Construct a new markdown viewer widget factory.
      */
    def this(options: typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory.IOptions) = this()
    
    /* private */ var _fileType: Any = js.native
    
    /* private */ var _rendermime: Any = js.native
  }
  object MarkdownViewerFactory {
    
    /**
      * The options used to initialize a MarkdownViewerFactory.
      */
    trait IOptions
      extends StObject
         with IWidgetFactoryOptions[Widget] {
      
      /**
        * The primary file type associated with the document.
        */
      var primaryFileType: js.UndefOr[IFileType] = js.undefined
      
      /**
        * The rendermime instance.
        */
      var rendermime: IRenderMimeRegistry
    }
    object IOptions {
      
      inline def apply(fileTypes: js.Array[String], name: String, rendermime: IRenderMimeRegistry): typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory.IOptions = {
        val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory.IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory.IOptions] (val x: Self) extends AnyVal {
        
        inline def setPrimaryFileType(value: IFileType): Self = StObject.set(x, "primaryFileType", value.asInstanceOf[js.Any])
        
        inline def setPrimaryFileTypeUndefined: Self = StObject.set(x, "primaryFileType", js.undefined)
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
  }
}
