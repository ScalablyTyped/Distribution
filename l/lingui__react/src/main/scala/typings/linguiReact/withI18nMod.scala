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
  
  @scala.inline
  def default(): js.Function1[
    /* WrappedComponent */ ComponentConstructor[js.Any], 
    ComponentClass[Pick[js.Any, Exclude[/* keyof any */ String, i18n | i18nHash]], ComponentState]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[
    /* WrappedComponent */ ComponentConstructor[js.Any], 
    ComponentClass[Pick[js.Any, Exclude[/* keyof any */ String, i18n | i18nHash]], ComponentState]
  ]]
  @scala.inline
  def default(options: withI18nOptions): js.Function1[
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
    
    @scala.inline
    def apply(): withI18nOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[withI18nOptions]
    }
    
    @scala.inline
    implicit class withI18nOptionsMutableBuilder[Self <: withI18nOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      @scala.inline
      def setWithHash(value: Boolean): Self = StObject.set(x, "withHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithHashUndefined: Self = StObject.set(x, "withHash", js.undefined)
      
      @scala.inline
      def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
    }
  }
  
  trait withI18nProps extends StObject {
    
    var i18n: I18n_
    
    var i18nHash: js.UndefOr[String | Null] = js.undefined
  }
  object withI18nProps {
    
    @scala.inline
    def apply(i18n: I18n_): withI18nProps = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[withI18nProps]
    }
    
    @scala.inline
    implicit class withI18nPropsMutableBuilder[Self <: withI18nProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setI18n(value: I18n_): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nHash(value: String): Self = StObject.set(x, "i18nHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nHashNull: Self = StObject.set(x, "i18nHash", null)
      
      @scala.inline
      def setI18nHashUndefined: Self = StObject.set(x, "i18nHash", js.undefined)
    }
  }
}
