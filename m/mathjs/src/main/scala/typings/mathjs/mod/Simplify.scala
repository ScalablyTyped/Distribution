package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Simplify extends StObject {
  
  def apply(expr: String): MathNode = js.native
  def apply(expr: String, rules: js.Array[SimplifyRule]): MathNode = js.native
  def apply(expr: String, rules: js.Array[SimplifyRule], scope: js.Object): MathNode = js.native
  def apply(expr: String, rules: js.Array[SimplifyRule], scope: js.Object, options: SimplifyOptions): MathNode = js.native
  def apply(expr: String, rules: js.Array[SimplifyRule], scope: scala.Unit, options: SimplifyOptions): MathNode = js.native
  def apply(expr: String, scope: js.Object): MathNode = js.native
  def apply(expr: String, scope: js.Object, options: SimplifyOptions): MathNode = js.native
  def apply(expr: MathNode): MathNode = js.native
  def apply(expr: MathNode, rules: js.Array[SimplifyRule]): MathNode = js.native
  def apply(expr: MathNode, rules: js.Array[SimplifyRule], scope: js.Object): MathNode = js.native
  def apply(expr: MathNode, rules: js.Array[SimplifyRule], scope: js.Object, options: SimplifyOptions): MathNode = js.native
  def apply(expr: MathNode, rules: js.Array[SimplifyRule], scope: scala.Unit, options: SimplifyOptions): MathNode = js.native
  def apply(expr: MathNode, scope: js.Object): MathNode = js.native
  def apply(expr: MathNode, scope: js.Object, options: SimplifyOptions): MathNode = js.native
  
  var rules: js.Array[SimplifyRule] = js.native
}
