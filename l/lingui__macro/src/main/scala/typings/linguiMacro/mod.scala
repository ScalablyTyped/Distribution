package typings.linguiMacro

import typings.linguiCore.i18nMod.MessageDescriptor
import typings.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typings.linguiMacro.reactSelectMod.Plural
import typings.linguiMacro.reactSelectMod.PluralPropsWithoutI18n
import typings.linguiMacro.reactSelectMod.Select
import typings.linguiMacro.reactSelectMod.SelectOrdinal
import typings.linguiMacro.reactSelectMod.SelectPropsWithoutI18n
import typings.linguiMacro.selectMod.PluralProps
import typings.linguiMacro.selectMod.SelectProps
import typings.linguiMacro.transMod.default
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lingui/macro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@lingui/macro", "DateFormat")
  @js.native
  class DateFormat protected ()
    extends Component[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[Date, DateTimeFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Date, DateTimeFormatOptions], context: js.Any) = this()
  }
  @JSImport("@lingui/macro", "DateFormat")
  @js.native
  val DateFormat: ComponentClass[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@lingui/macro", "NumberFormat")
  @js.native
  class NumberFormat protected ()
    extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions], context: js.Any) = this()
  }
  @JSImport("@lingui/macro", "NumberFormat")
  @js.native
  val NumberFormat: ComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState] = js.native
  
  @JSImport("@lingui/macro", "Plural")
  @js.native
  class Plural_ protected () extends Plural {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/macro", "SelectOrdinal")
  @js.native
  class SelectOrdinal_ protected () extends SelectOrdinal {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/macro", "Select")
  @js.native
  class Select_ protected () extends Select {
    def this(props: SelectPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SelectPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/macro", "Trans")
  @js.native
  class Trans () extends default
  
  @scala.inline
  def date(value: Date): MessageDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any]).asInstanceOf[MessageDescriptor]
  @scala.inline
  def date(value: Date, format: DateTimeFormatOptions): MessageDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[MessageDescriptor]
  
  @scala.inline
  def number(value: Double): MessageDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(value.asInstanceOf[js.Any]).asInstanceOf[MessageDescriptor]
  @scala.inline
  def number(value: Double, format: NumberFormatOptions): MessageDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[MessageDescriptor]
  
  @scala.inline
  def plural(config: PluralProps): MessageDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("plural")(config.asInstanceOf[js.Any]).asInstanceOf[MessageDescriptor]
  @scala.inline
  def plural(id: String, config: PluralProps): MessageDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MessageDescriptor]
  
  @scala.inline
  def select(config: SelectProps): MessageDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(config.asInstanceOf[js.Any]).asInstanceOf[MessageDescriptor]
  @scala.inline
  def select(id: String, config: SelectProps): MessageDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MessageDescriptor]
  
  @scala.inline
  def selectOrdinal(config: PluralProps): MessageDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("selectOrdinal")(config.asInstanceOf[js.Any]).asInstanceOf[MessageDescriptor]
  @scala.inline
  def selectOrdinal(id: String, config: PluralProps): MessageDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOrdinal")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MessageDescriptor]
  
  @scala.inline
  def t(id: String): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ js.Any, MessageDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(id.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* strings */ TemplateStringsArray, /* repeated */ js.Any, MessageDescriptor]]
  @scala.inline
  def t(strings: TemplateStringsArray, values: js.Any*): MessageDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(strings.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[MessageDescriptor]
}
