package typings.grommet

import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsInfiniteScrollMod {
  
  @JSImport("grommet/components/InfiniteScroll", "InfiniteScroll")
  @js.native
  val InfiniteScroll: FC[InfiniteScrollProps] = js.native
  
  trait InfiniteScrollProps extends StObject {
    
    var children: js.UndefOr[ReactNode | js.Function] = js.undefined
    
    var items: js.UndefOr[js.Array[String | Double | ReactElement | (Record[String, Any])]] = js.undefined
    
    var onMore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var renderMarker: js.UndefOr[js.Function1[/* marker */ ReactElement, ReactElement]] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var show: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object InfiniteScrollProps {
    
    inline def apply(): InfiniteScrollProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfiniteScrollProps]
    }
    
    extension [Self <: InfiniteScrollProps](x: Self) {
      
      inline def setChildren(value: ReactNode | js.Function): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setItems(value: js.Array[String | Double | ReactElement | (Record[String, Any])]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: (String | Double | ReactElement | (Record[String, Any]))*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnMore(value: () => Unit): Self = StObject.set(x, "onMore", js.Any.fromFunction0(value))
      
      inline def setOnMoreUndefined: Self = StObject.set(x, "onMore", js.undefined)
      
      inline def setRenderMarker(value: /* marker */ ReactElement => ReactElement): Self = StObject.set(x, "renderMarker", js.Any.fromFunction1(value))
      
      inline def setRenderMarkerUndefined: Self = StObject.set(x, "renderMarker", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
