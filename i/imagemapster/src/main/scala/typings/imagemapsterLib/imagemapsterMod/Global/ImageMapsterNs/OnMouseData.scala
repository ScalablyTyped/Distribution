package typings
package imagemapsterLib.imagemapsterMod.Global.ImageMapsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMouseData extends js.Object {
  var e: jqueryLib.JQueryEventObject
  /**
    * area key
    */
  var key: java.lang.String
  var options: AreaRenderingOptions
  /**
    * true if area is currently selected
    */
  var selected: scala.Boolean
}

object OnMouseData {
  @scala.inline
  def apply(
    e: jqueryLib.JQueryEventObject,
    key: java.lang.String,
    options: AreaRenderingOptions,
    selected: scala.Boolean
  ): OnMouseData = {
    val __obj = js.Dynamic.literal(e = e, key = key, options = options, selected = selected)
  
    __obj.asInstanceOf[OnMouseData]
  }
}

