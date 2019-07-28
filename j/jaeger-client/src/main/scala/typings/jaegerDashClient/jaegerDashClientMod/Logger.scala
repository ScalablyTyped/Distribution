package typings.jaegerDashClient.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def error(msg: String): Unit
  def info(msg: String): Unit
}

object Logger {
  @scala.inline
  def apply(error: String => Unit, info: String => Unit): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info))
  
    __obj.asInstanceOf[Logger]
  }
}

