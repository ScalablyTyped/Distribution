package typings.kojiTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koji-tools", "config")
  @js.native
  val config: js.Object = js.native
  
  @JSImport("koji-tools", "on")
  @js.native
  def on(event: String, callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("koji-tools", "pageLoad")
  @js.native
  def pageLoad(): Unit = js.native
  @JSImport("koji-tools", "pageLoad")
  @js.native
  def pageLoad(options: js.Object): Unit = js.native
  
  @JSImport("koji-tools", "pwa")
  @js.native
  val pwa: js.Any = js.native
  
  @JSImport("koji-tools", "pwaPrompt")
  @js.native
  def pwaPrompt(): js.Any = js.native
  
  @JSImport("koji-tools", "request")
  @js.native
  def request(route: js.Object): js.Promise[_] = js.native
  @JSImport("koji-tools", "request")
  @js.native
  def request(route: js.Object, params: js.Object): js.Promise[_] = js.native
  
  @JSImport("koji-tools", "resolveSecret")
  @js.native
  def resolveSecret(key: String): String | Null = js.native
  
  @JSImport("koji-tools", "routes")
  @js.native
  val routes: js.Object = js.native
  
  @JSImport("koji-tools", "watch")
  @js.native
  def watch(): Unit = js.native
}
