package typings.atJimpGif

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Imagegif extends js.Object {
  @JSName("image/gif")
  var imageSlashgif: js.Array[String]
}

object Anon_Imagegif {
  @scala.inline
  def apply(imageSlashgif: js.Array[String]): Anon_Imagegif = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/gif")(imageSlashgif.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Imagegif]
  }
}

