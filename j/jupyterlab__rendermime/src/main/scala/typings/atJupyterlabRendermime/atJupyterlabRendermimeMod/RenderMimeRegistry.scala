package typings.atJupyterlabRendermime.atJupyterlabRendermimeMod

import typings.atJupyterlabRendermime.libRegistryMod.RenderMimeRegistry.IOptions
import typings.atJupyterlabRendermime.libRegistryMod.RenderMimeRegistry.IUrlResolverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime", "RenderMimeRegistry")
@js.native
/**
  * Construct a new rendermime.
  *
  * @param options - The options for initializing the instance.
  */
class RenderMimeRegistry ()
  extends typings.atJupyterlabRendermime.libRegistryMod.RenderMimeRegistry {
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/rendermime", "RenderMimeRegistry")
@js.native
object RenderMimeRegistry extends js.Object {
  /**
    * A default resolver that uses a session and a contents manager.
    */
  @js.native
  class UrlResolver protected ()
    extends typings.atJupyterlabRendermime.libRegistryMod.RenderMimeRegistry.UrlResolver {
    /**
      * Create a new url resolver for a console.
      */
    def this(options: IUrlResolverOptions) = this()
  }
  
}

