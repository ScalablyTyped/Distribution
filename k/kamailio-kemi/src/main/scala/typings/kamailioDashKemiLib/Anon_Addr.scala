package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addr extends js.Object {
  def allow_address(addr_group: scala.Double, ips: java.lang.String, port: scala.Double): scala.Double
  def allow_address_group(_addr: java.lang.String, _port: scala.Double): scala.Double
  def allow_source_address(addr_group: scala.Double): scala.Double
  def allow_source_address_group(): scala.Double
}

object Anon_Addr {
  @scala.inline
  def apply(
    allow_address: (scala.Double, java.lang.String, scala.Double) => scala.Double,
    allow_address_group: (java.lang.String, scala.Double) => scala.Double,
    allow_source_address: scala.Double => scala.Double,
    allow_source_address_group: () => scala.Double
  ): Anon_Addr = {
    val __obj = js.Dynamic.literal(allow_address = js.Any.fromFunction3(allow_address), allow_address_group = js.Any.fromFunction2(allow_address_group), allow_source_address = js.Any.fromFunction1(allow_source_address), allow_source_address_group = js.Any.fromFunction0(allow_source_address_group))
  
    __obj.asInstanceOf[Anon_Addr]
  }
}

