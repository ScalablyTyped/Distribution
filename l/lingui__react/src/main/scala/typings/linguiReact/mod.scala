package typings.linguiReact

import typings.linguiReact.i18nProviderMod.I18nContext
import typings.linguiReact.i18nProviderMod.I18nProviderProps
import typings.linguiReact.i18nProviderMod.withI18nProps
import typings.linguiReact.linguiReactStrings.i18n
import typings.linguiReact.transMod.TransProps
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lingui/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lingui/react", "I18nProvider")
  @js.native
  val I18nProvider: FunctionComponent[I18nProviderProps] = js.native
  
  inline def Trans(props: TransProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Trans")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def useLingui(): I18nContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useLingui")().asInstanceOf[I18nContext]
  
  inline def withI18n(): js.Function1[
    /* Component */ ComponentType[withI18nProps], 
    ComponentType[Omit[withI18nProps, i18n]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withI18n")().asInstanceOf[js.Function1[
    /* Component */ ComponentType[withI18nProps], 
    ComponentType[Omit[withI18nProps, i18n]]
  ]]
  inline def withI18n(o: js.Object): js.Function1[
    /* Component */ ComponentType[withI18nProps], 
    ComponentType[Omit[withI18nProps, i18n]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withI18n")(o.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* Component */ ComponentType[withI18nProps], 
    ComponentType[Omit[withI18nProps, i18n]]
  ]]
}
