package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Send extends js.Object {
  def send(stag: java.lang.String): scala.Double
}

object Anon_Send {
  @scala.inline
  def apply(send: java.lang.String => scala.Double): Anon_Send = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[Anon_Send]
  }
}

