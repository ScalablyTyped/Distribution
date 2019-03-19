package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Con extends js.Object {
  def curl_connect(con: java.lang.String, url: java.lang.String, dpv: java.lang.String): scala.Double
  def curl_connect_post(
    con: java.lang.String,
    url: java.lang.String,
    ctype: java.lang.String,
    data: java.lang.String,
    dpv: java.lang.String
  ): scala.Double
  def query(url: java.lang.String, dpv: java.lang.String): scala.Double
  def query_post(url: java.lang.String, post: java.lang.String, dpv: java.lang.String): scala.Double
  def query_post_hdrs(url: java.lang.String, post: java.lang.String, hdrs: java.lang.String, dpv: java.lang.String): scala.Double
}

object Anon_Con {
  @scala.inline
  def apply(
    curl_connect: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    curl_connect_post: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    query: (java.lang.String, java.lang.String) => scala.Double,
    query_post: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    query_post_hdrs: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double
  ): Anon_Con = {
    val __obj = js.Dynamic.literal(curl_connect = js.Any.fromFunction3(curl_connect), curl_connect_post = js.Any.fromFunction5(curl_connect_post), query = js.Any.fromFunction2(query), query_post = js.Any.fromFunction3(query_post), query_post_hdrs = js.Any.fromFunction4(query_post_hdrs))
  
    __obj.asInstanceOf[Anon_Con]
  }
}

