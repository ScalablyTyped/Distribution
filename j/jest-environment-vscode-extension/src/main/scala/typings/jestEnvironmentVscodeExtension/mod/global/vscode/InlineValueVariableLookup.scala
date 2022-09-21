package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.InlineValueVariableLookup")
@js.native
open class InlineValueVariableLookup protected ()
  extends typings.vscode.mod.InlineValueVariableLookup {
  /**
    * Creates a new InlineValueVariableLookup object.
    *
    * @param range The document line where to show the inline value.
    * @param variableName The name of the variable to look up.
    * @param caseSensitiveLookup How to perform the lookup. If missing lookup is case sensitive.
    */
  def this(range: typings.vscode.mod.Range) = this()
  def this(range: typings.vscode.mod.Range, variableName: String) = this()
  def this(range: typings.vscode.mod.Range, variableName: String, caseSensitiveLookup: Boolean) = this()
  def this(range: typings.vscode.mod.Range, variableName: Unit, caseSensitiveLookup: Boolean) = this()
}
