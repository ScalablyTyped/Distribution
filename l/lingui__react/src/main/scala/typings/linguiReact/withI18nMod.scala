package typings.linguiReact

import typings.linguiCore.mod.I18n_
import typings.linguiReact.linguiReactStrings.i18n
import typings.linguiReact.linguiReactStrings.i18nHash
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withI18nMod {
  
  @JSImport("@lingui/react/withI18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[
    /* WrappedComponent */ ComponentConstructor[js.Any], 
    ComponentClass[Pick[js.Any, Exclude[/* keyof any */ String, i18n | i18nHash]], ComponentState]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[
    /* WrappedComponent */ ComponentConstructor[js.Any], 
    ComponentClass[Pick[js.Any, Exclude[/* keyof any */ String, i18n | i18nHash]], ComponentState]
  ]]
  inline def default(options: withI18nOptions): js.Function1[
    /* WrappedComponent */ ComponentConstructor[js.Any], 
    ComponentClass[Pick[js.Any, Exclude[/* keyof any */ String, i18n | i18nHash]], ComponentState]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* WrappedComponent */ ComponentConstructor[js.Any], 
    ComponentClass[Pick[js.Any, Exclude[/* keyof any */ String, i18n | i18nHash]], ComponentState]
  ]]
  
  type ComponentConstructor[P] = (ComponentClass[P, ComponentState]) | StatelessComponent[P]
  
  trait withI18nOptions extends StObject {
    
    var update: js.UndefOr[Boolean] = js.undefined
    
    var withHash: js.UndefOr[Boolean] = js.undefined
    
    var withRef: js.UndefOr[Boolean] = js.undefined
  }
  object withI18nOptions {
    
    inline def apply(): withI18nOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[withI18nOptions]
    }
    
    extension [Self <: withI18nOptions](x: Self) {
      
      inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setWithHash(value: Boolean): Self = StObject.set(x, "withHash", value.asInstanceOf[js.Any])
      
      inline def setWithHashUndefined: Self = StObject.set(x, "withHash", js.undefined)
      
      inline def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
      
      inline def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
    }
  }
  
  trait withI18nProps extends StObject {
    
    var i18n: I18n_
    
    var i18nHash: js.UndefOr[String | Null] = js.undefined
  }
  object withI18nProps {
    
    inline def apply(i18n: I18n_): withI18nProps = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[withI18nProps]
    }
    
    extension [Self <: withI18nProps](x: Self) {
      
      inline def setI18n(value: I18n_): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nHash(value: String): Self = StObject.set(x, "i18nHash", value.asInstanceOf[js.Any])
      
      inline def setI18nHashNull: Self = StObject.set(x, "i18nHash", null)
      
      inline def setI18nHashUndefined: Self = StObject.set(x, "i18nHash", js.undefined)
    }
  }
}
