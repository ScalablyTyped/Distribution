package typings.atLinguiReact

import typings.react.reactMod.ComponentType
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atLinguiReactComponents extends atLinguiReactProps {
  @scala.inline
  def DateFormat: ComponentType[DateFormatProps[Date, DateTimeFormatOptions]] = js.constructorOf[typings.atLinguiReact.atLinguiReactMod.DateFormat].asInstanceOf[typings.react.reactMod.ComponentType[DateFormatProps[typings.std.Date, typings.std.Intl.DateTimeFormatOptions]]]
  @scala.inline
  def I18n: ComponentType[I18nProps] = js.constructorOf[typings.atLinguiReact.i18nMod.default].asInstanceOf[typings.react.reactMod.ComponentType[I18nProps]]
  @scala.inline
  def I18nProvider: ComponentType[I18nProviderProps] = js.constructorOf[typings.atLinguiReact.i18nProviderMod.default].asInstanceOf[typings.react.reactMod.ComponentType[I18nProviderProps]]
  @scala.inline
  def NumberFormat: ComponentType[NumberFormatProps[Double, NumberFormatOptions]] = js.constructorOf[typings.atLinguiReact.atLinguiReactMod.NumberFormat].asInstanceOf[typings.react.reactMod.ComponentType[NumberFormatProps[scala.Double, typings.std.Intl.NumberFormatOptions]]]
  @scala.inline
  def Plural: ComponentType[PluralProps] = js.constructorOf[typings.atLinguiReact.selectMod.Plural].asInstanceOf[typings.react.reactMod.ComponentType[PluralProps]]
  @scala.inline
  def Select: ComponentType[SelectProps] = js.constructorOf[typings.atLinguiReact.selectMod.Select].asInstanceOf[typings.react.reactMod.ComponentType[SelectProps]]
  @scala.inline
  def SelectOrdinal: ComponentType[SelectOrdinalProps] = js.constructorOf[typings.atLinguiReact.selectMod.SelectOrdinal].asInstanceOf[typings.react.reactMod.ComponentType[SelectOrdinalProps]]
  @scala.inline
  def Trans: ComponentType[TransProps] = js.constructorOf[typings.atLinguiReact.transMod.default].asInstanceOf[typings.react.reactMod.ComponentType[TransProps]]
}

