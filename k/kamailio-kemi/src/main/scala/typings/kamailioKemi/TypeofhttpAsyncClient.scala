package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofhttpAsyncClient extends js.Object {
  def query(sdata: String, rn: String): Double
}

object TypeofhttpAsyncClient {
  @scala.inline
  def apply(query: (String, String) => Double): TypeofhttpAsyncClient = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction2(query))
    __obj.asInstanceOf[TypeofhttpAsyncClient]
  }
}

