package typings.atLinguiMacro

import org.scalablytyped.runtime.TopLevel
import typings.atLinguiCore.i18nMod.MessageDescriptor
import typings.atLinguiMacro.createFormatMod.FormatPropsWithoutI18n
import typings.atLinguiMacro.reactSelectMod.PluralPropsWithoutI18n
import typings.atLinguiMacro.reactSelectMod.SelectPropsWithoutI18n
import typings.atLinguiMacro.selectMod.PluralProps
import typings.atLinguiMacro.selectMod.SelectProps
import typings.atLinguiMacro.transMod.TransPropsWithoutI18n
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/macro", JSImport.Namespace)
@js.native
object atLinguiMacroMod extends js.Object {
  @js.native
  class DateFormat protected ()
    extends Component[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[Date, DateTimeFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Date, DateTimeFormatOptions], context: js.Any) = this()
  }
  
  @js.native
  class NumberFormat protected ()
    extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions], context: js.Any) = this()
  }
  
  @js.native
  class Plural ()
    extends Component[PluralPropsWithoutI18n, js.Object, js.Any]
  
  @js.native
  class Select ()
    extends Component[SelectPropsWithoutI18n, js.Object, js.Any]
  
  @js.native
  class SelectOrdinal ()
    extends Component[PluralPropsWithoutI18n, js.Object, js.Any]
  
  @js.native
  class Trans ()
    extends Component[TransPropsWithoutI18n, js.Object, js.Any]
  
  def date(value: Date): MessageDescriptor = js.native
  def date(value: Date, format: DateTimeFormatOptions): MessageDescriptor = js.native
  def number(value: Double): MessageDescriptor = js.native
  def number(value: Double, format: NumberFormatOptions): MessageDescriptor = js.native
  def plural(config: PluralProps): MessageDescriptor = js.native
  def plural(id: String, config: PluralProps): MessageDescriptor = js.native
  def select(config: SelectProps): MessageDescriptor = js.native
  def select(id: String, config: SelectProps): MessageDescriptor = js.native
  def selectOrdinal(config: PluralProps): MessageDescriptor = js.native
  def selectOrdinal(id: String, config: PluralProps): MessageDescriptor = js.native
  def t(id: String): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ js.Any, MessageDescriptor] = js.native
  def t(strings: TemplateStringsArray, values: js.Any*): MessageDescriptor = js.native
  @js.native
  object DateFormat extends TopLevel[
          ComponentClass[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState]
        ]
  
  @js.native
  object NumberFormat extends TopLevel[
          ComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState]
        ]
  
}

