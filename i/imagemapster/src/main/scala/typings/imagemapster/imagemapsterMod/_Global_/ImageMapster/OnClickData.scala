package typings.imagemapster.imagemapsterMod._Global_.ImageMapster

import typings.imagemapster.imagemapsterMod._Global_.JQuery
import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickData extends js.Object {
  var e: JQueryEventObject
  /**
    * mapKey for this area
    */
  var key: String
  /**
    * $(item) from boundList
    */
  var listTarget: js.UndefOr[JQuery] = js.undefined
  var selected: Boolean
}

object OnClickData {
  @scala.inline
  def apply(e: JQueryEventObject, key: String, selected: Boolean, listTarget: JQuery = null): OnClickData = {
    val __obj = js.Dynamic.literal(e = e, key = key, selected = selected)
    if (listTarget != null) __obj.updateDynamic("listTarget")(listTarget)
    __obj.asInstanceOf[OnClickData]
  }
}

