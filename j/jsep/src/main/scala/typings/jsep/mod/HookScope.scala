package typings.jsep.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookScope extends StObject {
  
  val char: String = js.native
  
  // current character of the expression
  val code: Double = js.native
  
  val expr: String = js.native
  
  def gobbleArguments(untilICode: Double): PossibleExpression = js.native
  
  def gobbleArray(): PossibleExpression = js.native
  
  def gobbleBinaryExpression(): PossibleExpression = js.native
  
  def gobbleBinaryOp(): PossibleExpression = js.native
  
  def gobbleExpression(): Expression = js.native
  
  def gobbleExpressions(): js.Array[Expression] = js.native
  def gobbleExpressions(untilICode: Double): js.Array[Expression] = js.native
  
  def gobbleGroup(): Expression = js.native
  
  def gobbleIdentifier(): PossibleExpression = js.native
  
  def gobbleNumericLiteral(): PossibleExpression = js.native
  
  // current character code of the expression
  def gobbleSpaces(): Unit = js.native
  
  def gobbleStringLiteral(): PossibleExpression = js.native
  
  def gobbleToken(): PossibleExpression = js.native
  
  def gobbleTokenProperty(node: Expression): Expression = js.native
  
  var index: Double = js.native
  
  def throwError(msg: String): Unit = js.native
}
