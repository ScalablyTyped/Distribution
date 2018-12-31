package typings
package keygripLib.keygripMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keygrip extends js.Object {
  def index(data: js.Any, digest: java.lang.String): scala.Double
  def sign(data: js.Any): java.lang.String
  def verify(data: js.Any, digest: java.lang.String): scala.Boolean
}

