package typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGetListData extends js.Object {
  /**
    * array of areas that make up this group
    */
  var area: js.Array[_]
  /**
    * primary mapKey for this area or area group
    */
  var key: String
  var options: AreaRenderingOptions
  /**
    * mapValue for this area or group
    */
  var value: String
}

object OnGetListData {
  @scala.inline
  def apply(area: js.Array[_], key: String, options: AreaRenderingOptions, value: String): OnGetListData = {
    val __obj = js.Dynamic.literal(area = area, key = key, options = options, value = value)
  
    __obj.asInstanceOf[OnGetListData]
  }
}

