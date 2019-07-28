package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofx extends js.Object {
  // Equivalent of drop from native kamailio.cfg scripting language, stop the execution of the SIP routing script
  // and drop routing further the SIP request branch or response.
  def drop(): Unit
  // Equivalent of exit from native kamailio.cfg scripting language, stop the execution of the SIP routing script.
  def exit(): Unit
  // Execute a function (specified by fname) exported by a Kamailio module. Additional parameters must be string
  // and they are passed to the Kamailio module function.
  def modf(name: String, params: String*): Double
}

object Typeofx {
  @scala.inline
  def apply(drop: () => Unit, exit: () => Unit, modf: (String, /* repeated */ String) => Double): Typeofx = {
    val __obj = js.Dynamic.literal(drop = js.Any.fromFunction0(drop), exit = js.Any.fromFunction0(exit), modf = js.Any.fromFunction2(modf))
  
    __obj.asInstanceOf[Typeofx]
  }
}

