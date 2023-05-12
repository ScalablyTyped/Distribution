package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.mod.ProcessExecutionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.ProcessExecution")
@js.native
open class ProcessExecution protected ()
  extends typings.vscode.mod.ProcessExecution {
  /**
  		 * Creates a process execution.
  		 *
  		 * @param process The process to start.
  		 * @param options Optional options for the started process.
  		 */
  def this(process: String) = this()
  /**
  		 * Creates a process execution.
  		 *
  		 * @param process The process to start.
  		 * @param args Arguments to be passed to the process.
  		 * @param options Optional options for the started process.
  		 */
  def this(process: String, args: js.Array[String]) = this()
  def this(process: String, options: ProcessExecutionOptions) = this()
  def this(process: String, args: js.Array[String], options: ProcessExecutionOptions) = this()
}
