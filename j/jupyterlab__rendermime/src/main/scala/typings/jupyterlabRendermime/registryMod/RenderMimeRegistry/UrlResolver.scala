package typings.jupyterlabRendermime.registryMod.RenderMimeRegistry

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
