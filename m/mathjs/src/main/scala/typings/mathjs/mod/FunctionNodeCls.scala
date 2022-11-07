package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("mathjs", "FunctionNode")
@js.native
open class FunctionNodeCls[TFn, TArgs /* <: js.Array[MathNode] */] protected ()
  extends StObject
     with FunctionNode[TFn, TArgs] {
  def this(fn: TFn, args: TArgs) = this()
}
