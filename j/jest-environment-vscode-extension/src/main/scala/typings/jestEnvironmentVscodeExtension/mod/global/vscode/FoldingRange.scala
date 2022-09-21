package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.FoldingRange")
@js.native
open class FoldingRange protected ()
  extends typings.vscode.mod.FoldingRange {
  /**
    * Creates a new folding range.
    *
    * @param start The start line of the folded range.
    * @param end The end line of the folded range.
    * @param kind The kind of the folding range.
    */
  def this(start: Double, end: Double) = this()
  def this(start: Double, end: Double, kind: typings.vscode.mod.FoldingRangeKind) = this()
}
