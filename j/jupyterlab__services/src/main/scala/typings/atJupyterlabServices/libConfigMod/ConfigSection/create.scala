package typings.atJupyterlabServices.libConfigMod.ConfigSection

import typings.atJupyterlabServices.libConfigMod.IConfigSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/config", "ConfigSection.create")
@js.native
object create extends js.Object {
  /**
    * Create a config section.
    *
    * @returns A Promise that is fulfilled with the config section is loaded.
    */
  def apply(options: IOptions): js.Promise[IConfigSection] = js.native
}

