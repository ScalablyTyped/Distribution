package typings.atJupyterlabFilebrowser.libMod

import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser/lib", "DirListing")
@js.native
object DirListingNs extends js.Object {
  /**
    * The default implementation of an `IRenderer`.
    */
  @js.native
  class Renderer protected ()
    extends typings.atJupyterlabFilebrowser.libListingMod.DirListingNs.Renderer {
    def this(icoReg: IIconRegistry) = this()
  }
  
}

