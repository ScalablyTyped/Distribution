package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.NotebookRange")
@js.native
open class NotebookRange protected ()
  extends typings.vscode.mod.NotebookRange {
  /**
  		 * Create a new notebook range. If `start` is not
  		 * before or equal to `end`, the values will be swapped.
  		 *
  		 * @param start start index
  		 * @param end end index.
  		 */
  def this(start: Double, end: Double) = this()
}
