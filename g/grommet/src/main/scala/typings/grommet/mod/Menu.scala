package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.buttonMod.ButtonType
import typings.grommet.grommetStrings.icon
import typings.grommet.menuMod.MenuProps
import typings.grommet.utilsMod.Omit
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "Menu")
@js.native
object Menu extends TopLevel[FC[MenuProps with (Omit[ButtonType, icon])]]

