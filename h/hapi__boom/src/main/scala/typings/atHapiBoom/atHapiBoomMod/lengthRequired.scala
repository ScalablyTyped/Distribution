package typings.atHapiBoom.atHapiBoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/boom", "lengthRequired")
@js.native
object lengthRequired extends js.Object {
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data): Boom[Data] = js.native
}

