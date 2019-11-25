package typings.imagemapster.imagemapsterMod._Global_.ImageMapster

import typings.imagemapster.imagemapsterMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnShowToolTipData extends js.Object {
  var areaOptions: AreaRenderingOptions
  /**
    * map key for this area
    */
  var key: String
  /**
    * current state of the area
    */
  var selected: Boolean
  /**
    * jQuery object of the tooltip container
    */
  var toolTip: JQuery
}

object OnShowToolTipData {
  @scala.inline
  def apply(areaOptions: AreaRenderingOptions, key: String, selected: Boolean, toolTip: JQuery): OnShowToolTipData = {
    val __obj = js.Dynamic.literal(areaOptions = areaOptions.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnShowToolTipData]
  }
}

