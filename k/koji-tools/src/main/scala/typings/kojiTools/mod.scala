package typings.kojiTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koji-tools", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val config: js.Object = js.native
  val pwa: js.Any = js.native
  val routes: js.Object = js.native
  def on(event: String, callback: js.Function0[Unit]): Unit = js.native
  def pageLoad(): Unit = js.native
  def pageLoad(options: js.Object): Unit = js.native
  def pwaPrompt(): js.Any = js.native
  def request(route: js.Object): js.Promise[_] = js.native
  def request(route: js.Object, params: js.Object): js.Promise[_] = js.native
  def resolveSecret(key: String): String | Null = js.native
  def watch(): Unit = js.native
}

