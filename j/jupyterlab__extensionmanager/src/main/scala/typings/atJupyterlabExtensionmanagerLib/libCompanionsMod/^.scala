package typings
package atJupyterlabExtensionmanagerLib.libCompanionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager/lib/companions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def presentCompanions(kernelCompanions: js.Array[KernelCompanion]): js.Promise[scala.Boolean] = js.native
  def presentCompanions(kernelCompanions: js.Array[KernelCompanion], serverCompanion: IInstallInfo): js.Promise[scala.Boolean] = js.native
}

