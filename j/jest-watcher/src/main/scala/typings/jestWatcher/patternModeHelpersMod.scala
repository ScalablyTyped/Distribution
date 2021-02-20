package typings.jestWatcher

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternModeHelpersMod {
  
  @JSImport("jest-watcher/build/lib/patternModeHelpers", "printPatternCaret")
  @js.native
  def printPatternCaret(pattern: String, pipe: WritableStream): Unit = js.native
  
  @JSImport("jest-watcher/build/lib/patternModeHelpers", "printRestoredPatternCaret")
  @js.native
  def printRestoredPatternCaret(pattern: String, currentUsageRows: Double, pipe: WritableStream): Unit = js.native
}
