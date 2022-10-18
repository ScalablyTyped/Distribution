package typings.itWs

import typings.itWs.anon.PartialLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWsUrlMod {
  
  @JSImport("it-ws/dist/src/ws-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String, location: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(url: String, location: PartialLocation): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[String]
}
