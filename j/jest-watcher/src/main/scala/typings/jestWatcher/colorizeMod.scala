package typings.jestWatcher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorizeMod {
  
  @JSImport("jest-watcher/build/lib/colorize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(str: String, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
}
