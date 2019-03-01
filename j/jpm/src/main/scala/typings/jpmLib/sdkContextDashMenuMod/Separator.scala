package typings
package jpmLib.sdkContextDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Separator extends ItemMenuSeparator {
  var parentMenu: Menu
  def destroy(): scala.Unit
}

object Separator {
  @scala.inline
  def apply(destroy: js.Function0[scala.Unit], parentMenu: Menu): Separator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("parentMenu")(parentMenu)
    __obj.asInstanceOf[Separator]
  }
}

