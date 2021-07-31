package typings.jestWatcher

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternModeHelpersMod {
  
  @JSImport("jest-watcher/build/lib/patternModeHelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def printPatternCaret(pattern: String, pipe: WritableStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printPatternCaret")(pattern.asInstanceOf[js.Any], pipe.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def printRestoredPatternCaret(pattern: String, currentUsageRows: Double, pipe: WritableStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printRestoredPatternCaret")(pattern.asInstanceOf[js.Any], currentUsageRows.asInstanceOf[js.Any], pipe.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
