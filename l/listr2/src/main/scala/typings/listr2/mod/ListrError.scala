package typings.listr2.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal error handling mechanism for Listr collects the errors and details for a failed task.
  *
  * @see {@link https://listr2.kilic.dev/task/error-handling.html}
  */
@JSImport("listr2", "ListrError")
@js.native
open class ListrError[Ctx /* <: ListrContext */] protected ()
  extends StObject
     with Error {
  def this(error: js.Error, `type`: ListrErrorTypes, task: Task[Ctx, ListrRendererFactory]) = this()
  
  var ctx: Ctx = js.native
  
  var error: js.Error = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var path: js.Array[String] = js.native
  
  var task: Task[Ctx, ListrRendererFactory] = js.native
  
  var `type`: ListrErrorTypes = js.native
}
