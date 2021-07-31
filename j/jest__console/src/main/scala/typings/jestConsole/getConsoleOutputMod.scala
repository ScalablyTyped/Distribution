package typings.jestConsole

import typings.jestConsole.typesMod.LogEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getConsoleOutputMod {
  
  @JSImport("@jest/console/build/getConsoleOutput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(root: String, verbose: Boolean, buffer: js.Array[LogEntry]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(root.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[String]
}
