package typings
package atJupyterlabRendermimeLib.libRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/registry", "RenderMimeRegistry")
@js.native
object RenderMimeRegistryNs extends js.Object {
  /**
    * The options used to clone a rendermime instance.
    */
  trait ICloneOptions extends js.Object {
    /**
      * The new LaTeX typesetter.
      */
    var latexTypesetter: js.UndefOr[
        atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter
      ] = js.undefined
    /**
      * The new path handler.
      */
    var linkHandler: js.UndefOr[
        atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILinkHandler
      ] = js.undefined
    /**
      * The new resolver object.
      */
    var resolver: js.UndefOr[
        atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver
      ] = js.undefined
    /**
      * The new sanitizer used to sanitize untrusted html inputs.
      */
    var sanitizer: js.UndefOr[
        atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ISanitizer
      ] = js.undefined
  }
  
  /**
    * The options used to initialize a rendermime instance.
    */
  trait IOptions extends js.Object {
    /**
      * Initial factories to add to the rendermime instance.
      */
    var initialFactories: js.UndefOr[
        js.Array[
          atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory
        ]
      ] = js.undefined
    /**
      * An optional LaTeX typesetter.
      */
    var latexTypesetter: js.UndefOr[
        atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter
      ] = js.undefined
    /**
      * An optional path handler.
      */
    var linkHandler: js.UndefOr[
        atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILinkHandler
      ] = js.undefined
    /**
      * The initial resolver object.
      *
      * The default is `null`.
      */
    var resolver: js.UndefOr[
        atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver
      ] = js.undefined
    /**
      * The sanitizer used to sanitize untrusted html inputs.
      *
      * If not given, a default sanitizer will be used.
      */
    var sanitizer: js.UndefOr[
        atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ISanitizer
      ] = js.undefined
  }
  
  /**
    * The options used to create a UrlResolver.
    */
  trait IUrlResolverOptions extends js.Object {
    /**
      * The contents manager used by the resolver.
      */
    var contents: atJupyterlabServicesLib.libContentsMod.ContentsNs.IManager
    /**
      * The session used by the resolver.
      */
    var session: atJupyterlabServicesLib.libSessionSessionMod.SessionNs.ISession | atJupyterlabApputilsLib.libClientsessionMod.IClientSession
  }
  
  /**
    * A default resolver that uses a session and a contents manager.
    */
  @js.native
  class UrlResolver protected ()
    extends atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver {
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
    override def getDownloadUrl(url: java.lang.String): js.Promise[java.lang.String] = js.native
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
    def isLocal_MUrlResolver(url: java.lang.String): scala.Boolean = js.native
    /**
      * Resolve a relative url to an absolute url path.
      */
    /* CompleteClass */
    override def resolveUrl(url: java.lang.String): js.Promise[java.lang.String] = js.native
  }
  
}

