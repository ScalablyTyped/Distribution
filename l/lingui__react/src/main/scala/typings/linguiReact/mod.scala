package typings.linguiReact

import typings.linguiCore.mod.I18n_
import typings.linguiReact.anon.Children
import typings.linguiReact.anon.Component
import typings.linguiReact.linguiReactStrings.component
import typings.linguiReact.linguiReactStrings.render
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Exclude
import typings.std.Partial
import typings.std.Record
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
  
  @JSImport("@lingui/react", "LinguiContext")
  @js.native
  val LinguiContext: Context[I18nContext] = js.native
  
  inline def Trans(props: TransProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Trans")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def useLingui(): I18nContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useLingui")().asInstanceOf[I18nContext]
  
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
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    K extends keyof T ? {[ P in K ]:? T[K]} & std.Partial<std.Record<std.Exclude<keyof T, K>, never>> : never
    }}}
    */
  type MaximumOneOf[T, K /* <: /* keyof T */ String */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]:? T[K]} */ js.Any) & (Partial[Record[Exclude[/* keyof T */ String, K], scala.Nothing]])
  
  type TransProps = Children & (MaximumOneOf[Component, /* keyof @lingui/react.anon.Component */ component | render])
  
  trait TransRenderProps extends StObject {
    
    var children: ReactNode
    
    var id: String
    
    var isTranslated: Boolean
    
    var message: js.UndefOr[String | Null] = js.undefined
    
    var translation: ReactNode
  }
  object TransRenderProps {
    
    inline def apply(id: String, isTranslated: Boolean): TransRenderProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isTranslated = isTranslated.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransRenderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransRenderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsTranslated(value: Boolean): Self = StObject.set(x, "isTranslated", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setTranslation(value: ReactNode): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
      
      inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
    }
  }
}
