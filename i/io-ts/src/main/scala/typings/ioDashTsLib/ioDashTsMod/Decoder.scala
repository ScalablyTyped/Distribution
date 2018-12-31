package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decoder[I, A] extends js.Object {
  val name: java.lang.String
  def decode(i: I): Validation[A]
  def validate(i: I, context: Context): Validation[A]
}

