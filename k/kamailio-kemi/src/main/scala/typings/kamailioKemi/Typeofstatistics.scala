package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstatistics extends js.Object {
  def reset_stat(sname: String): Double
  def update_stat(sname: String, sval: Double): Double
}

object Typeofstatistics {
  @scala.inline
  def apply(reset_stat: String => Double, update_stat: (String, Double) => Double): Typeofstatistics = {
    val __obj = js.Dynamic.literal(reset_stat = js.Any.fromFunction1(reset_stat), update_stat = js.Any.fromFunction2(update_stat))
  
    __obj.asInstanceOf[Typeofstatistics]
  }
}

