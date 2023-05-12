package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The original Task that is defined by the user is wrapped with the TaskWrapper to provide additional functionality.
  *
  * @see {@link https://listr2.kilic.dev/task/task.html}
  */
@JSImport("listr2", "ListrTaskWrapper")
@js.native
open class ListrTaskWrapper[Ctx, Renderer /* <: ListrRendererFactory */] protected ()
  extends StObject
     with TaskWrapper[Ctx, Renderer] {
  def this(task: Task[Ctx, ListrRendererFactory], options: ListrBaseClassOptions[Ctx, Any, Any]) = this()
}
