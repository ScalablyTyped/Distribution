package typings.imagemapster.mod.global.ImageMapster

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMouseData extends js.Object {
  var e: JQueryEventObject
  /**
    * area key
    */
  var key: String
  var options: AreaRenderingOptions
  /**
    * true if area is currently selected
    */
  var selected: Boolean
}

object OnMouseData {
  @scala.inline
  def apply(e: JQueryEventObject, key: String, options: AreaRenderingOptions, selected: Boolean): OnMouseData = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMouseData]
  }
}

