package typings
package jwtDashSimpleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-simple", JSImport.Namespace)
@js.native
object jwtDashSimpleMod extends js.Object {
  def decode(token: js.Any, key: java.lang.String): js.Any = js.native
  def decode(token: js.Any, key: java.lang.String, noVerify: scala.Boolean): js.Any = js.native
  def decode(token: js.Any, key: java.lang.String, noVerify: scala.Boolean, algorithm: java.lang.String): js.Any = js.native
  def encode(payload: js.Any, key: java.lang.String): java.lang.String = js.native
  def encode(payload: js.Any, key: java.lang.String, algorithm: java.lang.String): java.lang.String = js.native
}

