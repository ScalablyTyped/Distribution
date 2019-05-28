package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofjsonrpcs extends js.Object {
  def exec(scmd: java.lang.String): scala.Double
}

object Typeofjsonrpcs {
  @scala.inline
  def apply(exec: java.lang.String => scala.Double): Typeofjsonrpcs = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
  
    __obj.asInstanceOf[Typeofjsonrpcs]
  }
}

