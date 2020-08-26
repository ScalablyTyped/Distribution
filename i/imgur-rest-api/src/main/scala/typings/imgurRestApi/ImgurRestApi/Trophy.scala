package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trophy extends js.Object {
  var data: String = js.native
  var data_link: String = js.native
  var datetime: Double = js.native
  var description: String = js.native
  var id: Double = js.native
  var image: String = js.native
  var name: String = js.native
  var name_clean: String = js.native
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
  @scala.inline
  implicit class TrophyOps[Self <: Trophy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setData_link(value: String): Self = this.set("data_link", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatetime(value: Double): Self = this.set("datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setName_clean(value: String): Self = this.set("name_clean", value.asInstanceOf[js.Any])
  }
  
}

