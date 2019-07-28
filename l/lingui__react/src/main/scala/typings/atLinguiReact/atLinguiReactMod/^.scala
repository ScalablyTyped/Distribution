package typings.atLinguiReact.atLinguiReactMod

import typings.atLinguiReact.atLinguiReactStrings.i18n
import typings.atLinguiReact.createFormatMod.FormatPropsWithoutI18n
import typings.atLinguiReact.withI18nMod.ComponentConstructor
import typings.atLinguiReact.withI18nMod.withI18nOptions
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.std.Date
import typings.std.Exclude
import typings.std.IntlNs.DateTimeFormatOptions
import typings.std.IntlNs.NumberFormatOptions
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DateFormat: ComponentClass[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState] = js.native
  val NumberFormat: ComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState] = js.native
  def i18nMark(id: String): String = js.native
  def withI18n(): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClass[Pick[_, Exclude[String, i18n]], ComponentState]
  ] = js.native
  def withI18n(options: withI18nOptions): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClass[Pick[_, Exclude[String, i18n]], ComponentState]
  ] = js.native
}

