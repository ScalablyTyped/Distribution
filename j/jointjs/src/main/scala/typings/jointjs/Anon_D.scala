package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_D extends js.Object {
  var symbol: String
  def scale(d: Double): Double
}

object Anon_D {
  @scala.inline
  def apply(scale: Double => Double, symbol: String): Anon_D = {
    val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale), symbol = symbol)
  
    __obj.asInstanceOf[Anon_D]
  }
}

