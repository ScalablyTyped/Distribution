package typings.linguiReact.withI18nMod

import typings.linguiReact.linguiReactStrings.i18n
import typings.linguiReact.linguiReactStrings.i18nHash
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lingui/react/withI18n", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClass[Pick[_, Exclude[/* keyof any */ String, i18n | i18nHash]], ComponentState]
  ] = js.native
  def apply(options: withI18nOptions): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClass[Pick[_, Exclude[/* keyof any */ String, i18n | i18nHash]], ComponentState]
  ] = js.native
}
