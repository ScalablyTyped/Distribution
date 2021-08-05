package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @JSImport("ionic/lib/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def diffPatch(filename: String, text1: String, text2: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffPatch")(filename.asInstanceOf[js.Any], text1.asInstanceOf[js.Any], text2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
