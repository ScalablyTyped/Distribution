package typings
package jaegerDashClientLib.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def error(msg: java.lang.String): scala.Unit
  def info(msg: java.lang.String): scala.Unit
}

object Logger {
  @scala.inline
  def apply(error: java.lang.String => scala.Unit, info: java.lang.String => scala.Unit): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info))
  
    __obj.asInstanceOf[Logger]
  }
}

