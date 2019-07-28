package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhttp_async_client extends js.Object {
  def query(sdata: String, rn: String): Double
}

object Typeofhttp_async_client {
  @scala.inline
  def apply(query: (String, String) => Double): Typeofhttp_async_client = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction2(query))
  
    __obj.asInstanceOf[Typeofhttp_async_client]
  }
}

