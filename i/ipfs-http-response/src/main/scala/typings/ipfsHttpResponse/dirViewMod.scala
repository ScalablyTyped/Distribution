package typings.ipfsHttpResponse

import typings.ipfsHttpResponse.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dirViewMod {
  
  @JSImport("ipfs-http-response/dist/src/dir-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def render(path: String, links: js.Array[Name]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(path.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[String]
}
