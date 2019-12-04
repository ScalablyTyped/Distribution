package typings.ionic.libShellMod

import typings.ionic.definitionsMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellDeps extends js.Object {
  val log: ILogger
}

object ShellDeps {
  @scala.inline
  def apply(log: ILogger): ShellDeps = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShellDeps]
  }
}

