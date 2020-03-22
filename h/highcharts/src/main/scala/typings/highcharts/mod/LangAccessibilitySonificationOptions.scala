package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangAccessibilitySonificationOptions extends js.Object {
  var playAsSoundButtonText: js.UndefOr[String] = js.undefined
  var playAsSoundClickAnnouncement: js.UndefOr[String] = js.undefined
}

object LangAccessibilitySonificationOptions {
  @scala.inline
  def apply(playAsSoundButtonText: String = null, playAsSoundClickAnnouncement: String = null): LangAccessibilitySonificationOptions = {
    val __obj = js.Dynamic.literal()
    if (playAsSoundButtonText != null) __obj.updateDynamic("playAsSoundButtonText")(playAsSoundButtonText.asInstanceOf[js.Any])
    if (playAsSoundClickAnnouncement != null) __obj.updateDynamic("playAsSoundClickAnnouncement")(playAsSoundClickAnnouncement.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangAccessibilitySonificationOptions]
  }
}

