package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("mathjs", "RangeNode")
@js.native
open class RangeNodeCls[TStart /* <: MathNode */, TEnd /* <: MathNode */, TStep /* <: MathNode */] protected ()
  extends StObject
     with RangeNode[TStart, TEnd, TStep] {
  def this(start: TStart, end: TEnd) = this()
  def this(start: TStart, end: TEnd, step: TStep) = this()
}
