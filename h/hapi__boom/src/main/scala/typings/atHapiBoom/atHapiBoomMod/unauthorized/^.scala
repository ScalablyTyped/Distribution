package typings.atHapiBoom.atHapiBoomMod.unauthorized

import typings.atHapiBoom.atHapiBoomMod.Boom
import typings.atHapiBoom.atHapiBoomStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/boom", "unauthorized")
@js.native
object ^ extends js.Object {
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, scheme: String): Boom[Data] = js.native
  def apply[Data](message: String, scheme: String, attributes: String): Boom[Data] = js.native
  def apply[Data](message: String, scheme: String, attributes: Attributes): Boom[Data] = js.native
  def apply[Data](message: String, wwwAuthenticate: js.Array[String]): Boom[Data] = js.native
  def apply[Data](message: Null, scheme: String): Boom[Data] with MissingAuth = js.native
  def apply[Data](message: Null, scheme: String, attributes: String): Boom[Data] with MissingAuth = js.native
  def apply[Data](message: Null, scheme: String, attributes: Attributes): Boom[Data] with MissingAuth = js.native
  def apply[Data](message: Null, wwwAuthenticate: js.Array[String]): Boom[Data] = js.native
  def apply[Data](message: _empty, scheme: String): Boom[Data] with MissingAuth = js.native
  def apply[Data](message: _empty, scheme: String, attributes: String): Boom[Data] with MissingAuth = js.native
  def apply[Data](message: _empty, scheme: String, attributes: Attributes): Boom[Data] with MissingAuth = js.native
}

