package typings.jupyterlabRendermime

import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabRendermime.anon.Math
import typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions
import typings.jupyterlabRendermime.registryMod.RenderMimeRegistry.IUrlResolverOptions
import typings.jupyterlabRendermime.renderersMod.renderImage.IRenderOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/rendermime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/rendermime", "AttachmentModel")
  @js.native
  class AttachmentModel protected ()
    extends typings.jupyterlabRendermime.attachmentmodelMod.AttachmentModel {
    /**
      * Construct a new attachment model.
      */
    def this(options: IOptions) = this()
  }
  object AttachmentModel {
    
    @JSImport("@jupyterlab/rendermime", "AttachmentModel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the data for an attachment.
      *
      * @params bundle - A kernel attachment MIME bundle.
      *
      * @returns - The data for the payload.
      */
    inline def getData(bundle: IMimeBundle): PartialJSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(bundle.asInstanceOf[js.Any]).asInstanceOf[PartialJSONObject]
  }
  
  @JSImport("@jupyterlab/rendermime", "ILatexTypesetter")
  @js.native
  val ILatexTypesetter: Token[typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter] = js.native
  
  @JSImport("@jupyterlab/rendermime", "IRenderMimeRegistry")
  @js.native
  val IRenderMimeRegistry: Token[typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry] = js.native
  
  @JSImport("@jupyterlab/rendermime", "MimeModel")
  @js.native
  /**
    * Construct a new mime model.
    */
  class MimeModel ()
    extends typings.jupyterlabRendermime.mimemodelMod.MimeModel {
    def this(options: typings.jupyterlabRendermime.mimemodelMod.MimeModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "OutputModel")
  @js.native
  class OutputModel protected ()
    extends typings.jupyterlabRendermime.outputmodelMod.OutputModel {
    /**
      * Construct a new output model.
      */
    def this(options: typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions) = this()
  }
  object OutputModel {
    
    @JSImport("@jupyterlab/rendermime", "OutputModel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the data for an output.
      *
      * @params output - A kernel output message payload.
      *
      * @returns - The data for the payload.
      */
    inline def getData(output: IOutput): PartialJSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(output.asInstanceOf[js.Any]).asInstanceOf[PartialJSONObject]
    
    /**
      * Get the metadata from an output message.
      *
      * @params output - A kernel output message payload.
      *
      * @returns - The metadata for the payload.
      */
    inline def getMetadata(output: IOutput): PartialJSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(output.asInstanceOf[js.Any]).asInstanceOf[PartialJSONObject]
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderMimeRegistry")
  @js.native
  /**
    * Construct a new rendermime.
    *
    * @param options - The options for initializing the instance.
    */
  class RenderMimeRegistry ()
    extends typings.jupyterlabRendermime.registryMod.RenderMimeRegistry {
    def this(options: typings.jupyterlabRendermime.registryMod.RenderMimeRegistry.IOptions) = this()
  }
  object RenderMimeRegistry {
    
    /**
      * A default resolver that uses a given reference path and a contents manager.
      */
    @JSImport("@jupyterlab/rendermime", "RenderMimeRegistry.UrlResolver")
    @js.native
    class UrlResolver protected ()
      extends typings.jupyterlabRendermime.registryMod.RenderMimeRegistry.UrlResolver {
      /**
        * Create a new url resolver.
        */
      def this(options: IUrlResolverOptions) = this()
    }
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedCommon")
  @js.native
  abstract class RenderedCommon protected ()
    extends typings.jupyterlabRendermime.widgetsMod.RenderedCommon {
    /**
      * Construct a new rendered common widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedHTML")
  @js.native
  class RenderedHTML protected ()
    extends typings.jupyterlabRendermime.widgetsMod.RenderedHTML {
    /**
      * Construct a new rendered HTML widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedHTMLCommon")
  @js.native
  abstract class RenderedHTMLCommon protected ()
    extends typings.jupyterlabRendermime.widgetsMod.RenderedHTMLCommon {
    /**
      * Construct a new rendered HTML common widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedImage")
  @js.native
  class RenderedImage protected ()
    extends typings.jupyterlabRendermime.widgetsMod.RenderedImage {
    /**
      * Construct a new rendered image widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedJavaScript")
  @js.native
  class RenderedJavaScript protected ()
    extends typings.jupyterlabRendermime.widgetsMod.RenderedJavaScript {
    /**
      * Construct a new rendered text widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedLatex")
  @js.native
  class RenderedLatex protected ()
    extends typings.jupyterlabRendermime.widgetsMod.RenderedLatex {
    /**
      * Construct a new rendered LaTeX widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedMarkdown")
  @js.native
  class RenderedMarkdown protected ()
    extends typings.jupyterlabRendermime.widgetsMod.RenderedMarkdown {
    /**
      * Construct a new rendered markdown widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedSVG")
  @js.native
  class RenderedSVG protected ()
    extends typings.jupyterlabRendermime.widgetsMod.RenderedSVG {
    /**
      * Construct a new rendered SVG widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedText")
  @js.native
  class RenderedText protected ()
    extends typings.jupyterlabRendermime.widgetsMod.RenderedText {
    /**
      * Construct a new rendered text widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "htmlRendererFactory")
  @js.native
  val htmlRendererFactory: IRendererFactory = js.native
  
  @JSImport("@jupyterlab/rendermime", "imageRendererFactory")
  @js.native
  val imageRendererFactory: IRendererFactory = js.native
  
  @JSImport("@jupyterlab/rendermime", "javaScriptRendererFactory")
  @js.native
  val javaScriptRendererFactory: IRendererFactory = js.native
  
  @JSImport("@jupyterlab/rendermime", "latexRendererFactory")
  @js.native
  val latexRendererFactory: IRendererFactory = js.native
  
  @JSImport("@jupyterlab/rendermime", "markdownRendererFactory")
  @js.native
  val markdownRendererFactory: IRendererFactory = js.native
  
  inline def removeMath(text: String): Math = ^.asInstanceOf[js.Dynamic].applyDynamic("removeMath")(text.asInstanceOf[js.Any]).asInstanceOf[Math]
  
  inline def renderHTML(options: typings.jupyterlabRendermime.renderersMod.renderHTML.IOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderHTML")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def renderImage(options: IRenderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderImage")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def renderLatex(options: typings.jupyterlabRendermime.renderersMod.renderLatex.IRenderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderLatex")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def renderMarkdown(options: typings.jupyterlabRendermime.renderersMod.renderMarkdown.IRenderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def renderSVG(options: typings.jupyterlabRendermime.renderersMod.renderSVG.IRenderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderSVG")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def renderText(options: typings.jupyterlabRendermime.renderersMod.renderText.IRenderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def replaceMath(text: String, math: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceMath")(text.asInstanceOf[js.Any], math.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@jupyterlab/rendermime", "standardRendererFactories")
  @js.native
  val standardRendererFactories: js.Array[IRendererFactory] = js.native
  
  @JSImport("@jupyterlab/rendermime", "svgRendererFactory")
  @js.native
  val svgRendererFactory: IRendererFactory = js.native
  
  @JSImport("@jupyterlab/rendermime", "textRendererFactory")
  @js.native
  val textRendererFactory: IRendererFactory = js.native
}
