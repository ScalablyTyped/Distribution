package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofhttpClient extends js.Object {
  def curl_connect(con: String, url: String, dpv: String): Double
  def curl_connect_post(con: String, url: String, ctype: String, data: String, dpv: String): Double
  def query(url: String, dpv: String): Double
  def query_post(url: String, post: String, dpv: String): Double
  def query_post_hdrs(url: String, post: String, hdrs: String, dpv: String): Double
}

object TypeofhttpClient {
  @scala.inline
  def apply(
    curl_connect: (String, String, String) => Double,
    curl_connect_post: (String, String, String, String, String) => Double,
    query: (String, String) => Double,
    query_post: (String, String, String) => Double,
    query_post_hdrs: (String, String, String, String) => Double
  ): TypeofhttpClient = {
    val __obj = js.Dynamic.literal(curl_connect = js.Any.fromFunction3(curl_connect), curl_connect_post = js.Any.fromFunction5(curl_connect_post), query = js.Any.fromFunction2(query), query_post = js.Any.fromFunction3(query_post), query_post_hdrs = js.Any.fromFunction4(query_post_hdrs))
    __obj.asInstanceOf[TypeofhttpClient]
  }
}

