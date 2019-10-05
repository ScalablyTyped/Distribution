package typings.imagemagick.imagemagickMod

import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imagemagick", "crop")
@js.native
object crop extends js.Object {
  def apply(options: Options, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = js.native
}

