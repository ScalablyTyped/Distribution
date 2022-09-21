package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.mod.TaskDefinition
import typings.vscode.mod.TaskScope.Global
import typings.vscode.mod.TaskScope.Workspace
import typings.vscode.mod.WorkspaceFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.Task")
@js.native
open class Task protected ()
  extends typings.vscode.mod.Task {
  /**
    * Creates a new task.
    *
    * @deprecated Use the new constructors that allow specifying a scope for the task.
    *
    * @param taskDefinition The task definition as defined in the taskDefinitions extension point.
    * @param name The task's name. Is presented in the user interface.
    * @param source The task's source (e.g. 'gulp', 'npm', ...). Is presented in the user interface.
    * @param execution The process or shell execution.
    * @param problemMatchers the names of problem matchers to use, like '$tsc'
    *  or '$eslint'. Problem matchers can be contributed by an extension using
    *  the `problemMatchers` extension point.
    */
  def this(taskDefinition: TaskDefinition, name: String, source: String) = this()
  def this(
    taskDefinition: TaskDefinition,
    name: String,
    source: String,
    execution: typings.vscode.mod.ProcessExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    name: String,
    source: String,
    execution: typings.vscode.mod.ShellExecution
  ) = this()
  def this(taskDefinition: TaskDefinition, scope: Global, name: String, source: String) = this()
  def this(taskDefinition: TaskDefinition, scope: Workspace, name: String, source: String) = this()
  /**
    * Creates a new task.
    *
    * @param taskDefinition The task definition as defined in the taskDefinitions extension point.
    * @param scope Specifies the task's scope. It is either a global or a workspace task or a task for a specific workspace folder. Global tasks are currently not supported.
    * @param name The task's name. Is presented in the user interface.
    * @param source The task's source (e.g. 'gulp', 'npm', ...). Is presented in the user interface.
    * @param execution The process or shell execution.
    * @param problemMatchers the names of problem matchers to use, like '$tsc'
    *  or '$eslint'. Problem matchers can be contributed by an extension using
    *  the `problemMatchers` extension point.
    */
  def this(taskDefinition: TaskDefinition, scope: WorkspaceFolder, name: String, source: String) = this()
  def this(
    taskDefinition: TaskDefinition,
    name: String,
    source: String,
    execution: Unit,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    name: String,
    source: String,
    execution: Unit,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    name: String,
    source: String,
    execution: typings.vscode.mod.ProcessExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    name: String,
    source: String,
    execution: typings.vscode.mod.ProcessExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    name: String,
    source: String,
    execution: typings.vscode.mod.ShellExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    name: String,
    source: String,
    execution: typings.vscode.mod.ShellExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: typings.vscode.mod.CustomExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: typings.vscode.mod.ProcessExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: typings.vscode.mod.ShellExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: typings.vscode.mod.CustomExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: typings.vscode.mod.ProcessExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: typings.vscode.mod.ShellExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: typings.vscode.mod.CustomExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: typings.vscode.mod.ProcessExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: typings.vscode.mod.ShellExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: Unit,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: Unit,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: typings.vscode.mod.CustomExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: typings.vscode.mod.CustomExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: typings.vscode.mod.ProcessExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: typings.vscode.mod.ProcessExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: typings.vscode.mod.ShellExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: typings.vscode.mod.ShellExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: Unit,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: Unit,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: typings.vscode.mod.CustomExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: typings.vscode.mod.CustomExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: typings.vscode.mod.ProcessExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: typings.vscode.mod.ProcessExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: typings.vscode.mod.ShellExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: typings.vscode.mod.ShellExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: Unit,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: Unit,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: typings.vscode.mod.CustomExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: typings.vscode.mod.CustomExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: typings.vscode.mod.ProcessExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: typings.vscode.mod.ProcessExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: typings.vscode.mod.ShellExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: typings.vscode.mod.ShellExecution,
    problemMatchers: js.Array[String]
  ) = this()
}
