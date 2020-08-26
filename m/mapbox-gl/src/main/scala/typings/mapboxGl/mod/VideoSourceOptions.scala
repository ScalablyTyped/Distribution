package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSourceOptions extends js.Object {
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var urls: js.UndefOr[js.Array[String]] = js.native
}

object VideoSourceOptions {
  @scala.inline
  def apply(): VideoSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSourceOptions]
  }
  @scala.inline
  implicit class VideoSourceOptionsOps[Self <: VideoSourceOptions] (val x: Self) extends AnyVal {
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
    def setCoordinatesVarargs(value: js.Array[Double]*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[Double]]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
  
}

