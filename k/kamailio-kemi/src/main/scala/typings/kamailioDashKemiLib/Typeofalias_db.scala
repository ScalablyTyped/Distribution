package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofalias_db extends js.Object {
  def lookup(stable: java.lang.String): scala.Double
  def lookup_ex(stable: java.lang.String, sflags: java.lang.String): scala.Double
}

object Typeofalias_db {
  @scala.inline
  def apply(
    lookup: java.lang.String => scala.Double,
    lookup_ex: (java.lang.String, java.lang.String) => scala.Double
  ): Typeofalias_db = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), lookup_ex = js.Any.fromFunction2(lookup_ex))
  
    __obj.asInstanceOf[Typeofalias_db]
  }
}

