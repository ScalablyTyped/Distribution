package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpClient {
  
  @JSGlobal("KSR.http_client.curl_connect")
  @js.native
  def curlConnect(con: String, url: String, dpv: String): Double = js.native
  
  @JSGlobal("KSR.http_client.curl_connect_post")
  @js.native
  def curlConnectPost(con: String, url: String, ctype: String, data: String, dpv: String): Double = js.native
  
  @JSGlobal("KSR.http_client.query")
  @js.native
  def query(url: String, dpv: String): Double = js.native
  
  @JSGlobal("KSR.http_client.query_post")
  @js.native
  def queryPost(url: String, post: String, dpv: String): Double = js.native
  
  @JSGlobal("KSR.http_client.query_post_hdrs")
  @js.native
  def queryPostHdrs(url: String, post: String, hdrs: String, dpv: String): Double = js.native
}
