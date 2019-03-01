package typings
package imagemapsterLib.imagemapsterMod.Global.ImageMapsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnStateChangeData extends js.Object {
  /**
    * map key
    */
  var key: java.lang.String
  /**
    * indicating the current state (following the event)
    */
  var selected: scala.Boolean
  var state: imagemapsterLib.imagemapsterLibStrings.highlight | imagemapsterLib.imagemapsterLibStrings.select
}

object OnStateChangeData {
  @scala.inline
  def apply(
    key: java.lang.String,
    selected: scala.Boolean,
    state: imagemapsterLib.imagemapsterLibStrings.highlight | imagemapsterLib.imagemapsterLibStrings.select
  ): OnStateChangeData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnStateChangeData]
  }
}

