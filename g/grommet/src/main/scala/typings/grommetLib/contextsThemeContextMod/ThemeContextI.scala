package typings
package grommetLib.contextsThemeContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeContextI
  extends reactLib.reactMod.Context[ThemeValue] {
  var Extend: reactLib.reactMod.FC[grommetLib.Anon_Value]
}

object ThemeContextI {
  @scala.inline
  def apply(
    Consumer: reactLib.reactMod.Consumer[ThemeValue],
    Extend: reactLib.reactMod.FC[grommetLib.Anon_Value],
    Provider: reactLib.reactMod.Provider[ThemeValue],
    displayName: java.lang.String = null
  ): ThemeContextI = {
    val __obj = js.Dynamic.literal(Consumer = Consumer, Extend = Extend, Provider = Provider)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[ThemeContextI]
  }
}

