package typings.ipfsHttpResponse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsPathMod {
  
  @JSImport("ipfs-http-response/dist/src/utils/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cidArray(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("cidArray")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def joinURLParts(urls: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinURLParts")(urls.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def removeLeadingSlash(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLeadingSlash")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def removeSlashFromBothEnds(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSlashFromBothEnds")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def removeTrailingSlash(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTrailingSlash")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
