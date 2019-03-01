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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("data_link")(data_link)
    __obj.updateDynamic("datetime")(datetime)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("name_clean")(name_clean)
    __obj.asInstanceOf[Trophy]
  }
}

