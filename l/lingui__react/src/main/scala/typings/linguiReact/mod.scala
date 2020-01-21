package typings.linguiReact

import org.scalablytyped.runtime.TopLevel
import typings.linguiReact.createFormatMod.FormatPropsWithoutI18n
import typings.linguiReact.i18nMod.I18nComponentProps
import typings.linguiReact.i18nProviderMod.I18nProviderProps
import typings.linguiReact.linguiReactStrings.i18n
import typings.linguiReact.selectMod.PluralPropsWithoutI18n
import typings.linguiReact.selectMod.SelectPropsWithoutI18n
import typings.linguiReact.transMod.TransPropsWithoutI18n
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/react", JSImport.Namespace)
@js.native
object mod extends js.Object {
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

