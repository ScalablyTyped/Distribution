package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trophy extends js.Object {
  var data: java.lang.String
  var data_link: java.lang.String
  var datetime: scala.Double
  var description: java.lang.String
  var id: scala.Double
  var image: java.lang.String
  var name: java.lang.String
  var name_clean: java.lang.String
}

object Trophy {
  @scala.inline
  def apply(
    data: java.lang.String,
    data_link: java.lang.String,
    datetime: scala.Double,
    description: java.lang.String,
    id: scala.Double,
    image: java.lang.String,
    name: java.lang.String,
    name_clean: java.lang.String
  ): Trophy = {
    val __obj = js.Dynamic.literal(data = data, data_link = data_link, datetime = datetime, description = description, id = id, image = image, name = name, name_clean = name_clean)
  
    __obj.asInstanceOf[Trophy]
  }
}

