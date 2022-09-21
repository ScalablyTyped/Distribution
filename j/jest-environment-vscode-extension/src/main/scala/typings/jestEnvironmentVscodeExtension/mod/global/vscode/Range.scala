package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.Range")
@js.native
open class Range protected ()
  extends typings.vscode.mod.Range {
  /**
    * Create a new range from two positions. If `start` is not
    * before or equal to `end`, the values will be swapped.
    *
    * @param start A position.
    * @param end A position.
    */
  def this(start: typings.vscode.mod.Position, end: typings.vscode.mod.Position) = this()
  /**
    * Create a new range from number coordinates. It is a shorter equivalent of
    * using `new Range(new Position(startLine, startCharacter), new Position(endLine, endCharacter))`
    *
    * @param startLine A zero-based line value.
    * @param startCharacter A zero-based character value.
    * @param endLine A zero-based line value.
    * @param endCharacter A zero-based character value.
    */
  def this(startLine: Double, startCharacter: Double, endLine: Double, endCharacter: Double) = this()
}
