package typings.jupyterlabRendermime

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApputils.sanitizerMod.ISanitizer
import typings.jupyterlabRendermime.jupyterlabRendermimeStrings.any
import typings.jupyterlabRendermime.jupyterlabRendermimeStrings.ensure
import typings.jupyterlabRendermime.jupyterlabRendermimeStrings.prefer
import typings.jupyterlabRendermime.mimemodelMod.MimeModel
import typings.jupyterlabRendermime.mimemodelMod.MimeModel.IOptions
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry.ICloneOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @JSImport("@jupyterlab/rendermime/lib/tokens", "ILatexTypesetter")
  @js.native
  val ILatexTypesetter: Token[typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter] = js.native
  type ILatexTypesetter = typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
  
  @js.native
  trait IRenderMimeRegistry extends StObject {
    
    /**
      * Add a renderer factory to the rendermime.
      *
      * @param factory - The renderer factory of interest.
      *
      * @param rank - The rank of the renderer. A lower rank indicates
      *   a higher priority for rendering. If not given, the rank will
      *   defer to the `defaultRank` of the factory.  If no `defaultRank`
      *   is given, it will default to 100.
      *
      * #### Notes
      * The renderer will replace an existing renderer for the given
      * mimeType.
      */
    def addFactory(factory: IRendererFactory): Unit = js.native
    def addFactory(factory: IRendererFactory, rank: Double): Unit = js.native
    
    def clone(options: ICloneOptions): IRenderMimeRegistry = js.native
    
    /**
      * Create a new mime model.  This is a convenience method.
      *
      * @options - The options used to create the model.
      *
      * @returns A new mime model.
      */
    def createModel(): MimeModel = js.native
    def createModel(options: IOptions): MimeModel = js.native
    
    /**
      * Create a renderer for a mime type.
      *
      * @param mimeType - The mime type of interest.
      *
      * @returns A new renderer for the given mime type.
      *
      * @throws An error if no factory exists for the mime type.
      */
    def createRenderer(mimeType: String): IRenderer = js.native
    
    /**
      * Get the renderer factory registered for a mime type.
      *
      * @param mimeType - The mime type of interest.
      *
      * @returns The factory for the mime type, or `undefined`.
      */
    def getFactory(mimeType: String): js.UndefOr[IRendererFactory] = js.native
    
    /**
      * Get the rank for a given mime type.
      *
      * @param mimeType - The mime type of interest.
      *
      * @returns The rank of the mime type or undefined.
      */
    def getRank(mimeType: String): js.UndefOr[Double] = js.native
    
    /**
      * The LaTeX typesetter for the rendermime.
      */
    val latexTypesetter: typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter | Null = js.native
    
    /**
      * The object used to handle path opening links.
      */
    val linkHandler: ILinkHandler | Null = js.native
    
    /**
      * The ordered list of mimeTypes.
      */
    val mimeTypes: js.Array[String] = js.native
    
    /**
      * Find the preferred mime type for a mime bundle.
      *
      * @param bundle - The bundle of mime data.
      *
      * @param safe - How to consider safe/unsafe factories. If 'ensure',
      *   it will only consider safe factories. If 'any', any factory will be
      *   considered. If 'prefer', unsafe factories will be considered, but
      *   only after the safe options have been exhausted.
      *
      * @returns The preferred mime type from the available factories,
      *   or `undefined` if the mime type cannot be rendered.
      */
    def preferredMimeType(bundle: ReadonlyPartialJSONObject): js.UndefOr[String] = js.native
    @JSName("preferredMimeType")
    def preferredMimeType_any(bundle: ReadonlyPartialJSONObject, safe: any): js.UndefOr[String] = js.native
    @JSName("preferredMimeType")
    def preferredMimeType_ensure(bundle: ReadonlyPartialJSONObject, safe: ensure): js.UndefOr[String] = js.native
    @JSName("preferredMimeType")
    def preferredMimeType_prefer(bundle: ReadonlyPartialJSONObject, safe: prefer): js.UndefOr[String] = js.native
    
    /**
      * Remove a mime type.
      *
      * @param mimeType - The mime type of interest.
      */
    def removeMimeType(mimeType: String): Unit = js.native
    
    /**
      * The object used to resolve relative urls for the rendermime instance.
      */
    val resolver: IResolver | Null = js.native
    
    /**
      * The sanitizer used by the rendermime instance.
      */
    val sanitizer: ISanitizer = js.native
    
    /**
      * Set the rank of a given mime type.
      *
      * @param mimeType - The mime type of interest.
      *
      * @param rank - The new rank to assign.
      *
      * #### Notes
      * This is a no-op if the mime type is not registered.
      */
    def setRank(mimeType: String, rank: Double): Unit = js.native
  }
  object IRenderMimeRegistry extends Shortcut {
    
    @JSImport("@jupyterlab/rendermime/lib/tokens", "IRenderMimeRegistry")
    @js.native
    val ^ : Token[IRenderMimeRegistry] = js.native
    
    /**
      * The options used to clone a rendermime instance.
      */
    trait ICloneOptions extends StObject {
      
      /**
        * The new LaTeX typesetter.
        */
      var latexTypesetter: js.UndefOr[typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter] = js.undefined
      
      /**
        * The new path handler.
        */
      var linkHandler: js.UndefOr[ILinkHandler] = js.undefined
      
      /**
        * The new resolver object.
        */
      var resolver: js.UndefOr[IResolver] = js.undefined
      
      /**
        * The new sanitizer used to sanitize untrusted html inputs.
        */
      var sanitizer: js.UndefOr[typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ISanitizer] = js.undefined
    }
    object ICloneOptions {
      
      inline def apply(): ICloneOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICloneOptions]
      }
      
      extension [Self <: ICloneOptions](x: Self) {
        
        inline def setLatexTypesetter(value: typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter): Self = StObject.set(x, "latexTypesetter", value.asInstanceOf[js.Any])
        
        inline def setLatexTypesetterUndefined: Self = StObject.set(x, "latexTypesetter", js.undefined)
        
        inline def setLinkHandler(value: ILinkHandler): Self = StObject.set(x, "linkHandler", value.asInstanceOf[js.Any])
        
        inline def setLinkHandlerUndefined: Self = StObject.set(x, "linkHandler", js.undefined)
        
        inline def setResolver(value: IResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
        
        inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
        
        inline def setSanitizer(value: typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ISanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
        
        inline def setSanitizerUndefined: Self = StObject.set(x, "sanitizer", js.undefined)
      }
    }
    
    type _To = Token[IRenderMimeRegistry]
    
    /* This means you don't have to write `^`, but can instead just say `IRenderMimeRegistry.foo` */
    override def _to: Token[IRenderMimeRegistry] = ^
  }
}
