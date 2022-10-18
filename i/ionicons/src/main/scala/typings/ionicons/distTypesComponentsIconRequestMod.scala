package typings.ionicons

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsIconRequestMod {
  
  @JSImport("ionicons/dist/types/components/icon/request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSvgContent(url: String, sanitize: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSvgContent")(url.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  @JSImport("ionicons/dist/types/components/icon/request", "ioniconContent")
  @js.native
  val ioniconContent: Map[String, String] = js.native
}
