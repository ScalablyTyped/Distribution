package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_D extends js.Object {
  var symbol: java.lang.String
  def scale(d: scala.Double): scala.Double
}

object Anon_D {
  @scala.inline
  def apply(scale: js.Function1[scala.Double, scala.Double], symbol: java.lang.String): Anon_D = {
    val __obj = js.Dynamic.literal(scale = scale, symbol = symbol)
  
    __obj.asInstanceOf[Anon_D]
  }
}

