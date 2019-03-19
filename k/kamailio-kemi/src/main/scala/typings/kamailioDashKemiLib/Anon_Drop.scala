package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Drop extends js.Object {
  // Equivalent of drop from native kamailio.cfg scripting language, stop the execution of the SIP routing script
  // and drop routing further the SIP request branch or response.
  def drop(): scala.Unit
  // Equivalent of exit from native kamailio.cfg scripting language, stop the execution of the SIP routing script.
  def exit(): scala.Unit
  // Execute a function (specified by fname) exported by a Kamailio module. Additional parameters must be string
  // and they are passed to the Kamailio module function.
  def modf(name: java.lang.String, params: java.lang.String*): scala.Double
}

object Anon_Drop {
  @scala.inline
  def apply(
    drop: () => scala.Unit,
    exit: () => scala.Unit,
    modf: (java.lang.String, /* repeated */ java.lang.String) => scala.Double
  ): Anon_Drop = {
    val __obj = js.Dynamic.literal(drop = js.Any.fromFunction0(drop), exit = js.Any.fromFunction0(exit), modf = js.Any.fromFunction2(modf))
  
    __obj.asInstanceOf[Anon_Drop]
  }
}

