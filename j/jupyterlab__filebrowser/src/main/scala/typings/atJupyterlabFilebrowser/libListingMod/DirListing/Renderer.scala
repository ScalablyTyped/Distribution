package typings.atJupyterlabFilebrowser.libListingMod.DirListing

import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IRenderer`.
  */
@JSImport("@jupyterlab/filebrowser/lib/listing", "DirListing.Renderer")
@js.native
class Renderer protected () extends IRenderer {
  def this(icoReg: IIconRegistry) = this()
  /**
    * Create a node for a header item.
    */
  var _createHeaderItemNode: js.Any = js.native
  var _iconRegistry: IIconRegistry = js.native
}

