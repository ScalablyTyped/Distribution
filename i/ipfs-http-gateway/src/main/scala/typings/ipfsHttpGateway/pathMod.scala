package typings.ipfsHttpGateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("ipfs-http-gateway/dist/src/utils/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def joinURLParts(urls: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinURLParts")(urls.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def removeTrailingSlash(url: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTrailingSlash")(url.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def splitPath(path: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("splitPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
