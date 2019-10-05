package typings.libratoDashNode.libratoDashNodeMod

import typings.libratoDashNode.libratoDashNodeStrings.error
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("librato-node", "on")
@js.native
object on_error extends js.Object {
  def apply(event: error, handler: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

