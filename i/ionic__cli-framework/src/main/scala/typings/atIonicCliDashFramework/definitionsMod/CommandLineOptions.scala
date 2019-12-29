package typings.atIonicCliDashFramework.definitionsMod

import typings.minimist.minimistMod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandLineOptions extends ParsedArgs

object CommandLineOptions {
  @scala.inline
  def apply(_underscore: js.Array[String], `--`: js.Array[String] = null): CommandLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    if (`--` != null) __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOptions]
  }
}

