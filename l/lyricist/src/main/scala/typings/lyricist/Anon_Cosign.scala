package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cosign extends js.Object {
  var cosign: Boolean
  var pyong: Boolean
  var vote: js.UndefOr[js.Any] = js.undefined
}

object Anon_Cosign {
  @scala.inline
  def apply(cosign: Boolean, pyong: Boolean, vote: js.Any = null): Anon_Cosign = {
    val __obj = js.Dynamic.literal(cosign = cosign, pyong = pyong)
    if (vote != null) __obj.updateDynamic("vote")(vote)
    __obj.asInstanceOf[Anon_Cosign]
  }
}

