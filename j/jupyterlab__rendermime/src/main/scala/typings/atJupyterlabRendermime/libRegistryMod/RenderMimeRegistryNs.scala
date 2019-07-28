package typings.atJupyterlabRendermime.libRegistryMod

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atJupyterlabRendermime.libRegistryMod.RenderMimeRegistryNs.IUrlResolverOptions
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILinkHandler
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ISanitizer
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IManager
import typings.atJupyterlabServices.libSessionSessionMod.SessionNs.ISession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/registry", "RenderMimeRegistry")
@js.native
object RenderMimeRegistryNs extends js.Object {
  /**
    * The options used to initialize a rendermime instance.
    */
  trait IOptions extends js.Object {
    /**
      * Initial factories to add to the rendermime instance.
      */
    var initialFactories: js.UndefOr[js.Array[IRendererFactory]] = js.undefined
    /**
      * An optional LaTeX typesetter.
      */
    var latexTypesetter: js.UndefOr[ILatexTypesetter] = js.undefined
    /**
      * An optional path handler.
      */
    var linkHandler: js.UndefOr[ILinkHandler] = js.undefined
    /**
      * The initial resolver object.
      *
      * The default is `null`.
      */
    var resolver: js.UndefOr[IResolver] = js.undefined
    /**
      * The sanitizer used to sanitize untrusted html inputs.
      *
      * If not given, a default sanitizer will be used.
      */
    var sanitizer: js.UndefOr[ISanitizer] = js.undefined
  }
  
  /**
    * The options used to create a UrlResolver.
    */
  trait IUrlResolverOptions extends js.Object {
    /**
      * The contents manager used by the resolver.
      */
    var contents: IManager
    /**
      * The session used by the resolver.
      */
    var session: ISession | IClientSession
  }
  
  /**
    * A default resolver that uses a session and a contents manager.
    */
  @js.native
  class UrlResolver protected () extends IResolver {
    /**
      * Create a new url resolver for a console.
      */
    def this(options: IUrlResolverOptions) = this()
    var _contents: js.Any = js.native
    var _session: js.Any = js.native
    /**
      * Get the download url for a given absolute url path.
      */
    /* CompleteClass */
    override def getDownloadUrl(url: String): js.Promise[String] = js.native
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
      * Resolve a relative url to an absolute url path.
      */
    /* CompleteClass */
    override def resolveUrl(url: String): js.Promise[String] = js.native
  }
  
}

