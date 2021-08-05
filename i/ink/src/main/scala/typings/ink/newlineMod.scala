package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newlineMod extends Shortcut {
  
  /**
    * Adds one or more newline (\n) characters. Must be used within <Text> components.
    */
  @JSImport("ink/build/components/Newline", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  trait Props extends StObject {
    
    /**
      * Number of newlines to insert.
      *
      * @default 1
      */
    val count: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `newlineMod.foo` */
  override def _to: FC[Props] = default
}
