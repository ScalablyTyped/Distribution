package typings.jupyterlabServices.nbconvertMod

import typings.jupyterlabServices.nbconvertMod.NbConvertManager.IExportFormats
import typings.jupyterlabServices.nbconvertMod.NbConvertManager.IOptions
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/nbconvert", "NbConvertManager")
@js.native
/**
  * Create a new nbconvert manager.
  */
class NbConvertManager_ () extends js.Object {
  def this(options: IOptions) = this()
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: ISettings = js.native
  /**
    * Get whether the application should be built.
    */
  def getExportFormats(): js.Promise[IExportFormats] = js.native
}

