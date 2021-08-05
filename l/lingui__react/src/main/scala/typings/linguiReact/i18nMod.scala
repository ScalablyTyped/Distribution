package typings.linguiReact

import typings.linguiReact.anon.I18n
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nMod {
  
  @JSImport("@lingui/react/I18n", JSImport.Default)
  @js.native
  class default ()
    extends Component[I18nComponentProps, js.Object, js.Any]
  
  type I18nComponent = Component[I18nComponentProps, js.Object, js.Any]
  
  trait I18nComponentProps extends StObject {
    
    def children(hasI18nI18nHash: I18n): ReactNode
    
    var update: js.UndefOr[Boolean] = js.undefined
    
    var withHash: js.UndefOr[Boolean] = js.undefined
  }
  object I18nComponentProps {
    
    inline def apply(children: I18n => ReactNode): I18nComponentProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[I18nComponentProps]
    }
    
    extension [Self <: I18nComponentProps](x: Self) {
      
      inline def setChildren(value: I18n => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setWithHash(value: Boolean): Self = StObject.set(x, "withHash", value.asInstanceOf[js.Any])
      
      inline def setWithHashUndefined: Self = StObject.set(x, "withHash", js.undefined)
    }
  }
}
