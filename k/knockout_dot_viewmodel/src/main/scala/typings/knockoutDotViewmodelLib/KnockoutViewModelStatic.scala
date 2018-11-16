package typings
package knockoutDotViewmodelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutViewModelStatic extends js.Object {
  // INTERNAL flag: enable logging of conversions
  // logs will be written to console
  var logging: scala.Boolean = js.native
  def fromModel(model: js.Any): js.Any = js.native
  def fromModel(model: js.Any, options: js.Any): js.Any = js.native
  def toModel(viewmodel: js.Any): js.Any = js.native
  def updateFromModel(viewmodel: js.Any, model: js.Any): js.Any = js.native
}

