package typings.jupyterlabServices.configMod.ConfigSection

import typings.jupyterlabServices.configMod.IConfigSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
