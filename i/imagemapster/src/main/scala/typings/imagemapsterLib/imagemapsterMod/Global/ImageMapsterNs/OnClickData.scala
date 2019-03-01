package typings
package imagemapsterLib.imagemapsterMod.Global.ImageMapsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickData extends js.Object {
  var e: jqueryLib.JQueryEventObject
  /**
    * mapKey for this area
    */
  var key: java.lang.String
  /**
    * $(item) from boundList
    */
  var listTarget: js.UndefOr[imagemapsterLib.imagemapsterMod.Global.JQuery] = js.undefined
  var selected: scala.Boolean
}

object OnClickData {
  @scala.inline
  def apply(
    e: jqueryLib.JQueryEventObject,
    key: java.lang.String,
    selected: scala.Boolean,
    listTarget: imagemapsterLib.imagemapsterMod.Global.JQuery = null
  ): OnClickData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("e")(e)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("selected")(selected)
    if (listTarget != null) __obj.updateDynamic("listTarget")(listTarget)
    __obj.asInstanceOf[OnClickData]
  }
}

