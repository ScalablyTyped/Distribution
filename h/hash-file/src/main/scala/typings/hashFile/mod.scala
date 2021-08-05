package typings.hashFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(src: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @JSImport("hash-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(src.asInstanceOf[js.Any]).asInstanceOf[String]
}
