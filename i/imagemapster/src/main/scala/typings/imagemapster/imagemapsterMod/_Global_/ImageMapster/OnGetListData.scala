package typings.imagemapster.imagemapsterMod._Global_.ImageMapster

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
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnGetListData]
  }
}

