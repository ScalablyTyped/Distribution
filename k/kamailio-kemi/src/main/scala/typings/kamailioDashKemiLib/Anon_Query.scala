package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  def query(sdata: java.lang.String, rn: java.lang.String): scala.Double
}

object Anon_Query {
  @scala.inline
  def apply(query: (java.lang.String, java.lang.String) => scala.Double): Anon_Query = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction2(query))
  
    __obj.asInstanceOf[Anon_Query]
  }
}

