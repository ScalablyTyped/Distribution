package typings.atJupyterlabRendermime.atJupyterlabRendermimeMod

import typings.atJupyterlabRendermime.libRegistryMod.RenderMimeRegistryNs.IUrlResolverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime", "RenderMimeRegistry")
@js.native
object RenderMimeRegistryNs extends js.Object {
  /**
    * A default resolver that uses a session and a contents manager.
    */
  @js.native
  class UrlResolver protected ()
    extends typings.atJupyterlabRendermime.libRegistryMod.RenderMimeRegistryNs.UrlResolver {
    /**
      * Create a new url resolver for a console.
      */
    def this(options: IUrlResolverOptions) = this()
  }
  
}

