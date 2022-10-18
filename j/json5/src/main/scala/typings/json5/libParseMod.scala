package typings.json5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParseMod {
  
  inline def apply[T](text: String): T = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def apply[T](text: String, reviver: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): T = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("json5/lib/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
