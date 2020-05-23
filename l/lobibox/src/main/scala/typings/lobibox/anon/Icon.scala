package typings.lobibox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var sound: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Icon {
  @scala.inline
  def apply(`class`: String = null, icon: String = null, sound: String = null, title: String = null): Icon = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

