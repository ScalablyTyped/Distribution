package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates and handles a runnable instance of the Task.
  */
@JSImport("listr2", "ListrTaskObject")
@js.native
open class ListrTaskObject[Ctx, Renderer /* <: ListrRendererFactory */] protected () extends Task[Ctx, Renderer] {
  def this(
    listr: Listr[Ctx, Any, Any],
    task: ListrTask[Ctx, Any],
    options: ListrOptions[ListrContext],
    rendererOptions: ListrGetRendererOptions[Renderer]
  ) = this()
}
