package typings.ionicCliFramework.definitionsMod

import typings.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandLineOptions extends ParsedArgs

object CommandLineOptions {
  @scala.inline
  def apply(_underscore: js.Array[String]): CommandLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOptions]
  }
}

