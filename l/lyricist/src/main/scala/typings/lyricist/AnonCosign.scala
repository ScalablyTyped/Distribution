package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCosign extends js.Object {
  var cosign: Boolean
  var pyong: Boolean
  var vote: js.UndefOr[js.Any] = js.undefined
}

object AnonCosign {
  @scala.inline
  def apply(cosign: Boolean, pyong: Boolean, vote: js.Any = null): AnonCosign = {
    val __obj = js.Dynamic.literal(cosign = cosign.asInstanceOf[js.Any], pyong = pyong.asInstanceOf[js.Any])
    if (vote != null) __obj.updateDynamic("vote")(vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCosign]
  }
}

