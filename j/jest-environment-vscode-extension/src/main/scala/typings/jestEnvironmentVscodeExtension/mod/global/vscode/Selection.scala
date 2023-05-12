package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.Selection")
@js.native
open class Selection protected ()
  extends typings.vscode.mod.Selection {
  /**
  		 * Create a selection from two positions.
  		 *
  		 * @param anchor A position.
  		 * @param active A position.
  		 */
  def this(anchor: typings.vscode.mod.Position, active: typings.vscode.mod.Position) = this()
  /**
  		 * Create a selection from four coordinates.
  		 *
  		 * @param anchorLine A zero-based line value.
  		 * @param anchorCharacter A zero-based character value.
  		 * @param activeLine A zero-based line value.
  		 * @param activeCharacter A zero-based character value.
  		 */
  def this(anchorLine: Double, anchorCharacter: Double, activeLine: Double, activeCharacter: Double) = this()
}
