package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.Thenable
import typings.vscode.mod.Event
import typings.vscode.mod.TaskEndEvent
import typings.vscode.mod.TaskExecution
import typings.vscode.mod.TaskFilter
import typings.vscode.mod.TaskProcessEndEvent
import typings.vscode.mod.TaskProcessStartEvent
import typings.vscode.mod.TaskProvider
import typings.vscode.mod.TaskStartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasks {
  
  @JSGlobal("vscode.tasks")
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeTask(task: typings.vscode.mod.Task): Thenable[TaskExecution] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeTask")(task.asInstanceOf[js.Any]).asInstanceOf[Thenable[TaskExecution]]
  
  inline def fetchTasks(): Thenable[js.Array[typings.vscode.mod.Task]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchTasks")().asInstanceOf[Thenable[js.Array[typings.vscode.mod.Task]]]
  inline def fetchTasks(filter: TaskFilter): Thenable[js.Array[typings.vscode.mod.Task]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchTasks")(filter.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.Array[typings.vscode.mod.Task]]]
  
  @JSGlobal("vscode.tasks.onDidEndTask")
  @js.native
  val onDidEndTask: Event[TaskEndEvent] = js.native
  
  @JSGlobal("vscode.tasks.onDidEndTaskProcess")
  @js.native
  val onDidEndTaskProcess: Event[TaskProcessEndEvent] = js.native
  
  @JSGlobal("vscode.tasks.onDidStartTask")
  @js.native
  val onDidStartTask: Event[TaskStartEvent] = js.native
  
  @JSGlobal("vscode.tasks.onDidStartTaskProcess")
  @js.native
  val onDidStartTaskProcess: Event[TaskProcessStartEvent] = js.native
  
  inline def registerTaskProvider(`type`: String, provider: TaskProvider[typings.vscode.mod.Task]): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTaskProvider")(`type`.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  @JSGlobal("vscode.tasks.taskExecutions")
  @js.native
  val taskExecutions: js.Array[TaskExecution] = js.native
}
