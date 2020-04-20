package typings.linguiReact

import typings.linguiReact.i18nMod.default
import typings.react.mod.ComponentType
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object linguiReactComponents extends linguiReactProps {
  @scala.inline
  def DateFormat: ComponentType[DateFormatProps[Date, DateTimeFormatOptions]] = js.constructorOf[typings.linguiReact.mod.DateFormat].asInstanceOf[ComponentType[DateFormatProps[Date, DateTimeFormatOptions]]]
  @scala.inline
  def I18n: ComponentType[I18nProps] = js.constructorOf[default].asInstanceOf[ComponentType[I18nProps]]
  @scala.inline
  def I18nProvider: ComponentType[I18nProviderProps] = js.constructorOf[typings.linguiReact.i18nProviderMod.default].asInstanceOf[ComponentType[I18nProviderProps]]
  @scala.inline
  def NumberFormat: ComponentType[NumberFormatProps[Double, NumberFormatOptions]] = js.constructorOf[typings.linguiReact.mod.NumberFormat].asInstanceOf[ComponentType[NumberFormatProps[Double, NumberFormatOptions]]]
  @scala.inline
  def Plural: ComponentType[PluralProps] = js.constructorOf[typings.linguiReact.mod.Plural].asInstanceOf[ComponentType[PluralProps]]
  @scala.inline
  def Select: ComponentType[SelectProps] = js.constructorOf[typings.linguiReact.mod.Select].asInstanceOf[ComponentType[SelectProps]]
  @scala.inline
  def SelectOrdinal: ComponentType[SelectOrdinalProps] = js.constructorOf[typings.linguiReact.mod.SelectOrdinal].asInstanceOf[ComponentType[SelectOrdinalProps]]
  @scala.inline
  def Trans: ComponentType[TransProps] = js.constructorOf[typings.linguiReact.transMod.default].asInstanceOf[ComponentType[TransProps]]
}

