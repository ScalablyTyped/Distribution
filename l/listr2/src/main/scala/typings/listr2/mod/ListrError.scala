package typings.listr2.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The internal error handling mechanism.. */
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
  
  var path: String = js.native
  
  var task: Task[Ctx, ListrRendererFactory] = js.native
  
  var `type`: ListrErrorTypes = js.native
}
