package typings.knockoutViewmodel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutViewModelStatic extends js.Object {
  
  def fromModel(model: js.Any): js.Any = js.native
  def fromModel(model: js.Any, options: js.Any): js.Any = js.native
  
  // INTERNAL flag: enable logging of conversions
  // logs will be written to console
  var logging: Boolean = js.native
  
  def toModel(viewmodel: js.Any): js.Any = js.native
  
  def updateFromModel(viewmodel: js.Any, model: js.Any): js.Any = js.native
}
