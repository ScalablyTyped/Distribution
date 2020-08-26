package typings.logkitty.apiMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logkitty/build/api", "makeMatchFilter")
@js.native
object makeMatchFilter extends js.Object {
  def apply(regexes: RegExp*): FilterCreator = js.native
}

