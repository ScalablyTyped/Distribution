package typings.jsondiffpatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter[TContext /* <: FilterContext */] extends js.Object {
  
  /**
    * A function which is called at each stage of the operation and can update the context to modify the result
    * @param context The current state of the operation
    */
  def apply(context: TContext): Unit = js.native
  
  /**
    * A unique name which can be used to insert other filters before/after, or remove/replace this filter
    */
  var filterName: String = js.native
}
