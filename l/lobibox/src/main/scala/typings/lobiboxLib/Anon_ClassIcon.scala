package typings
package lobiboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassIcon extends js.Object {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var sound: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClassIcon {
  @scala.inline
  def apply(
    `class`: java.lang.String = null,
    icon: java.lang.String = null,
    sound: java.lang.String = null,
    title: java.lang.String = null
  ): Anon_ClassIcon = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_ClassIcon]
  }
}

