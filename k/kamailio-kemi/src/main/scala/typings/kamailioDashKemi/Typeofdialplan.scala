package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdialplan extends js.Object {
  def dp_match(dpid: Double, src: String): Double
  def dp_replace(dpid: Double, src: String, dst: String): Double
}

object Typeofdialplan {
  @scala.inline
  def apply(dp_match: (Double, String) => Double, dp_replace: (Double, String, String) => Double): Typeofdialplan = {
    val __obj = js.Dynamic.literal(dp_match = js.Any.fromFunction2(dp_match), dp_replace = js.Any.fromFunction3(dp_replace))
  
    __obj.asInstanceOf[Typeofdialplan]
  }
}

