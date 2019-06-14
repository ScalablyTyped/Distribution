package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coordinator extends js.Object {
  var coordinator: Anon_Host
  var errorCode: scala.Double
}

object Anon_Coordinator {
  @scala.inline
  def apply(coordinator: Anon_Host, errorCode: scala.Double): Anon_Coordinator = {
    val __obj = js.Dynamic.literal(coordinator = coordinator, errorCode = errorCode)
  
    __obj.asInstanceOf[Anon_Coordinator]
  }
}

