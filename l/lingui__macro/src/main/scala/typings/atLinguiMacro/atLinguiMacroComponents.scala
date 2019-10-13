package typings.atLinguiMacro

import typings.react.reactMod.ComponentType
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atLinguiMacroComponents extends atLinguiMacroProps {
  @scala.inline
  def DateFormat: ComponentType[DateFormatProps[Date, DateTimeFormatOptions]] = js.constructorOf[typings.atLinguiMacro.atLinguiMacroMod.DateFormat].asInstanceOf[typings.react.reactMod.ComponentType[DateFormatProps[typings.std.Date, typings.std.Intl.DateTimeFormatOptions]]]
  @scala.inline
  def NumberFormat: ComponentType[NumberFormatProps[Double, NumberFormatOptions]] = js.constructorOf[typings.atLinguiMacro.atLinguiMacroMod.NumberFormat].asInstanceOf[typings.react.reactMod.ComponentType[NumberFormatProps[scala.Double, typings.std.Intl.NumberFormatOptions]]]
  @scala.inline
  def Plural: ComponentType[PluralProps] = js.constructorOf[typings.atLinguiMacro.reactSelectMod.Plural].asInstanceOf[typings.react.reactMod.ComponentType[PluralProps]]
  @scala.inline
  def Select: ComponentType[SelectProps] = js.constructorOf[typings.atLinguiMacro.reactSelectMod.Select].asInstanceOf[typings.react.reactMod.ComponentType[SelectProps]]
  @scala.inline
  def SelectOrdinal: ComponentType[SelectOrdinalProps] = js.constructorOf[typings.atLinguiMacro.reactSelectMod.SelectOrdinal].asInstanceOf[typings.react.reactMod.ComponentType[SelectOrdinalProps]]
  @scala.inline
  def Trans: ComponentType[TransProps] = js.constructorOf[typings.atLinguiMacro.transMod.default].asInstanceOf[typings.react.reactMod.ComponentType[TransProps]]
}

