package typings.jestWatcher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatTestNameByPatternMod {
  
  @JSImport("jest-watcher/build/lib/formatTestNameByPattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(testName: String, pattern: String, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(testName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]
}
