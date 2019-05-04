package typings
package atJupyterlabServicesLib.libNbconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/nbconvert", "NbConvertManager")
@js.native
/**
  * Create a new nbconvert manager.
  */
class NbConvertManager () extends js.Object {
  def this(options: atJupyterlabServicesLib.libNbconvertMod.NbConvertManagerNs.IOptions) = this()
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings = js.native
  /**
    * Get whether the application should be built.
    */
  def getExportFormats(): js.Promise[atJupyterlabServicesLib.libNbconvertMod.NbConvertManagerNs.IExportFormats] = js.native
}

