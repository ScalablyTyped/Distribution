package typings.atJupyterlabServices.libConfigMod

import typings.atJupyterlabServices.libConfigMod.ConfigSectionNs.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/config", "ConfigSection")
@js.native
object ConfigSectionNs extends js.Object {
  /**
    * The options used to create a config section.
    */
  trait IOptions extends js.Object {
    /**
      * The section name.
      */
    var name: String
    /**
      * The optional server settings.
      */
    var serverSettings: js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
      ] = js.undefined
  }
  
  /**
    * Create a config section.
    *
    * @returns A Promise that is fulfilled with the config section is loaded.
    */
  def create(options: IOptions): js.Promise[IConfigSection] = js.native
}

