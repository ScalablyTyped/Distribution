package typings.atIonicCliDashFramework.definitionsMod

import typings.minimist.minimistMod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandLineOptions extends ParsedArgs

object CommandLineOptions {
  @scala.inline
  def apply(`_`: js.Array[String], `--`: js.Array[String] = null): CommandLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(`_`)
    if (`--` != null) __obj.updateDynamic("--")(`--`)
    __obj.asInstanceOf[CommandLineOptions]
  }
}

