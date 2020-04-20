package typings.jupyterlabExtensionmanager.listingsMod

import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager/lib/listings", "Lister")
@js.native
/**
  * Create a Lister object.
  */
class Lister () extends js.Object {
  var _listings: js.Any = js.native
  /**
    */
  var _listingsLoaded: js.Any = js.native
  def listingsLoaded: ISignal[this.type, ListResult] = js.native
}

