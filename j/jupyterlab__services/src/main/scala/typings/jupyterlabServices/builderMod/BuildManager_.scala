package typings.jupyterlabServices.builderMod

import typings.jupyterlabServices.builderMod.BuildManager.IOptions
import typings.jupyterlabServices.builderMod.BuildManager.IStatus
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/builder", "BuildManager")
@js.native
/**
  * Create a new setting manager.
  */
class BuildManager_ () extends js.Object {
  def this(options: IOptions) = this()
  var _url: js.Any = js.native
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: ISettings = js.native
  /**
    * Build the application.
    */
  def build(): js.Promise[Unit] = js.native
  /**
    * Cancel an active build.
    */
  def cancel(): js.Promise[Unit] = js.native
  /**
    * Get whether the application should be built.
    */
  def getStatus(): js.Promise[IStatus] = js.native
  /**
    * Test whether the build service is available.
    */
  def isAvailable: Boolean = js.native
  /**
    * Test whether to check build status automatically.
    */
  def shouldCheck: Boolean = js.native
}

