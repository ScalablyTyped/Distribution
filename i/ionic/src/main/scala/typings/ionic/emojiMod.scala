package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emojiMod {
  
  @JSImport("ionic/lib/utils/emoji", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def emoji(x: String, fallback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("emoji")(x.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
}
