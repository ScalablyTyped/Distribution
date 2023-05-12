package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.FileDecoration")
@js.native
/**
		 * Creates a new decoration.
		 *
		 * @param badge A letter that represents the decoration.
		 * @param tooltip The tooltip of the decoration.
		 * @param color The color of the decoration.
		 */
open class FileDecoration ()
  extends typings.vscode.mod.FileDecoration {
  def this(badge: String) = this()
  def this(badge: String, tooltip: String) = this()
  def this(badge: Unit, tooltip: String) = this()
  def this(badge: String, tooltip: String, color: typings.vscode.mod.ThemeColor) = this()
  def this(badge: String, tooltip: Unit, color: typings.vscode.mod.ThemeColor) = this()
  def this(badge: Unit, tooltip: String, color: typings.vscode.mod.ThemeColor) = this()
  def this(badge: Unit, tooltip: Unit, color: typings.vscode.mod.ThemeColor) = this()
}
