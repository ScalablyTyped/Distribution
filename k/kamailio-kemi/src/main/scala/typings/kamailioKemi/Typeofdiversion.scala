package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdiversion extends js.Object {
  def add_diversion(reason: String): Double
  def add_diversion_uri(reason: String, uri: String): Double
}

object Typeofdiversion {
  @scala.inline
  def apply(add_diversion: String => Double, add_diversion_uri: (String, String) => Double): Typeofdiversion = {
    val __obj = js.Dynamic.literal(add_diversion = js.Any.fromFunction1(add_diversion), add_diversion_uri = js.Any.fromFunction2(add_diversion_uri))
    __obj.asInstanceOf[Typeofdiversion]
  }
}

