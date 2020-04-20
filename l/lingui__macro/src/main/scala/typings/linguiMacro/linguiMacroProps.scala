package typings.linguiMacro

import typings.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typings.linguiMacro.reactSelectMod.PluralPropsWithoutI18n
import typings.linguiMacro.reactSelectMod.SelectPropsWithoutI18n
import typings.linguiMacro.transMod.TransPropsWithoutI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait linguiMacroProps {
  @scala.inline
  def DateFormatProps: FormatPropsWithoutI18n.type = FormatPropsWithoutI18n
  type DateFormatProps[V, FormatOptions] = FormatPropsWithoutI18n[V, FormatOptions]
  @scala.inline
  def NumberFormatProps: FormatPropsWithoutI18n.type = FormatPropsWithoutI18n
  type NumberFormatProps[V, FormatOptions] = FormatPropsWithoutI18n[V, FormatOptions]
  @scala.inline
  def PluralProps: PluralPropsWithoutI18n.type = PluralPropsWithoutI18n
  type PluralProps = PluralPropsWithoutI18n
  @scala.inline
  def SelectProps: SelectPropsWithoutI18n.type = SelectPropsWithoutI18n
  type SelectProps = SelectPropsWithoutI18n
  @scala.inline
  def SelectOrdinalProps: PluralPropsWithoutI18n.type = PluralPropsWithoutI18n
  type SelectOrdinalProps = PluralPropsWithoutI18n
  @scala.inline
  def TransProps: TransPropsWithoutI18n.type = TransPropsWithoutI18n
  type TransProps = TransPropsWithoutI18n
}

