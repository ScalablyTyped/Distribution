package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("mathjs", "AssignmentNode")
@js.native
open class AssignmentNodeCls protected ()
  extends StObject
     with AssignmentNode {
  def this(`object`: SymbolNode, value: MathNode) = this()
  def this(`object`: AccessorNode, index: IndexNode, value: MathNode) = this()
  def this(`object`: SymbolNode, index: IndexNode, value: MathNode) = this()
}
