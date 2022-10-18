package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatorNode[TOp /* <: /* import warning: importer.ImportType#apply Failed type conversion: mathjs.mathjs.OperatorNodeMap[TFn] */ js.Any */, TFn /* <: OperatorNodeFn */, TArgs /* <: js.Array[MathNode] */]
  extends StObject
     with MathNode {
  
  var args: TArgs = js.native
  
  var fn: TFn = js.native
  
  var `implicit`: Boolean = js.native
  
  def isBinary(): Boolean = js.native
  
  var isOperatorNode: `true` = js.native
  
  def isUnary(): Boolean = js.native
  
  var op: TOp = js.native
  
  @JSName("type")
  var type_OperatorNode: typings.mathjs.mathjsStrings.OperatorNode = js.native
}
