package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpClient {
  
  @JSGlobal("KSR.http_client")
  @js.native
  val ^ : js.Any = js.native
  
  inline def curlConnect(con: String, url: String, dpv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("curl_connect")(con.asInstanceOf[js.Any], url.asInstanceOf[js.Any], dpv.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def curlConnectPost(con: String, url: String, ctype: String, data: String, dpv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("curl_connect_post")(con.asInstanceOf[js.Any], url.asInstanceOf[js.Any], ctype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], dpv.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def query(url: String, dpv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(url.asInstanceOf[js.Any], dpv.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def queryPost(url: String, post: String, dpv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("query_post")(url.asInstanceOf[js.Any], post.asInstanceOf[js.Any], dpv.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def queryPostHdrs(url: String, post: String, hdrs: String, dpv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("query_post_hdrs")(url.asInstanceOf[js.Any], post.asInstanceOf[js.Any], hdrs.asInstanceOf[js.Any], dpv.asInstanceOf[js.Any])).asInstanceOf[Double]
}
