package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trophy extends js.Object {
  var data: String
  var data_link: String
  var datetime: Double
  var description: String
  var id: Double
  var image: String
  var name: String
  var name_clean: String
}

object Trophy {
  @scala.inline
  def apply(
    data: String,
    data_link: String,
    datetime: Double,
    description: String,
    id: Double,
    image: String,
    name: String,
    name_clean: String
  ): Trophy = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], data_link = data_link.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_clean = name_clean.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Trophy]
  }
}

