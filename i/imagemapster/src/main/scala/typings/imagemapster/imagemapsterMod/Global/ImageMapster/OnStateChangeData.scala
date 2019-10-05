package typings.imagemapster.imagemapsterMod.Global.ImageMapster

import typings.imagemapster.imagemapsterStrings.highlight
import typings.imagemapster.imagemapsterStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnStateChangeData extends js.Object {
  /**
    * map key
    */
  var key: String
  /**
    * indicating the current state (following the event)
    */
  var selected: Boolean
  var state: highlight | select
}

object OnStateChangeData {
  @scala.inline
  def apply(key: String, selected: Boolean, state: highlight | select): OnStateChangeData = {
    val __obj = js.Dynamic.literal(key = key, selected = selected, state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnStateChangeData]
  }
}

