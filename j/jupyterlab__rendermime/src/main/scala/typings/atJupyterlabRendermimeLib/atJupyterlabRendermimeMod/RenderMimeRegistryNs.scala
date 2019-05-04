package typings
package atJupyterlabRendermimeLib.atJupyterlabRendermimeMod

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
    extends atJupyterlabRendermimeLib.libRegistryMod.RenderMimeRegistryNs.UrlResolver {
    /**
      * Create a new url resolver for a console.
      */
    def this(options: atJupyterlabRendermimeLib.libRegistryMod.RenderMimeRegistryNs.IUrlResolverOptions) = this()
  }
  
}

