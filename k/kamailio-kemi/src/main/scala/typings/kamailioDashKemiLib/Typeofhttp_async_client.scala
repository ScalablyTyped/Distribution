package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhttp_async_client extends js.Object {
  def query(sdata: java.lang.String, rn: java.lang.String): scala.Double
}

object Typeofhttp_async_client {
  @scala.inline
  def apply(query: (java.lang.String, java.lang.String) => scala.Double): Typeofhttp_async_client = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction2(query))
  
    __obj.asInstanceOf[Typeofhttp_async_client]
  }
}

