package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a task from the given set of variables and make it runnable.
  */
@JSImport("listr2", "ListrTaskObject")
@js.native
open class ListrTaskObject[Ctx, Renderer /* <: ListrRendererFactory */] protected ()
  extends StObject
     with Task[Ctx, Renderer] {
  def this(
    listr: Listr[Ctx, Any, Any],
    tasks: ListrTask[Ctx, Any],
    options: ListrOptions[ListrContext],
    rendererOptions: ListrGetRendererOptions[Renderer]
  ) = this()
}
