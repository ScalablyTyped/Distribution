package typings.ink

import typings.ink.stylesMod.Styles
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticMod {
  
  /**
    * `<Static>` component permanently renders its output above everything else.
    * It's useful for displaying activity like completed tasks or logs - things that
    * are not changing after they're rendered (hence the name "Static").
    *
    * It's preferred to use `<Static>` for use cases like these, when you can't know
    * or control the amount of items that need to be rendered.
    *
    * For example, [Tap](https://github.com/tapjs/node-tap) uses `<Static>` to display
    * a list of completed tests. [Gatsby](https://github.com/gatsbyjs/gatsby) uses it
    * to display a list of generated pages, while still displaying a live progress bar.
    */
  object default {
    
    @JSImport("ink/build/components/Static", JSImport.Default)
    @js.native
    def apply[T](props: Props[T]): Element = js.native
    @JSImport("ink/build/components/Static", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ink/build/components/Static", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Props[T] extends Styles {
    
    /**
      * Function that is called to render every item in `items` array.
      * First argument is an item itself and second argument is index of that item in `items` array.
      * Note that `key` must be assigned to the root component.
      */
    def children(item: T, index: Double): ReactNode = js.native
    
    /**
      * Array of items of any type to render using a function you pass as a component child.
      */
    val items: js.Array[T] = js.native
    
    /**
      * Styles to apply to a container of child elements. See <Box> for supported properties.
      */
    val style: js.UndefOr[Styles] = js.native
  }
  object Props {
    
    @scala.inline
    def apply[T](children: (T, Double) => ReactNode, items: js.Array[T]): Props[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[T]]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props[_], T] (val x: Self with Props[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (T, Double) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
