package typings.jupyterlabRendermime

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ISanitizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetsMod {
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedCommon")
  @js.native
  abstract class RenderedCommon protected () extends IRenderer {
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
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedHTML")
  @js.native
  class RenderedHTML protected () extends RenderedHTMLCommon {
    /**
      * Construct a new rendered HTML widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedHTMLCommon")
  @js.native
  abstract class RenderedHTMLCommon protected () extends RenderedCommon {
    /**
      * Construct a new rendered HTML common widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedImage")
  @js.native
  class RenderedImage protected () extends RenderedCommon {
    /**
      * Construct a new rendered image widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedJavaScript")
  @js.native
  class RenderedJavaScript protected () extends RenderedCommon {
    /**
      * Construct a new rendered text widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedLatex")
  @js.native
  class RenderedLatex protected () extends RenderedCommon {
    /**
      * Construct a new rendered LaTeX widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedMarkdown")
  @js.native
  class RenderedMarkdown protected () extends RenderedHTMLCommon {
    /**
      * Construct a new rendered markdown widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedSVG")
  @js.native
  class RenderedSVG protected () extends RenderedCommon {
    /**
      * Construct a new rendered SVG widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedText")
  @js.native
  class RenderedText protected () extends RenderedCommon {
    /**
      * Construct a new rendered text widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
}
