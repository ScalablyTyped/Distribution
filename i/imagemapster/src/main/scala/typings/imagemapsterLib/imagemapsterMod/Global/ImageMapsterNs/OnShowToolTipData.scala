package typings
package imagemapsterLib.imagemapsterMod.Global.ImageMapsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnShowToolTipData extends js.Object {
  var areaOptions: AreaRenderingOptions
  /**
    * map key for this area
    */
  var key: java.lang.String
  /**
    * current state of the area
    */
  var selected: scala.Boolean
  /**
    * jQuery object of the tooltip container
    */
  var toolTip: imagemapsterLib.imagemapsterMod.Global.JQuery
}

object OnShowToolTipData {
  @scala.inline
  def apply(
    areaOptions: AreaRenderingOptions,
    key: java.lang.String,
    selected: scala.Boolean,
    toolTip: imagemapsterLib.imagemapsterMod.Global.JQuery
  ): OnShowToolTipData = {
    val __obj = js.Dynamic.literal(areaOptions = areaOptions, key = key, selected = selected, toolTip = toolTip)
  
    __obj.asInstanceOf[OnShowToolTipData]
  }
}

