package typings.jupyterlabMarkdownviewer

import typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions
import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.mod.DocumentWidget
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabMarkdownviewer.jupyterlabMarkdownviewerStrings.fontFamily
import typings.jupyterlabMarkdownviewer.jupyterlabMarkdownviewerStrings.fontSize
import typings.jupyterlabMarkdownviewer.jupyterlabMarkdownviewerStrings.hideFrontMatter
import typings.jupyterlabMarkdownviewer.jupyterlabMarkdownviewerStrings.lineHeight
import typings.jupyterlabMarkdownviewer.jupyterlabMarkdownviewerStrings.lineWidth
import typings.jupyterlabMarkdownviewer.jupyterlabMarkdownviewerStrings.renderTimeout
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownDocument")
  @js.native
  class MarkdownDocument protected () extends DocumentWidget[MarkdownViewer, IModel] {
    def this(options: IOptions[MarkdownViewer, IModel]) = this()
  }
  
  @JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownViewer")
  @js.native
  class MarkdownViewer protected () extends Widget {
    /**
      * Construct a new markdown viewer widget.
      */
    def this(options: typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer.IOptions) = this()
    
    var _config: js.Any = js.native
    
    var _fragment: js.Any = js.native
    
    var _isRendering: js.Any = js.native
    
    var _monitor: js.Any = js.native
    
    var _ready: js.Any = js.native
    
    /**
      * Render the mime content.
      */
    var _render: js.Any = js.native
    
    var _renderRequested: js.Any = js.native
    
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
  }
  object MarkdownViewer {
    
    /**
      * The default configuration options for an editor.
      */
    @JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownViewer.defaultConfig")
    @js.native
    val defaultConfig: IConfig = js.native
    
    @js.native
    trait IConfig extends StObject {
      
      /**
        * User preferred font family for markdown viewer.
        */
      var fontFamily: String | Null = js.native
      
      /**
        * User preferred size in pixel of the font used in markdown viewer.
        */
      var fontSize: Double | Null = js.native
      
      /**
        * Whether to hide the YALM front matter.
        */
      var hideFrontMatter: Boolean = js.native
      
      /**
        * User preferred text line height, as a multiplier of font size.
        */
      var lineHeight: Double | Null = js.native
      
      /**
        * User preferred text line width expressed in CSS ch units.
        */
      var lineWidth: Double | Null = js.native
      
      /**
        * The render timeout.
        */
      var renderTimeout: Double = js.native
    }
    object IConfig {
      
      @scala.inline
      def apply(hideFrontMatter: Boolean, renderTimeout: Double): IConfig = {
        val __obj = js.Dynamic.literal(hideFrontMatter = hideFrontMatter.asInstanceOf[js.Any], renderTimeout = renderTimeout.asInstanceOf[js.Any])
        __obj.asInstanceOf[IConfig]
      }
      
      @scala.inline
      implicit class IConfigMutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
        
        @scala.inline
        def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
        
        @scala.inline
        def setHideFrontMatter(value: Boolean): Self = StObject.set(x, "hideFrontMatter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineHeightNull: Self = StObject.set(x, "lineHeight", null)
        
        @scala.inline
        def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineWidthNull: Self = StObject.set(x, "lineWidth", null)
        
        @scala.inline
        def setRenderTimeout(value: Double): Self = StObject.set(x, "renderTimeout", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The options used to initialize a MarkdownViewer.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * Context
        */
      var context: IContext[IModel] = js.native
      
      /**
        * The renderer instance.
        */
      var renderer: IRenderer = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(context: IContext[IModel], renderer: IRenderer): typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer.IOptions = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContext(value: IContext[IModel]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownViewerFactory")
  @js.native
  class MarkdownViewerFactory protected () extends ABCWidgetFactory[MarkdownDocument, IModel] {
    /**
      * Construct a new markdown viewer widget factory.
      */
    def this(options: typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory.IOptions) = this()
    
    var _fileType: js.Any = js.native
    
    var _rendermime: js.Any = js.native
  }
  object MarkdownViewerFactory {
    
    /**
      * The options used to initialize a MarkdownViewerFactory.
      */
    @js.native
    trait IOptions extends IWidgetFactoryOptions[Widget] {
      
      /**
        * The primary file type associated with the document.
        */
      var primaryFileType: js.UndefOr[IFileType] = js.native
      
      /**
        * The rendermime instance.
        */
      var rendermime: IRenderMimeRegistry = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(fileTypes: js.Array[String], name: String, rendermime: IRenderMimeRegistry): typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory.IOptions = {
        val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPrimaryFileType(value: IFileType): Self = StObject.set(x, "primaryFileType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimaryFileTypeUndefined: Self = StObject.set(x, "primaryFileType", js.undefined)
        
        @scala.inline
        def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
  }
}
