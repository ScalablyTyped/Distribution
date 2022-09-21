package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.TestMessage")
@js.native
open class TestMessage protected ()
  extends typings.vscode.mod.TestMessage {
  /**
    * Creates a new TestMessage instance.
    * @param message The message to show to the user.
    */
  def this(message: String) = this()
  def this(message: typings.vscode.mod.MarkdownString) = this()
}
/* static members */
object TestMessage {
  
  @JSGlobal("vscode.TestMessage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TestMessage that will present as a diff in the editor.
    * @param message Message to display to the user.
    * @param expected Expected output.
    * @param actual Actual output.
    */
  inline def diff(message: String, expected: String, actual: String): typings.vscode.mod.TestMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(message.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.TestMessage]
  inline def diff(message: typings.vscode.mod.MarkdownString, expected: String, actual: String): typings.vscode.mod.TestMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(message.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.TestMessage]
}
