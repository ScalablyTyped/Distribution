package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandLineOptions
  extends minimistLib.minimistMod.minimistNs.ParsedArgs

object CommandLineOptions {
  @scala.inline
  def apply(`_`: js.Array[java.lang.String], `--`: js.Array[java.lang.String] = null): CommandLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(`_`)
    if (`--` != null) __obj.updateDynamic("--")(`--`)
    __obj.asInstanceOf[CommandLineOptions]
  }
}

