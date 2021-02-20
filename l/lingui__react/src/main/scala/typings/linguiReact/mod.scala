package typings.linguiReact

import typings.linguiReact.createFormatMod.FormatPropsWithoutI18n
import typings.linguiReact.i18nMod.default
import typings.linguiReact.linguiReactStrings.i18n
import typings.linguiReact.linguiReactStrings.i18nHash
import typings.linguiReact.selectMod.PluralPropsWithoutI18n
import typings.linguiReact.selectMod.SelectPropsWithoutI18n
import typings.linguiReact.withI18nMod.ComponentConstructor
import typings.linguiReact.withI18nMod.withI18nOptions
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Date
import typings.std.Exclude
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@lingui/react", "DateFormat")
  @js.native
  class DateFormat protected ()
    extends Component[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[Date, DateTimeFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Date, DateTimeFormatOptions], context: js.Any) = this()
  }
  @JSImport("@lingui/react", "DateFormat")
  @js.native
  val DateFormat: ComponentClass[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState] = js.native
  
  @JSImport("@lingui/react", "I18n")
  @js.native
  class I18n () extends default
  
  @JSImport("@lingui/react", "I18nProvider")
  @js.native
  class I18nProvider ()
    extends typings.linguiReact.i18nProviderMod.default
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@lingui/react", "NumberFormat")
  @js.native
  class NumberFormat protected ()
    extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions], context: js.Any) = this()
  }
  @JSImport("@lingui/react", "NumberFormat")
  @js.native
  val NumberFormat: ComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState] = js.native
  
  @JSImport("@lingui/react", "Plural")
  @js.native
  class Plural protected ()
    extends typings.linguiReact.selectMod.Plural {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/react", "Select")
  @js.native
  class Select protected ()
    extends typings.linguiReact.selectMod.Select {
    def this(props: SelectPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SelectPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/react", "SelectOrdinal")
  @js.native
  class SelectOrdinal protected ()
    extends typings.linguiReact.selectMod.SelectOrdinal {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/react", "Trans")
  @js.native
  class Trans ()
    extends typings.linguiReact.transMod.default
  
  @JSImport("@lingui/react", "i18nMark")
  @js.native
  def i18nMark(id: String): String = js.native
  
  @JSImport("@lingui/react", "withI18n")
  @js.native
  def withI18n(): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClass[Pick[_, Exclude[/* keyof any */ String, i18n | i18nHash]], ComponentState]
  ] = js.native
  @JSImport("@lingui/react", "withI18n")
  @js.native
  def withI18n(options: withI18nOptions): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClass[Pick[_, Exclude[/* keyof any */ String, i18n | i18nHash]], ComponentState]
  ] = js.native
}
