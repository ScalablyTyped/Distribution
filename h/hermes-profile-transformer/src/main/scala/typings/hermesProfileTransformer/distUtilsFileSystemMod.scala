package typings.hermesProfileTransformer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsFileSystemMod {
  
  @JSImport("hermes-profile-transformer/dist/utils/fileSystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readFileAsync(path: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
