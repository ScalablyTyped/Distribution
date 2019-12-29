package typings.atJimpTiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Imagetiff extends js.Object {
  @JSName("image/tiff")
  var imageSlashtiff: js.Array[String]
}

object Anon_Imagetiff {
  @scala.inline
  def apply(imageSlashtiff: js.Array[String]): Anon_Imagetiff = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/tiff")(imageSlashtiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Imagetiff]
  }
}

