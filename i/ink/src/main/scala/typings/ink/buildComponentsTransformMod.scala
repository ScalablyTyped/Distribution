package typings.ink

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildComponentsTransformMod {
  
  @JSImport("ink/build/components/Transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait Props extends StObject {
    
    val children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Function which transforms children output. It accepts children and must return transformed children too.
      */
    def transform(children: String): String
  }
  object Props {
    
    inline def apply(transform: String => String): Props = {
      val __obj = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTransform(value: String => String): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    }
  }
}
