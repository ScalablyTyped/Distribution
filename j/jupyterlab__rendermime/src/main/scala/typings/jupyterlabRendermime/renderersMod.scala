package typings.jupyterlabRendermime

import typings.jupyterlabApputils.sanitizerMod.ISanitizer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderersMod {
  
  object renderHTML {
    
    @JSImport("@jupyterlab/rendermime/lib/renderers", "renderHTML")
    @js.native
    def apply(options: IOptions): js.Promise[Unit] = js.native
    
    /**
      * The options for the `renderHTML` function.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The host node for the rendered HTML.
        */
      var host: HTMLElement = js.native
      
      /**
        * The LaTeX typesetter for the application.
        */
      var latexTypesetter: ILatexTypesetter | Null = js.native
      
      /**
        * An optional link handler.
        */
      var linkHandler: ILinkHandler | Null = js.native
      
      /**
        * An optional url resolver.
        */
      var resolver: IResolver | Null = js.native
      
      /**
        * The html sanitizer for untrusted source.
        */
      var sanitizer: ISanitizer = js.native
      
      /**
        * Whether the node should be typeset.
        */
      var shouldTypeset: Boolean = js.native
      
      /**
        * The HTML source to render.
        */
      var source: String = js.native
      
      /**
        * Whether the source is trusted.
        */
      var trusted: Boolean = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(host: HTMLElement, sanitizer: ISanitizer, shouldTypeset: Boolean, source: String, trusted: Boolean): IOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatexTypesetter(value: ILatexTypesetter): Self = StObject.set(x, "latexTypesetter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatexTypesetterNull: Self = StObject.set(x, "latexTypesetter", null)
        
        @scala.inline
        def setLinkHandler(value: ILinkHandler): Self = StObject.set(x, "linkHandler", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkHandlerNull: Self = StObject.set(x, "linkHandler", null)
        
        @scala.inline
        def setResolver(value: IResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResolverNull: Self = StObject.set(x, "resolver", null)
        
        @scala.inline
        def setSanitizer(value: ISanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShouldTypeset(value: Boolean): Self = StObject.set(x, "shouldTypeset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object renderImage {
    
    @JSImport("@jupyterlab/rendermime/lib/renderers", "renderImage")
    @js.native
    def apply(options: IRenderOptions): js.Promise[Unit] = js.native
    
    /**
      * The options for the `renderImage` function.
      */
    @js.native
    trait IRenderOptions extends StObject {
      
      /**
        * The optional height for the image.
        */
      var height: js.UndefOr[Double] = js.native
      
      /**
        * The image node to update with the content.
        */
      var host: HTMLElement = js.native
      
      /**
        * The mime type for the image.
        */
      var mimeType: String = js.native
      
      /**
        * Whether an image requires a background for legibility.
        */
      var needsBackground: js.UndefOr[String] = js.native
      
      /**
        * The base64 encoded source for the image.
        */
      var source: String = js.native
      
      /**
        * Whether the image should be unconfined.
        */
      var unconfined: js.UndefOr[Boolean] = js.native
      
      /**
        * The optional width for the image.
        */
      var width: js.UndefOr[Double] = js.native
    }
    object IRenderOptions {
      
      @scala.inline
      def apply(host: HTMLElement, mimeType: String, source: String): IRenderOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderOptions]
      }
      
      @scala.inline
      implicit class IRenderOptionsMutableBuilder[Self <: IRenderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNeedsBackground(value: String): Self = StObject.set(x, "needsBackground", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNeedsBackgroundUndefined: Self = StObject.set(x, "needsBackground", js.undefined)
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnconfined(value: Boolean): Self = StObject.set(x, "unconfined", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnconfinedUndefined: Self = StObject.set(x, "unconfined", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
  }
  
  object renderLatex {
    
    @JSImport("@jupyterlab/rendermime/lib/renderers", "renderLatex")
    @js.native
    def apply(options: IRenderOptions): js.Promise[Unit] = js.native
    
    /**
      * The options for the `renderLatex` function.
      */
    @js.native
    trait IRenderOptions extends StObject {
      
      /**
        * The host node for the rendered LaTeX.
        */
      var host: HTMLElement = js.native
      
      /**
        * The LaTeX typesetter for the application.
        */
      var latexTypesetter: ILatexTypesetter | Null = js.native
      
      /**
        * Whether the node should be typeset.
        */
      var shouldTypeset: Boolean = js.native
      
      /**
        * The LaTeX source to render.
        */
      var source: String = js.native
    }
    object IRenderOptions {
      
      @scala.inline
      def apply(host: HTMLElement, shouldTypeset: Boolean, source: String): IRenderOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderOptions]
      }
      
      @scala.inline
      implicit class IRenderOptionsMutableBuilder[Self <: IRenderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatexTypesetter(value: ILatexTypesetter): Self = StObject.set(x, "latexTypesetter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatexTypesetterNull: Self = StObject.set(x, "latexTypesetter", null)
        
        @scala.inline
        def setShouldTypeset(value: Boolean): Self = StObject.set(x, "shouldTypeset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object renderMarkdown {
    
    @JSImport("@jupyterlab/rendermime/lib/renderers", "renderMarkdown")
    @js.native
    def apply(options: IRenderOptions): js.Promise[Unit] = js.native
    
    /**
      * The options for the `renderMarkdown` function.
      */
    @js.native
    trait IRenderOptions extends StObject {
      
      /**
        * The host node for the rendered Markdown.
        */
      var host: HTMLElement = js.native
      
      /**
        * The LaTeX typesetter for the application.
        */
      var latexTypesetter: ILatexTypesetter | Null = js.native
      
      /**
        * An optional link handler.
        */
      var linkHandler: ILinkHandler | Null = js.native
      
      /**
        * An optional url resolver.
        */
      var resolver: IResolver | Null = js.native
      
      /**
        * The html sanitizer for untrusted source.
        */
      var sanitizer: ISanitizer = js.native
      
      /**
        * Whether the node should be typeset.
        */
      var shouldTypeset: Boolean = js.native
      
      /**
        * The Markdown source to render.
        */
      var source: String = js.native
      
      /**
        * Whether the source is trusted.
        */
      var trusted: Boolean = js.native
    }
    object IRenderOptions {
      
      @scala.inline
      def apply(host: HTMLElement, sanitizer: ISanitizer, shouldTypeset: Boolean, source: String, trusted: Boolean): IRenderOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderOptions]
      }
      
      @scala.inline
      implicit class IRenderOptionsMutableBuilder[Self <: IRenderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatexTypesetter(value: ILatexTypesetter): Self = StObject.set(x, "latexTypesetter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatexTypesetterNull: Self = StObject.set(x, "latexTypesetter", null)
        
        @scala.inline
        def setLinkHandler(value: ILinkHandler): Self = StObject.set(x, "linkHandler", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkHandlerNull: Self = StObject.set(x, "linkHandler", null)
        
        @scala.inline
        def setResolver(value: IResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResolverNull: Self = StObject.set(x, "resolver", null)
        
        @scala.inline
        def setSanitizer(value: ISanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShouldTypeset(value: Boolean): Self = StObject.set(x, "shouldTypeset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object renderSVG {
    
    @JSImport("@jupyterlab/rendermime/lib/renderers", "renderSVG")
    @js.native
    def apply(options: IRenderOptions): js.Promise[Unit] = js.native
    
    /**
      * The options for the `renderSVG` function.
      */
    @js.native
    trait IRenderOptions extends StObject {
      
      /**
        * The host node for the rendered SVG.
        */
      var host: HTMLElement = js.native
      
      /**
        * The SVG source.
        */
      var source: String = js.native
      
      /**
        * Whether the source is trusted.
        */
      var trusted: Boolean = js.native
      
      /**
        * Whether the svg should be unconfined.
        */
      var unconfined: js.UndefOr[Boolean] = js.native
    }
    object IRenderOptions {
      
      @scala.inline
      def apply(host: HTMLElement, source: String, trusted: Boolean): IRenderOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderOptions]
      }
      
      @scala.inline
      implicit class IRenderOptionsMutableBuilder[Self <: IRenderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnconfined(value: Boolean): Self = StObject.set(x, "unconfined", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnconfinedUndefined: Self = StObject.set(x, "unconfined", js.undefined)
      }
    }
  }
  
  object renderText {
    
    @JSImport("@jupyterlab/rendermime/lib/renderers", "renderText")
    @js.native
    def apply(options: IRenderOptions): js.Promise[Unit] = js.native
    
    /**
      * The options for the `renderText` function.
      */
    @js.native
    trait IRenderOptions extends StObject {
      
      /**
        * The host node for the text content.
        */
      var host: HTMLElement = js.native
      
      /**
        * The html sanitizer for untrusted source.
        */
      var sanitizer: ISanitizer = js.native
      
      /**
        * The source text to render.
        */
      var source: String = js.native
    }
    object IRenderOptions {
      
      @scala.inline
      def apply(host: HTMLElement, sanitizer: ISanitizer, source: String): IRenderOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderOptions]
      }
      
      @scala.inline
      implicit class IRenderOptionsMutableBuilder[Self <: IRenderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSanitizer(value: ISanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
  }
}
