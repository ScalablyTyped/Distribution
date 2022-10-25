package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("mathjs", "AssignmentNode")
@js.native
open class AssignmentNodeCls[TValue /* <: MathNode */] protected ()
  extends StObject
     with AssignmentNode[TValue] {
  def this(`object`: SymbolNode, value: TValue) = this()
  def this(`object`: AccessorNode[MathNode], index: IndexNode[js.Array[MathNode]], value: TValue) = this()
  def this(`object`: SymbolNode, index: IndexNode[js.Array[MathNode]], value: TValue) = this()
}
