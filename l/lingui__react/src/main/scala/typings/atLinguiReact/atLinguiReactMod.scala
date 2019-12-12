package typings.atLinguiReact

import org.scalablytyped.runtime.TopLevel
import typings.atLinguiReact.atLinguiReactStrings.i18n
import typings.atLinguiReact.createFormatMod.FormatPropsWithoutI18n
import typings.atLinguiReact.i18nMod.I18nComponentProps
import typings.atLinguiReact.i18nProviderMod.I18nProviderProps
import typings.atLinguiReact.selectMod.PluralPropsWithoutI18n
import typings.atLinguiReact.selectMod.SelectPropsWithoutI18n
import typings.atLinguiReact.transMod.TransPropsWithoutI18n
import typings.atLinguiReact.withI18nMod.ComponentConstructor
import typings.atLinguiReact.withI18nMod.withI18nOptions
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.std.Date
import typings.std.Exclude
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/react", JSImport.Namespace)
@js.native
object atLinguiReactMod extends js.Object {
  @js.native
  class DateFormat protected ()
    extends Component[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[Date, DateTimeFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Date, DateTimeFormatOptions], context: js.Any) = this()
  }
  
  @js.native
  class I18n ()
    extends Component[I18nComponentProps, js.Object, js.Any]
  
  @js.native
  class I18nProvider ()
    extends Component[I18nProviderProps, js.Object, js.Any]
  
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
  
  def i18nMark(id: String): String = js.native
  def withI18n(): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClass[Pick[_, Exclude[String, i18n]], ComponentState]
  ] = js.native
  def withI18n(options: withI18nOptions): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClass[Pick[_, Exclude[String, i18n]], ComponentState]
  ] = js.native
  @js.native
  object DateFormat extends TopLevel[
          ComponentClass[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState]
        ]
  
  @js.native
  object NumberFormat extends TopLevel[
          ComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState]
        ]
  
}

