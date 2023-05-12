package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.CompletionList")
@js.native
/**
		 * Creates a new completion list.
		 *
		 * @param items The completion items.
		 * @param isIncomplete The list is not complete.
		 */
open class CompletionList[T /* <: typings.vscode.mod.CompletionItem */] ()
  extends typings.vscode.mod.CompletionList[T] {
  def this(items: js.Array[T]) = this()
  def this(items: js.Array[T], isIncomplete: Boolean) = this()
  def this(items: Unit, isIncomplete: Boolean) = this()
}
