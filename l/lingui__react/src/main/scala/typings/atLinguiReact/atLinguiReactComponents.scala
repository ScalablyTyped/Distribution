package typings.atLinguiReact

import typings.atLinguiReact.createFormatMod.FormatPropsWithoutI18n
import typings.atLinguiReact.i18nMod.I18nComponentProps
import typings.atLinguiReact.selectMod.PluralPropsWithoutI18n
import typings.atLinguiReact.selectMod.SelectPropsWithoutI18n
import typings.atLinguiReact.transMod.TransPropsWithoutI18n
import typings.react.reactMod.ComponentType
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atLinguiReactComponents extends atLinguiReactProps {
  @scala.inline
  def DateFormat: ComponentType[FormatPropsWithoutI18n[Date, DateTimeFormatOptions]] = js.constructorOf[typings.atLinguiReact.atLinguiReactMod.DateFormat].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atLinguiReact.createFormatMod.FormatPropsWithoutI18n[typings.std.Date, typings.std.Intl.DateTimeFormatOptions]]]
  @scala.inline
  def I18n: ComponentType[I18nComponentProps] = js.constructorOf[typings.atLinguiReact.i18nMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.atLinguiReact.i18nMod.I18nComponentProps]]
  @scala.inline
  def I18nProvider: ComponentType[typings.atLinguiReact.i18nProviderMod.I18nProviderProps] = js.constructorOf[typings.atLinguiReact.i18nProviderMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.atLinguiReact.i18nProviderMod.I18nProviderProps]]
  @scala.inline
  def NumberFormat: ComponentType[FormatPropsWithoutI18n[Double, NumberFormatOptions]] = js.constructorOf[typings.atLinguiReact.atLinguiReactMod.NumberFormat].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atLinguiReact.createFormatMod.FormatPropsWithoutI18n[scala.Double, typings.std.Intl.NumberFormatOptions]]]
  @scala.inline
  def Plural: ComponentType[PluralPropsWithoutI18n] = js.constructorOf[typings.atLinguiReact.selectMod.Plural].asInstanceOf[typings.react.reactMod.ComponentType[typings.atLinguiReact.selectMod.PluralPropsWithoutI18n]]
  @scala.inline
  def Select: ComponentType[SelectPropsWithoutI18n] = js.constructorOf[typings.atLinguiReact.selectMod.Select].asInstanceOf[typings.react.reactMod.ComponentType[typings.atLinguiReact.selectMod.SelectPropsWithoutI18n]]
  @scala.inline
  def SelectOrdinal: ComponentType[PluralPropsWithoutI18n] = js.constructorOf[typings.atLinguiReact.selectMod.SelectOrdinal].asInstanceOf[typings.react.reactMod.ComponentType[typings.atLinguiReact.selectMod.PluralPropsWithoutI18n]]
  @scala.inline
  def Trans: ComponentType[TransPropsWithoutI18n] = js.constructorOf[typings.atLinguiReact.transMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.atLinguiReact.transMod.TransPropsWithoutI18n]]
}

