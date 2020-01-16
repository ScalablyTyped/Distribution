package typings.atHapiBoom.atHapiBoomMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/boom", "boomify")
@js.native
object boomify extends js.Object {
  def apply[Data, Decoration](err: Error): Boom[Data] with Decoration = js.native
  def apply[Data, Decoration](err: Error, options: Options[Data] with Decorate[Decoration]): Boom[Data] with Decoration = js.native
}

