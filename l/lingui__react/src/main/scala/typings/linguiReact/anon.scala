package typings.linguiReact

import org.scalablytyped.runtime.StringDictionary
import typings.linguiReact.mod.TransRenderCallbackOrComponent
import typings.linguiReact.mod.TransRenderProps
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var components: js.UndefOr[StringDictionary[ElementType[Any] | Any]] = js.undefined
    
    var formats: js.UndefOr[Record[String, Any]] = js.undefined
    
    var id: String
    
    var message: js.UndefOr[String] = js.undefined
    
    var values: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object Children {
    
    inline def apply(id: String): Children = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponents(value: StringDictionary[ElementType[Any] | Any]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setFormats(value: Record[String, Any]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setValues(value: Record[String, Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait Component
    extends StObject
       with TransRenderCallbackOrComponent {
    
    var component: Unit
    
    var render: js.UndefOr[js.Function1[/* props */ TransRenderProps, ReactElement | Null]] = js.undefined
  }
  object Component {
    
    inline def apply(component: Unit): Component = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: Unit): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setRender(value: /* props */ TransRenderProps => ReactElement | Null): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  trait Render
    extends StObject
       with TransRenderCallbackOrComponent {
    
    var component: js.UndefOr[ComponentType[TransRenderProps] | Null] = js.undefined
    
    var render: Unit
  }
  object Render {
    
    inline def apply(render: Unit): Render = {
      val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[Render]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: ComponentType[TransRenderProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentNull: Self = StObject.set(x, "component", null)
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setRender(value: Unit): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
}
