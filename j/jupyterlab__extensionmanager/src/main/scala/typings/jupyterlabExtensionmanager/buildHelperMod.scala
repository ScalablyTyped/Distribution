package typings.jupyterlabExtensionmanager

import typings.jupyterlabServices.builderMod.Builder.IManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager/lib/build-helper", JSImport.Namespace)
@js.native
object buildHelperMod extends js.Object {
  def doBuild(builder: IManager): js.Promise[Unit] = js.native
}

