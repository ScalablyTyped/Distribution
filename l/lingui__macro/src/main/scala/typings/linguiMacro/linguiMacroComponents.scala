package typings.linguiMacro

import typings.react.mod.ComponentType
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object linguiMacroComponents extends linguiMacroProps {
  @scala.inline
  def DateFormat: ComponentType[DateFormatProps[Date, DateTimeFormatOptions]] = js.constructorOf[typings.linguiMacro.mod.DateFormat].asInstanceOf[typings.react.mod.ComponentType[DateFormatProps[typings.std.Date, typings.std.Intl.DateTimeFormatOptions]]]
  @scala.inline
  def NumberFormat: ComponentType[NumberFormatProps[Double, NumberFormatOptions]] = js.constructorOf[typings.linguiMacro.mod.NumberFormat].asInstanceOf[typings.react.mod.ComponentType[NumberFormatProps[scala.Double, typings.std.Intl.NumberFormatOptions]]]
  @scala.inline
  def Plural: ComponentType[PluralProps] = js.constructorOf[typings.linguiMacro.mod.Plural_].asInstanceOf[typings.react.mod.ComponentType[PluralProps]]
  @scala.inline
  def Select: ComponentType[SelectProps] = js.constructorOf[typings.linguiMacro.mod.Select_].asInstanceOf[typings.react.mod.ComponentType[SelectProps]]
  @scala.inline
  def SelectOrdinal: ComponentType[SelectOrdinalProps] = js.constructorOf[typings.linguiMacro.mod.SelectOrdinal_].asInstanceOf[typings.react.mod.ComponentType[SelectOrdinalProps]]
  @scala.inline
  def Trans: ComponentType[TransProps] = js.constructorOf[typings.linguiMacro.transMod.default].asInstanceOf[typings.react.mod.ComponentType[TransProps]]
}

