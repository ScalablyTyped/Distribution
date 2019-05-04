package typings
package atJupyterlabServicesLib.libBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/builder", "BuildManager")
@js.native
/**
  * Create a new setting manager.
  */
class BuildManager () extends js.Object {
  def this(options: atJupyterlabServicesLib.libBuilderMod.BuildManagerNs.IOptions) = this()
  /**
    * Test whether the build service is available.
    */
  val isAvailable: scala.Boolean = js.native
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings = js.native
  /**
    * Test whether to check build status automatically.
    */
  val shouldCheck: scala.Boolean = js.native
  /**
    * Build the application.
    */
  def build(): js.Promise[scala.Unit] = js.native
  /**
    * Cancel an active build.
    */
  def cancel(): js.Promise[scala.Unit] = js.native
  /**
    * Get whether the application should be built.
    */
  def getStatus(): js.Promise[atJupyterlabServicesLib.libBuilderMod.BuildManagerNs.IStatus] = js.native
}

