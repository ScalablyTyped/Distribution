package typings.hapiBoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/boom", "methodNotAllowed")
@js.native
object methodNotAllowed extends js.Object {
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data): Boom[Data] = js.native
  def apply[Data](message: String, data: Data, allow: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data, allow: js.Array[String]): Boom[Data] = js.native
}

