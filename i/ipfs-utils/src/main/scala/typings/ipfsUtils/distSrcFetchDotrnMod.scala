package typings.ipfsUtils

import typings.electronFetch.mod.RequestInfo
import typings.electronFetch.mod.RequestInit
import typings.electronFetch.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFetchDotrnMod {
  
  /* was `typeof imported_electron-fetch.default` */
  inline def apply(url: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  /* was `typeof imported_electron-fetch.default` */
  inline def apply(url: RequestInfo, options: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  @JSImport("ipfs-utils/dist/src/fetch.rn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
