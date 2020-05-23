package typings.jimpGif.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Imagegif extends js.Object {
  @JSName("image/gif")
  var imageSlashgif: js.Array[String]
}

object Imagegif {
  @scala.inline
  def apply(imageSlashgif: js.Array[String]): Imagegif = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/gif")(imageSlashgif.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imagegif]
  }
}

