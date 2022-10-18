package typings.kbar

import typings.kbar.libActionActionImplMod.ActionImpl
import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKbarresultsMod {
  
  @JSImport("kbar/lib/KBarResults", "KBarResults")
  @js.native
  val KBarResults: FC[KBarResultsProps] = js.native
  
  trait KBarResultsProps extends StObject {
    
    var items: js.Array[Any]
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    def onRender(params: RenderParams[ActionImpl | String]): ReactElement
  }
  object KBarResultsProps {
    
    inline def apply(items: js.Array[Any], onRender: RenderParams[ActionImpl | String] => ReactElement): KBarResultsProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onRender = js.Any.fromFunction1(onRender))
      __obj.asInstanceOf[KBarResultsProps]
    }
    
    extension [Self <: KBarResultsProps](x: Self) {
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setOnRender(value: RenderParams[ActionImpl | String] => ReactElement): Self = StObject.set(x, "onRender", js.Any.fromFunction1(value))
    }
  }
  
  trait RenderParams[T] extends StObject {
    
    var active: Boolean
    
    var item: T
  }
  object RenderParams {
    
    inline def apply[T](active: Boolean, item: T): RenderParams[T] = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderParams[T]]
    }
    
    extension [Self <: RenderParams[?], T](x: Self & RenderParams[T]) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
