package typings.linguiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsTransMod {
  
  @JSImport("@lingui/react/cjs/Trans", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Trans(props: TransProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Trans")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  trait TransProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var component: js.UndefOr[ComponentType[TransRenderProps]] = js.undefined
    
    var components: StringDictionary[ElementType[Any] | Any]
    
    var context: js.UndefOr[String] = js.undefined
    
    var formats: js.UndefOr[js.Object] = js.undefined
    
    var id: String
    
    var message: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* props */ TransRenderProps, ReactElement | Null]] = js.undefined
    
    var values: js.Object
  }
  object TransProps {
    
    inline def apply(components: StringDictionary[ElementType[Any] | Any], id: String, values: js.Object): TransProps = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransProps]
    }
    
    extension [Self <: TransProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponent(value: ComponentType[TransRenderProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setComponents(value: StringDictionary[ElementType[Any] | Any]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFormats(value: js.Object): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setRender(value: /* props */ TransRenderProps => ReactElement | Null): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransRenderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isTranslated: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[String | Null] = js.undefined
    
    var translation: js.UndefOr[ReactNode] = js.undefined
  }
  object TransRenderProps {
    
    inline def apply(): TransRenderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransRenderProps]
    }
    
    extension [Self <: TransRenderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsTranslated(value: Boolean): Self = StObject.set(x, "isTranslated", value.asInstanceOf[js.Any])
      
      inline def setIsTranslatedUndefined: Self = StObject.set(x, "isTranslated", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setTranslation(value: ReactNode): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
      
      inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
    }
  }
}
