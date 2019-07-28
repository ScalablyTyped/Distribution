package typings.jwtDashSimple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-simple", JSImport.Namespace)
@js.native
object jwtDashSimpleMod extends js.Object {
  def decode(token: js.Any, key: String): js.Any = js.native
  def decode(token: js.Any, key: String, noVerify: Boolean): js.Any = js.native
  def decode(token: js.Any, key: String, noVerify: Boolean, algorithm: String): js.Any = js.native
  def encode(payload: js.Any, key: String): String = js.native
  def encode(payload: js.Any, key: String, algorithm: String): String = js.native
}

