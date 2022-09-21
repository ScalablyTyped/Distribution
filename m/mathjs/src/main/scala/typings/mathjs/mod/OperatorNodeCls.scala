package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("mathjs", "OperatorNode")
@js.native
open class OperatorNodeCls[TOp /* <: /* import warning: importer.ImportType#apply Failed type conversion: mathjs.mathjs.OperatorNodeMap[TFn] */ js.Any */, TFn /* <: OperatorNodeFn */, TArgs /* <: js.Array[MathNode] */] protected ()
  extends StObject
     with OperatorNode[TOp, TFn, TArgs] {
  def this(op: TOp, fn: TFn, args: TArgs) = this()
  def this(op: TOp, fn: TFn, args: TArgs, `implicit`: Boolean) = this()
}
