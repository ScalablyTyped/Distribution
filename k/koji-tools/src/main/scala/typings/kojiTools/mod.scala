package typings.kojiTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koji-tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("koji-tools", "config")
  @js.native
  val config: js.Object = js.native
  
  inline def on(event: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pageLoad(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pageLoad")().asInstanceOf[Unit]
  inline def pageLoad(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pageLoad")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("koji-tools", "pwa")
  @js.native
  val pwa: Any = js.native
  
  inline def pwaPrompt(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pwaPrompt")().asInstanceOf[Any]
  
  inline def request(route: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(route.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def request(route: js.Object, params: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(route.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def resolveSecret(key: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSecret")(key.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @JSImport("koji-tools", "routes")
  @js.native
  val routes: js.Object = js.native
  
  inline def watch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")().asInstanceOf[Unit]
}
