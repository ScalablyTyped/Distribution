package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extend the task to have more functionality while accessing from the outside.
  */
@JSImport("listr2", "ListrTaskWrapper")
@js.native
open class ListrTaskWrapper[Ctx, Renderer /* <: ListrRendererFactory */] protected ()
  extends StObject
     with TaskWrapper[Ctx, Renderer] {
  def this(
    task: Task[Ctx, ListrRendererFactory],
    errors: js.Array[ListrError[Ctx]],
    options: ListrBaseClassOptions[Ctx, Any, Any]
  ) = this()
}
