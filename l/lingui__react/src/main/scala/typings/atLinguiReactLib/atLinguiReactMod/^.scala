package typings
package atLinguiReactLib.atLinguiReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DateFormat: reactLib.reactMod.ComponentClass[
    atLinguiReactLib.createFormatMod.FormatPropsWithoutI18n[stdLib.Date, stdLib.IntlNs.DateTimeFormatOptions], 
    reactLib.reactMod.ComponentState
  ] = js.native
  val NumberFormat: reactLib.reactMod.ComponentClass[
    atLinguiReactLib.createFormatMod.FormatPropsWithoutI18n[scala.Double, stdLib.IntlNs.NumberFormatOptions], 
    reactLib.reactMod.ComponentState
  ] = js.native
  def i18nMark(id: java.lang.String): java.lang.String = js.native
  def withI18n(): js.Function1[
    /* WrappedComponent */ atLinguiReactLib.withI18nMod.ComponentConstructor[_], 
    reactLib.reactMod.ComponentClass[
      stdLib.Pick[_, stdLib.Exclude[java.lang.String, atLinguiReactLib.atLinguiReactLibStrings.i18n]], 
      reactLib.reactMod.ComponentState
    ]
  ] = js.native
  def withI18n(options: atLinguiReactLib.withI18nMod.withI18nOptions): js.Function1[
    /* WrappedComponent */ atLinguiReactLib.withI18nMod.ComponentConstructor[_], 
    reactLib.reactMod.ComponentClass[
      stdLib.Pick[_, stdLib.Exclude[java.lang.String, atLinguiReactLib.atLinguiReactLibStrings.i18n]], 
      reactLib.reactMod.ComponentState
    ]
  ] = js.native
}

