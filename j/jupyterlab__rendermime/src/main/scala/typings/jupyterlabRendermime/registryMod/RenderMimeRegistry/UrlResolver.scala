package typings.jupyterlabRendermime.registryMod.RenderMimeRegistry

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A default resolver that uses a session and a contents manager.
  */
@JSImport("@jupyterlab/rendermime/lib/registry", "RenderMimeRegistry.UrlResolver")
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
    *
    * #### Notes
    * This URL may include a query parameter.
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

