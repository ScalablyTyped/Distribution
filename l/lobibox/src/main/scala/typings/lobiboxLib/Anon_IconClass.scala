package typings
package lobiboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IconClass extends js.Object {
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_IconClass {
  @scala.inline
  def apply(iconClass: java.lang.String = null, title: java.lang.String = null): Anon_IconClass = {
    val __obj = js.Dynamic.literal()
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_IconClass]
  }
}

