package typings.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickFunction[TElement] extends js.Object {
  
  def apply(): js.Any = js.native
  
  var anim: Animation[TElement] = js.native
  
  var elem: TElement = js.native
  
  var queue: Boolean | String = js.native
}
