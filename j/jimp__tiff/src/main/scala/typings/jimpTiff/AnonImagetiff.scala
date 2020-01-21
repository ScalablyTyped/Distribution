package typings.jimpTiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImagetiff extends js.Object {
  @JSName("image/tiff")
  var imageSlashtiff: js.Array[String]
}

object AnonImagetiff {
  @scala.inline
  def apply(imageSlashtiff: js.Array[String]): AnonImagetiff = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/tiff")(imageSlashtiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImagetiff]
  }
}

