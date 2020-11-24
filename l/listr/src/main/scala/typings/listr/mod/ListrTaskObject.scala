package typings.listr.mod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListrTaskObject[Ctx] extends Observable_[ListrEvent] {
  
  def check(ctx: Ctx): Unit = js.native
  
  def hasFailed(): Boolean = js.native
  
  def hasSubtasks(): Boolean = js.native
  
  def isCompleted(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isPending(): Boolean = js.native
  
  def isSkipped(): Boolean = js.native
  
  var output: js.UndefOr[String] = js.native
  
  def run(ctx: Ctx, wrapper: ListrTaskWrapper[Ctx]): js.Promise[Unit] = js.native
  
  def skip(ctx: Ctx): Unit | Boolean | String | js.Promise[Boolean] = js.native
  
  var state: String = js.native
  
  var subtasks: js.Array[ListrTaskWrapper[Ctx]] = js.native
  
  def task(ctx: Ctx, task: ListrTaskWrapper[Ctx]): Unit | ListrTaskResult[Ctx] = js.native
  
  var title: String = js.native
}
