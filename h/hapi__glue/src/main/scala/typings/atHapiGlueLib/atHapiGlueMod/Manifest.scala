package typings
package atHapiGlueLib.atHapiGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest extends js.Object {
  var register: js.UndefOr[atHapiGlueLib.Anon_Plugins] = js.undefined
  var server: atHapiHapiLib.atHapiHapiMod.ServerOptions
}

object Manifest {
  @scala.inline
  def apply(server: atHapiHapiLib.atHapiHapiMod.ServerOptions, register: atHapiGlueLib.Anon_Plugins = null): Manifest = {
    val __obj = js.Dynamic.literal(server = server)
    if (register != null) __obj.updateDynamic("register")(register)
    __obj.asInstanceOf[Manifest]
  }
}

