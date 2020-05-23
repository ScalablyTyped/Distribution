package typings.jimpTiff.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Imagetiff extends js.Object {
  @JSName("image/tiff")
  var imageSlashtiff: js.Array[String]
}

object Imagetiff {
  @scala.inline
  def apply(imageSlashtiff: js.Array[String]): Imagetiff = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/tiff")(imageSlashtiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imagetiff]
  }
}

