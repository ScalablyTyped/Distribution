package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.mod.DebugAdapterExecutableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.DebugAdapterExecutable")
@js.native
open class DebugAdapterExecutable protected ()
  extends typings.vscode.mod.DebugAdapterExecutable {
  /**
  		 * Creates a description for a debug adapter based on an executable program.
  		 *
  		 * @param command The command or executable path that implements the debug adapter.
  		 * @param args Optional arguments to be passed to the command or executable.
  		 * @param options Optional options to be used when starting the command or executable.
  		 */
  def this(command: String) = this()
  def this(command: String, args: js.Array[String]) = this()
  def this(command: String, args: js.Array[String], options: DebugAdapterExecutableOptions) = this()
  def this(command: String, args: Unit, options: DebugAdapterExecutableOptions) = this()
}
