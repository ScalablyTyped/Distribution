package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The callback function from the user that defines the task.
  */
/** 
NOTE: Rewritten from type alias:
{{{
type ListrTaskFn = (ctx : Ctx, task : listr2.listr2.TaskWrapper<Ctx, Renderer>): void | listr2.listr2.ListrTaskResult<Ctx>
}}}
to avoid circular code involving: 
- listr2.listr2.ListrRendererFactory
- listr2.listr2.ListrRendererValue
- listr2.listr2.ListrTaskFn
- listr2.listr2.ListrTaskResult
*/
@js.native
trait ListrTaskFn[Ctx, Renderer /* <: ListrRendererFactory */] extends StObject {
  
  def apply(ctx: Ctx, task: TaskWrapper[Ctx, Renderer]): Unit | ListrTaskResult[Ctx] = js.native
}
