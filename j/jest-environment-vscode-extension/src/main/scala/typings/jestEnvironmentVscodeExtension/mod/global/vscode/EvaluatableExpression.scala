package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.EvaluatableExpression")
@js.native
open class EvaluatableExpression protected ()
  extends typings.vscode.mod.EvaluatableExpression {
  /**
  		 * Creates a new evaluatable expression object.
  		 *
  		 * @param range The range in the underlying document from which the evaluatable expression is extracted.
  		 * @param expression If specified overrides the extracted expression.
  		 */
  def this(range: typings.vscode.mod.Range) = this()
  def this(range: typings.vscode.mod.Range, expression: String) = this()
}
