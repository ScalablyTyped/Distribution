package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildComponentsTransformMod extends Shortcut {
  
  /**
    * Transform a string representation of React components before they are written to output.
    * For example, you might want to apply a gradient to text, add a clickable link or create some text effects.
    * These use cases can't accept React nodes as input, they are expecting a string.
    * That's what <Transform> component does, it gives you an output string of its child components and lets you transform it in any way.
    */
  @JSImport("ink/build/components/Transform", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
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
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTransform(value: String => String): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `buildComponentsTransformMod.foo` */
  override def _to: FC[Props] = default
}
