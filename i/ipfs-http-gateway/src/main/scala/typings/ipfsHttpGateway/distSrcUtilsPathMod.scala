package typings.ipfsHttpGateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsPathMod {
  
  @JSImport("ipfs-http-gateway/dist/src/utils/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def joinURLParts(urls: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinURLParts")(urls.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def removeTrailingSlash(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTrailingSlash")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def splitPath(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
