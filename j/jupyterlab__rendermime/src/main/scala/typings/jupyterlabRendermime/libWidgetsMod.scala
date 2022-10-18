package typings.jupyterlabRendermime

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ISanitizer
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWidgetsMod {
  
  /* note: abstract class */ @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedCommon")
  @js.native
  open class RenderedCommon protected () extends IRenderer {
    /**
      * Construct a new rendered common widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
    
    /**
      * The latexTypesetter.
      */
    val latexTypesetter: ILatexTypesetter | Null = js.native
    
    /**
      * The link handler.
      */
    val linkHandler: ILinkHandler | Null = js.native
    
    /**
      * The mimetype being rendered.
      */
    val mimeType: String = js.native
    
    /**
      * Render the mime model.
      *
      * @param model - The mime model to render.
      *
      * @returns A promise which resolves when rendering is complete.
      */
    def render(model: IMimeModel): js.Promise[Unit] = js.native
    
    /**
      * The resolver object.
      */
    val resolver: IResolver | Null = js.native
    
    /**
      * The sanitizer used to sanitize untrusted html inputs.
      */
    val sanitizer: ISanitizer = js.native
    
    /**
      * Set the URI fragment identifier.
      *
      * @param fragment - The URI fragment identifier.
      */
    /* protected */ def setFragment(fragment: String): Unit = js.native
    
    /**
      * The translator.
      */
    @JSName("translator")
    val translator_RenderedCommon: ITranslator = js.native
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedHTML")
  @js.native
  open class RenderedHTML protected () extends RenderedHTMLCommon {
    /**
      * Construct a new rendered HTML widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedHTMLCommon")
  @js.native
  open class RenderedHTMLCommon protected () extends RenderedCommon {
    /**
      * Construct a new rendered HTML common widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedImage")
  @js.native
  open class RenderedImage protected () extends RenderedCommon {
    /**
      * Construct a new rendered image widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedJavaScript")
  @js.native
  open class RenderedJavaScript protected () extends RenderedCommon {
    /**
      * Construct a new rendered text widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedLatex")
  @js.native
  open class RenderedLatex protected () extends RenderedCommon {
    /**
      * Construct a new rendered LaTeX widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedMarkdown")
  @js.native
  open class RenderedMarkdown protected () extends RenderedHTMLCommon {
    /**
      * Construct a new rendered markdown widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedSVG")
  @js.native
  open class RenderedSVG protected () extends RenderedCommon {
    /**
      * Construct a new rendered SVG widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedText")
  @js.native
  open class RenderedText protected () extends RenderedCommon {
    /**
      * Construct a new rendered text widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
}
