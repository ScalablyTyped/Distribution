package typings.jimpGif

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImagegif extends js.Object {
  @JSName("image/gif")
  var imageSlashgif: js.Array[String]
}

object AnonImagegif {
  @scala.inline
  def apply(imageSlashgif: js.Array[String]): AnonImagegif = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/gif")(imageSlashgif.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImagegif]
  }
}

