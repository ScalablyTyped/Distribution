package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.mod.TestItem
import typings.vscode.mod.TestRunProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.TestRunRequest")
@js.native
/**
  * @param include Array of specific tests to run, or undefined to run all tests
  * @param exclude An array of tests to exclude from the run.
  * @param profile The run profile used for this request.
  */
open class TestRunRequest ()
  extends typings.vscode.mod.TestRunRequest {
  def this(include: js.Array[TestItem]) = this()
  def this(include: js.Array[TestItem], exclude: js.Array[TestItem]) = this()
  def this(include: Unit, exclude: js.Array[TestItem]) = this()
  def this(include: js.Array[TestItem], exclude: js.Array[TestItem], profile: TestRunProfile) = this()
  def this(include: js.Array[TestItem], exclude: Unit, profile: TestRunProfile) = this()
  def this(include: Unit, exclude: js.Array[TestItem], profile: TestRunProfile) = this()
  def this(include: Unit, exclude: Unit, profile: TestRunProfile) = this()
}
