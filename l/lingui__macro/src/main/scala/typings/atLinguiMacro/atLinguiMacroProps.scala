package typings.atLinguiMacro

import typings.atLinguiMacro.createFormatMod.FormatPropsWithoutI18n
import typings.atLinguiMacro.reactSelectMod.PluralPropsWithoutI18n
import typings.atLinguiMacro.reactSelectMod.SelectPropsWithoutI18n
import typings.atLinguiMacro.transMod.TransPropsWithoutI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait atLinguiMacroProps {
  @scala.inline
  def DateFormatProps: FormatPropsWithoutI18n.type = typings.atLinguiMacro.createFormatMod.FormatPropsWithoutI18n
  type DateFormatProps[V, FormatOptions] = FormatPropsWithoutI18n[V, FormatOptions]
  @scala.inline
  def NumberFormatProps: FormatPropsWithoutI18n.type = typings.atLinguiMacro.createFormatMod.FormatPropsWithoutI18n
  type NumberFormatProps[V, FormatOptions] = FormatPropsWithoutI18n[V, FormatOptions]
  @scala.inline
  def PluralProps: PluralPropsWithoutI18n.type = typings.atLinguiMacro.reactSelectMod.PluralPropsWithoutI18n
  type PluralProps = PluralPropsWithoutI18n
  @scala.inline
  def SelectProps: SelectPropsWithoutI18n.type = typings.atLinguiMacro.reactSelectMod.SelectPropsWithoutI18n
  type SelectProps = SelectPropsWithoutI18n
  @scala.inline
  def SelectOrdinalProps: PluralPropsWithoutI18n.type = typings.atLinguiMacro.reactSelectMod.PluralPropsWithoutI18n
  type SelectOrdinalProps = PluralPropsWithoutI18n
  @scala.inline
  def TransProps: TransPropsWithoutI18n.type = typings.atLinguiMacro.transMod.TransPropsWithoutI18n
  type TransProps = TransPropsWithoutI18n
}

