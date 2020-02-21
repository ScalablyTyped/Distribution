package typings.jose.mod.JWK

import typings.jose.joseStrings.none
import typings.jose.joseStrings.unsecured
import typings.jose.mod.keyOperation
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoneKey extends js.Object {
  var alg: none = js.native
  var `type`: unsecured = js.native
  def algorithms(): Set[String] = js.native
  def algorithms(operation: keyOperation): Set[String] = js.native
}

