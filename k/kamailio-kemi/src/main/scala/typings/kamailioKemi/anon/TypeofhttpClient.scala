package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofhttpClient extends js.Object {
  
  def curl_connect(con: String, url: String, dpv: String): Double = js.native
  
  def curl_connect_post(con: String, url: String, ctype: String, data: String, dpv: String): Double = js.native
  
  def query(url: String, dpv: String): Double = js.native
  
  def query_post(url: String, post: String, dpv: String): Double = js.native
  
  def query_post_hdrs(url: String, post: String, hdrs: String, dpv: String): Double = js.native
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
  
  @scala.inline
  implicit class TypeofhttpClientOps[Self <: TypeofhttpClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurl_connect(value: (String, String, String) => Double): Self = this.set("curl_connect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCurl_connect_post(value: (String, String, String, String, String) => Double): Self = this.set("curl_connect_post", js.Any.fromFunction5(value))
    
    @scala.inline
    def setQuery(value: (String, String) => Double): Self = this.set("query", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQuery_post(value: (String, String, String) => Double): Self = this.set("query_post", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQuery_post_hdrs(value: (String, String, String, String) => Double): Self = this.set("query_post_hdrs", js.Any.fromFunction4(value))
  }
}
