package typings.jupyterlabRendermime

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabRendermime.registryMod.RenderMimeRegistry.IOptions
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ISanitizer
import typings.jupyterlabServices.contentsMod.Contents.IManager
import typings.jupyterlabServices.sessionSessionMod.ISessionConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
  @JSImport("@jupyterlab/rendermime/lib/registry", "RenderMimeRegistry")
  @js.native
  /**
    * Construct a new rendermime.
    *
    * @param options - The options for initializing the instance.
    */
  class RenderMimeRegistry () extends IRenderMimeRegistry {
    def this(options: IOptions) = this()
    
    var _factories: js.Any = js.native
    
    var _id: js.Any = js.native
    
    var _ranks: js.Any = js.native
    
    var _types: js.Any = js.native
    
    /**
      * The ordered list of mimeTypes.
      */
    @JSName("mimeTypes")
    def mimeTypes_MRenderMimeRegistry: js.Array[String] = js.native
  }
  object RenderMimeRegistry {
    
    /**
      * A default resolver that uses a given reference path and a contents manager.
      */
    @JSImport("@jupyterlab/rendermime/lib/registry", "RenderMimeRegistry.UrlResolver")
    @js.native
    class UrlResolver protected () extends IResolver {
      /**
        * Create a new url resolver.
        */
      def this(options: IUrlResolverOptions) = this()
      
      var _contents: js.Any = js.native
      
      var _path: js.Any = js.native
      
      var _session: js.Any = js.native
      
      /**
        * Whether the URL should be handled by the resolver
        * or not.
        *
        * #### Notes
        * This is similar to the `isLocal` check in `URLExt`,
        * but it also checks whether the path points to any
        * of the `IDrive`s that may be registered with the contents
        * manager.
        */
      @JSName("isLocal")
      def isLocal_MUrlResolver(url: String): Boolean = js.native
      
      /**
        * The path of the object, from which local urls can be derived.
        */
      def path: String = js.native
      def path_=(value: String): Unit = js.native
    }
    
    /**
      * The options used to initialize a rendermime instance.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * Initial factories to add to the rendermime instance.
        */
      var initialFactories: js.UndefOr[js.Array[IRendererFactory]] = js.native
      
      /**
        * An optional LaTeX typesetter.
        */
      var latexTypesetter: js.UndefOr[ILatexTypesetter] = js.native
      
      /**
        * An optional path handler.
        */
      var linkHandler: js.UndefOr[ILinkHandler] = js.native
      
      /**
        * The initial resolver object.
        *
        * The default is `null`.
        */
      var resolver: js.UndefOr[IResolver] = js.native
      
      /**
        * The sanitizer used to sanitize untrusted html inputs.
        *
        * If not given, a default sanitizer will be used.
        */
      var sanitizer: js.UndefOr[ISanitizer] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInitialFactories(value: js.Array[IRendererFactory]): Self = StObject.set(x, "initialFactories", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitialFactoriesUndefined: Self = StObject.set(x, "initialFactories", js.undefined)
        
        @scala.inline
        def setInitialFactoriesVarargs(value: IRendererFactory*): Self = StObject.set(x, "initialFactories", js.Array(value :_*))
        
        @scala.inline
        def setLatexTypesetter(value: ILatexTypesetter): Self = StObject.set(x, "latexTypesetter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatexTypesetterUndefined: Self = StObject.set(x, "latexTypesetter", js.undefined)
        
        @scala.inline
        def setLinkHandler(value: ILinkHandler): Self = StObject.set(x, "linkHandler", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkHandlerUndefined: Self = StObject.set(x, "linkHandler", js.undefined)
        
        @scala.inline
        def setResolver(value: IResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
        
        @scala.inline
        def setSanitizer(value: ISanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSanitizerUndefined: Self = StObject.set(x, "sanitizer", js.undefined)
      }
    }
    
    /**
      * The options used to create a UrlResolver.
      */
    @js.native
    trait IUrlResolverOptions extends StObject {
      
      /**
        * The contents manager used by the resolver.
        */
      var contents: IManager = js.native
      
      /**
        * The path providing context for local urls.
        *
        * #### Notes
        * Either session or path must be given, and path takes precedence.
        */
      var path: js.UndefOr[String] = js.native
      
      /**
        * The session used by the resolver.
        *
        * @deprecated use the `path` option instead and update it as needed.
        *
        * #### Notes
        * For convenience, this can be a session context as well. Either session
        * or path must be given, and path takes precedence.
        *
        * TODO: remove this option and make `path` required.
        */
      var session: js.UndefOr[ISessionContext | ISessionConnection] = js.native
    }
    object IUrlResolverOptions {
      
      @scala.inline
      def apply(contents: IManager): IUrlResolverOptions = {
        val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
        __obj.asInstanceOf[IUrlResolverOptions]
      }
      
      @scala.inline
      implicit class IUrlResolverOptionsMutableBuilder[Self <: IUrlResolverOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContents(value: IManager): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setSession(value: ISessionContext | ISessionConnection): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      }
    }
  }
}
