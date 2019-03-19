package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Adddiversion extends js.Object {
  def add_diversion(reason: java.lang.String): scala.Double
  def add_diversion_uri(reason: java.lang.String, uri: java.lang.String): scala.Double
}

object Anon_Adddiversion {
  @scala.inline
  def apply(
    add_diversion: java.lang.String => scala.Double,
    add_diversion_uri: (java.lang.String, java.lang.String) => scala.Double
  ): Anon_Adddiversion = {
    val __obj = js.Dynamic.literal(add_diversion = js.Any.fromFunction1(add_diversion), add_diversion_uri = js.Any.fromFunction2(add_diversion_uri))
  
    __obj.asInstanceOf[Anon_Adddiversion]
  }
}

