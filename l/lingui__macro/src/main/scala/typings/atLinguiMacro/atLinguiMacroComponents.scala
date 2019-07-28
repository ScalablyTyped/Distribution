package typings.atLinguiMacro

import typings.atLinguiMacro.createFormatMod.FormatPropsWithoutI18n
import typings.atLinguiMacro.reactSelectMod.PluralPropsWithoutI18n
import typings.atLinguiMacro.reactSelectMod.SelectPropsWithoutI18n
import typings.atLinguiMacro.transMod.TransPropsWithoutI18n
import typings.react.reactMod.ComponentType
import typings.std.Date
import typings.std.IntlNs.DateTimeFormatOptions
import typings.std.IntlNs.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atLinguiMacroComponents extends atLinguiMacroProps {
  @scala.inline
  def DateFormat: ComponentType[FormatPropsWithoutI18n[Date, DateTimeFormatOptions]] = js.constructorOf[typings.atLinguiMacro.atLinguiMacroMod.DateFormat].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atLinguiMacro.createFormatMod.FormatPropsWithoutI18n[typings.std.Date, typings.std.IntlNs.DateTimeFormatOptions]]]
  @scala.inline
  def NumberFormat: ComponentType[FormatPropsWithoutI18n[Double, NumberFormatOptions]] = js.constructorOf[typings.atLinguiMacro.atLinguiMacroMod.NumberFormat].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atLinguiMacro.createFormatMod.FormatPropsWithoutI18n[scala.Double, typings.std.IntlNs.NumberFormatOptions]]]
  @scala.inline
  def Plural: ComponentType[PluralPropsWithoutI18n] = js.constructorOf[typings.atLinguiMacro.reactSelectMod.Plural].asInstanceOf[typings.react.reactMod.ComponentType[typings.atLinguiMacro.reactSelectMod.PluralPropsWithoutI18n]]
  @scala.inline
  def Select: ComponentType[SelectPropsWithoutI18n] = js.constructorOf[typings.atLinguiMacro.reactSelectMod.Select].asInstanceOf[typings.react.reactMod.ComponentType[typings.atLinguiMacro.reactSelectMod.SelectPropsWithoutI18n]]
  @scala.inline
  def SelectOrdinal: ComponentType[PluralPropsWithoutI18n] = js.constructorOf[typings.atLinguiMacro.reactSelectMod.SelectOrdinal].asInstanceOf[typings.react.reactMod.ComponentType[typings.atLinguiMacro.reactSelectMod.PluralPropsWithoutI18n]]
  @scala.inline
  def Trans: ComponentType[TransPropsWithoutI18n] = js.constructorOf[typings.atLinguiMacro.transMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.atLinguiMacro.transMod.TransPropsWithoutI18n]]
}

