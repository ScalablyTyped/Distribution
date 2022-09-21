package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.mod.MarkedString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.Hover")
@js.native
open class Hover protected ()
  extends typings.vscode.mod.Hover {
  def this(contents: js.Array[typings.vscode.mod.MarkdownString | MarkedString]) = this()
  /**
    * Creates a new hover object.
    *
    * @param contents The contents of the hover.
    * @param range The range to which the hover applies.
    */
  def this(contents: typings.vscode.mod.MarkdownString) = this()
  def this(contents: MarkedString) = this()
  def this(
    contents: js.Array[typings.vscode.mod.MarkdownString | MarkedString],
    range: typings.vscode.mod.Range
  ) = this()
  def this(contents: typings.vscode.mod.MarkdownString, range: typings.vscode.mod.Range) = this()
  def this(contents: MarkedString, range: typings.vscode.mod.Range) = this()
}
