package typings.linguiReact

import typings.linguiCore.mod.I18n_
import typings.linguiReact.cjsTransMod.TransRenderProps
import typings.linguiReact.linguiReactStrings.i18n
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsI18nProviderMod {
  
  @JSImport("@lingui/react/cjs/I18nProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lingui/react/cjs/I18nProvider", "I18nProvider")
  @js.native
  val I18nProvider: FunctionComponent[I18nProviderProps] = js.native
  
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
  
  trait I18nContext extends StObject {
    
    var defaultComponent: js.UndefOr[ComponentType[TransRenderProps]] = js.undefined
    
    var i18n: I18n_
  }
  object I18nContext {
    
    inline def apply(i18n: I18n_): I18nContext = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: I18nContext] (val x: Self) extends AnyVal {
      
      inline def setDefaultComponent(value: ComponentType[TransRenderProps]): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponentUndefined: Self = StObject.set(x, "defaultComponent", js.undefined)
      
      inline def setI18n(value: I18n_): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    }
  }
  
  trait I18nProviderProps
    extends StObject
       with I18nContext {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var forceRenderOnLocaleChange: js.UndefOr[Boolean] = js.undefined
  }
  object I18nProviderProps {
    
    inline def apply(i18n: I18n_): I18nProviderProps = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: I18nProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForceRenderOnLocaleChange(value: Boolean): Self = StObject.set(x, "forceRenderOnLocaleChange", value.asInstanceOf[js.Any])
      
      inline def setForceRenderOnLocaleChangeUndefined: Self = StObject.set(x, "forceRenderOnLocaleChange", js.undefined)
    }
  }
  
  trait withI18nProps extends StObject {
    
    var i18n: I18n_
  }
  object withI18nProps {
    
    inline def apply(i18n: I18n_): withI18nProps = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[withI18nProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: withI18nProps] (val x: Self) extends AnyVal {
      
      inline def setI18n(value: I18n_): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    }
  }
}
