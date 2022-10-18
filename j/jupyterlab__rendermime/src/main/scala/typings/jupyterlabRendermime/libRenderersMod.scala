package typings.jupyterlabRendermime

import typings.jupyterlabApputils.libTokensMod.ISanitizer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRenderersMod {
  
  object renderHTML {
    
    inline def apply(options: IOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("@jupyterlab/rendermime/lib/renderers", "renderHTML")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for the `renderHTML` function.
      */
    trait IOptions extends StObject {
      
      /**
        * The host node for the rendered HTML.
        */
      var host: HTMLElement
      
      /**
        * The LaTeX typesetter for the application.
        */
      var latexTypesetter: ILatexTypesetter | Null
      
      /**
        * An optional link handler.
        */
      var linkHandler: ILinkHandler | Null
      
      /**
        * An optional url resolver.
        */
      var resolver: IResolver | Null
      
      /**
        * The html sanitizer for untrusted source.
        */
      var sanitizer: ISanitizer
      
      /**
        * Whether the node should be typeset.
        */
      var shouldTypeset: Boolean
      
      /**
        * The HTML source to render.
        */
      var source: String
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
      
      /**
        * Whether the source is trusted.
        */
      var trusted: Boolean
    }
    object IOptions {
      
      inline def apply(host: HTMLElement, sanitizer: ISanitizer, shouldTypeset: Boolean, source: String, trusted: Boolean): IOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], latexTypesetter = null, linkHandler = null, resolver = null)
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setLatexTypesetter(value: ILatexTypesetter): Self = StObject.set(x, "latexTypesetter", value.asInstanceOf[js.Any])
        
        inline def setLatexTypesetterNull: Self = StObject.set(x, "latexTypesetter", null)
        
        inline def setLinkHandler(value: ILinkHandler): Self = StObject.set(x, "linkHandler", value.asInstanceOf[js.Any])
        
        inline def setLinkHandlerNull: Self = StObject.set(x, "linkHandler", null)
        
        inline def setResolver(value: IResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
        
        inline def setResolverNull: Self = StObject.set(x, "resolver", null)
        
        inline def setSanitizer(value: ISanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
        
        inline def setShouldTypeset(value: Boolean): Self = StObject.set(x, "shouldTypeset", value.asInstanceOf[js.Any])
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
        
        inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object renderImage {
    
    inline def apply(options: IRenderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("@jupyterlab/rendermime/lib/renderers", "renderImage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for the `renderImage` function.
      */
    trait IRenderOptions extends StObject {
      
      /**
        * The optional height for the image.
        */
      var height: js.UndefOr[Double] = js.undefined
      
      /**
        * The image node to update with the content.
        */
      var host: HTMLElement
      
      /**
        * The mime type for the image.
        */
      var mimeType: String
      
      /**
        * Whether an image requires a background for legibility.
        */
      var needsBackground: js.UndefOr[String] = js.undefined
      
      /**
        * The base64 encoded source for the image.
        */
      var source: String
      
      /**
        * Whether the image should be unconfined.
        */
      var unconfined: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The optional width for the image.
        */
      var width: js.UndefOr[Double] = js.undefined
    }
    object IRenderOptions {
      
      inline def apply(host: HTMLElement, mimeType: String, source: String): IRenderOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderOptions]
      }
      
      extension [Self <: IRenderOptions](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        inline def setNeedsBackground(value: String): Self = StObject.set(x, "needsBackground", value.asInstanceOf[js.Any])
        
        inline def setNeedsBackgroundUndefined: Self = StObject.set(x, "needsBackground", js.undefined)
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setUnconfined(value: Boolean): Self = StObject.set(x, "unconfined", value.asInstanceOf[js.Any])
        
        inline def setUnconfinedUndefined: Self = StObject.set(x, "unconfined", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
  }
  
  object renderLatex {
    
    inline def apply(options: IRenderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("@jupyterlab/rendermime/lib/renderers", "renderLatex")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for the `renderLatex` function.
      */
    trait IRenderOptions extends StObject {
      
      /**
        * The host node for the rendered LaTeX.
        */
      var host: HTMLElement
      
      /**
        * The LaTeX typesetter for the application.
        */
      var latexTypesetter: ILatexTypesetter | Null
      
      /**
        * Whether the node should be typeset.
        */
      var shouldTypeset: Boolean
      
      /**
        * The LaTeX source to render.
        */
      var source: String
    }
    object IRenderOptions {
      
      inline def apply(host: HTMLElement, shouldTypeset: Boolean, source: String): IRenderOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], latexTypesetter = null)
        __obj.asInstanceOf[IRenderOptions]
      }
      
      extension [Self <: IRenderOptions](x: Self) {
        
        inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setLatexTypesetter(value: ILatexTypesetter): Self = StObject.set(x, "latexTypesetter", value.asInstanceOf[js.Any])
        
        inline def setLatexTypesetterNull: Self = StObject.set(x, "latexTypesetter", null)
        
        inline def setShouldTypeset(value: Boolean): Self = StObject.set(x, "shouldTypeset", value.asInstanceOf[js.Any])
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object renderMarkdown {
    
    inline def apply(options: IRenderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("@jupyterlab/rendermime/lib/renderers", "renderMarkdown")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for the `renderMarkdown` function.
      */
    trait IRenderOptions extends StObject {
      
      /**
        * The host node for the rendered Markdown.
        */
      var host: HTMLElement
      
      /**
        * The LaTeX typesetter for the application.
        */
      var latexTypesetter: ILatexTypesetter | Null
      
      /**
        * An optional link handler.
        */
      var linkHandler: ILinkHandler | Null
      
      /**
        * An optional url resolver.
        */
      var resolver: IResolver | Null
      
      /**
        * The html sanitizer for untrusted source.
        */
      var sanitizer: ISanitizer
      
      /**
        * Whether the node should be typeset.
        */
      var shouldTypeset: Boolean
      
      /**
        * The Markdown source to render.
        */
      var source: String
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
      
      /**
        * Whether the source is trusted.
        */
      var trusted: Boolean
    }
    object IRenderOptions {
      
      inline def apply(host: HTMLElement, sanitizer: ISanitizer, shouldTypeset: Boolean, source: String, trusted: Boolean): IRenderOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], latexTypesetter = null, linkHandler = null, resolver = null)
        __obj.asInstanceOf[IRenderOptions]
      }
      
      extension [Self <: IRenderOptions](x: Self) {
        
        inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setLatexTypesetter(value: ILatexTypesetter): Self = StObject.set(x, "latexTypesetter", value.asInstanceOf[js.Any])
        
        inline def setLatexTypesetterNull: Self = StObject.set(x, "latexTypesetter", null)
        
        inline def setLinkHandler(value: ILinkHandler): Self = StObject.set(x, "linkHandler", value.asInstanceOf[js.Any])
        
        inline def setLinkHandlerNull: Self = StObject.set(x, "linkHandler", null)
        
        inline def setResolver(value: IResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
        
        inline def setResolverNull: Self = StObject.set(x, "resolver", null)
        
        inline def setSanitizer(value: ISanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
        
        inline def setShouldTypeset(value: Boolean): Self = StObject.set(x, "shouldTypeset", value.asInstanceOf[js.Any])
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
        
        inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object renderSVG {
    
    inline def apply(options: IRenderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("@jupyterlab/rendermime/lib/renderers", "renderSVG")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for the `renderSVG` function.
      */
    trait IRenderOptions extends StObject {
      
      /**
        * The host node for the rendered SVG.
        */
      var host: HTMLElement
      
      /**
        * The SVG source.
        */
      var source: String
      
      /**
        * The application language translator.
        */
      var translator: ITranslator
      
      /**
        * Whether the source is trusted.
        */
      var trusted: Boolean
      
      /**
        * Whether the svg should be unconfined.
        */
      var unconfined: js.UndefOr[Boolean] = js.undefined
    }
    object IRenderOptions {
      
      inline def apply(host: HTMLElement, source: String, translator: ITranslator, trusted: Boolean): IRenderOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], translator = translator.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderOptions]
      }
      
      extension [Self <: IRenderOptions](x: Self) {
        
        inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
        
        inline def setUnconfined(value: Boolean): Self = StObject.set(x, "unconfined", value.asInstanceOf[js.Any])
        
        inline def setUnconfinedUndefined: Self = StObject.set(x, "unconfined", js.undefined)
      }
    }
  }
  
  object renderText {
    
    inline def apply(options: IRenderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("@jupyterlab/rendermime/lib/renderers", "renderText")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for the `renderText` function.
      */
    trait IRenderOptions extends StObject {
      
      /**
        * The host node for the text content.
        */
      var host: HTMLElement
      
      /**
        * The html sanitizer for untrusted source.
        */
      var sanitizer: ISanitizer
      
      /**
        * The source text to render.
        */
      var source: String
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IRenderOptions {
      
      inline def apply(host: HTMLElement, sanitizer: ISanitizer, source: String): IRenderOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderOptions]
      }
      
      extension [Self <: IRenderOptions](x: Self) {
        
        inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setSanitizer(value: ISanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}
