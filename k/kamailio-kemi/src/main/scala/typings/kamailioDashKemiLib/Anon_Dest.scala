package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dest extends js.Object {
  def is_alive(dest: java.lang.String): scala.Double
}

object Anon_Dest {
  @scala.inline
  def apply(is_alive: java.lang.String => scala.Double): Anon_Dest = {
    val __obj = js.Dynamic.literal(is_alive = js.Any.fromFunction1(is_alive))
  
    __obj.asInstanceOf[Anon_Dest]
  }
}

