package typings.ink

import typings.ink.buildStylesMod.Styles
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildComponentsStaticMod {
  
  @JSImport("ink/build/components/Static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](props: Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props[T] extends StObject {
    
    /**
      * Function that is called to render every item in `items` array.
      * First argument is an item itself and second argument is index of that item in `items` array.
      * Note that `key` must be assigned to the root component.
      */
    def children(item: T, index: Double): ReactNode
    
    /**
      * Array of items of any type to render using a function you pass as a component child.
      */
    val items: js.Array[T]
    
    /**
      * Styles to apply to a container of child elements. See <Box> for supported properties.
      */
    val style: js.UndefOr[Styles] = js.undefined
  }
  object Props {
    
    inline def apply[T](children: (T, Double) => ReactNode, items: js.Array[T]): Props[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props[?], T] (val x: Self & Props[T]) extends AnyVal {
      
      inline def setChildren(value: (T, Double) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
