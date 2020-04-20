package typings.linguiMacro

import typings.linguiMacro.mod.Plural_
import typings.linguiMacro.mod.SelectOrdinal_
import typings.linguiMacro.mod.Select_
import typings.linguiMacro.transMod.default
import typings.react.mod.ComponentType
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object linguiMacroComponents extends linguiMacroProps {
  @scala.inline
  def DateFormat: ComponentType[DateFormatProps[Date, DateTimeFormatOptions]] = js.constructorOf[typings.linguiMacro.mod.DateFormat].asInstanceOf[ComponentType[DateFormatProps[Date, DateTimeFormatOptions]]]
  @scala.inline
  def NumberFormat: ComponentType[NumberFormatProps[Double, NumberFormatOptions]] = js.constructorOf[typings.linguiMacro.mod.NumberFormat].asInstanceOf[ComponentType[NumberFormatProps[Double, NumberFormatOptions]]]
  @scala.inline
  def Plural: ComponentType[PluralProps] = js.constructorOf[Plural_].asInstanceOf[ComponentType[PluralProps]]
  @scala.inline
  def Select: ComponentType[SelectProps] = js.constructorOf[Select_].asInstanceOf[ComponentType[SelectProps]]
  @scala.inline
  def SelectOrdinal: ComponentType[SelectOrdinalProps] = js.constructorOf[SelectOrdinal_].asInstanceOf[ComponentType[SelectOrdinalProps]]
  @scala.inline
  def Trans: ComponentType[TransProps] = js.constructorOf[default].asInstanceOf[ComponentType[TransProps]]
}

