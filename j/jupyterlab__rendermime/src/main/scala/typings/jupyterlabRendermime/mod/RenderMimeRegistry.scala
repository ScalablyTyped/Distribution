package typings.jupyterlabRendermime.mod

import typings.jupyterlabRendermime.registryMod.RenderMimeRegistry.IOptions
import typings.jupyterlabRendermime.registryMod.RenderMimeRegistry.IUrlResolverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/rendermime", "RenderMimeRegistry")
@js.native
/**
  * Construct a new rendermime.
  *
  * @param options - The options for initializing the instance.
  */
class RenderMimeRegistry ()
  extends typings.jupyterlabRendermime.registryMod.RenderMimeRegistry {
  def this(options: IOptions) = this()
}
@JSImport("@jupyterlab/rendermime", "RenderMimeRegistry")
@js.native
object RenderMimeRegistry extends js.Object {
  
  /**
    * A default resolver that uses a given reference path and a contents manager.
    */
  @js.native
  class UrlResolver protected ()
    extends typings.jupyterlabRendermime.registryMod.RenderMimeRegistry.UrlResolver {
    /**
      * Create a new url resolver.
      */
    def this(options: IUrlResolverOptions) = this()
  }
}
