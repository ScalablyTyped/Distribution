package typings.grommet

import typings.grommet.grommetStrings.window
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteScrollMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/InfiniteScroll", "InfiniteScroll")
  @js.native
  class InfiniteScroll protected ()
    extends Component[InfiniteScrollProps, ComponentState, js.Any] {
    def this(props: InfiniteScrollProps) = this()
    def this(props: InfiniteScrollProps, context: js.Any) = this()
  }
  @JSImport("grommet/components/InfiniteScroll", "InfiniteScroll")
  @js.native
  val InfiniteScroll: ComponentClass[InfiniteScrollProps, ComponentState] = js.native
  
  trait InfiniteScrollProps extends StObject {
    
    var items: js.UndefOr[js.Array[String | Double | ReactElement | (Record[String, js.Any])]] = js.undefined
    
    var onMore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var renderMarker: js.UndefOr[js.Function1[/* marker */ ReactElement, ReactElement]] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var scrollableAncestor: js.UndefOr[ReactNode | window] = js.undefined
    
    var show: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object InfiniteScrollProps {
    
    inline def apply(): InfiniteScrollProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfiniteScrollProps]
    }
    
    extension [Self <: InfiniteScrollProps](x: Self) {
      
      inline def setItems(value: js.Array[String | Double | ReactElement | (Record[String, js.Any])]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: (String | Double | ReactElement | (Record[String, js.Any]))*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setOnMore(value: () => Unit): Self = StObject.set(x, "onMore", js.Any.fromFunction0(value))
      
      inline def setOnMoreUndefined: Self = StObject.set(x, "onMore", js.undefined)
      
      inline def setRenderMarker(value: /* marker */ ReactElement => ReactElement): Self = StObject.set(x, "renderMarker", js.Any.fromFunction1(value))
      
      inline def setRenderMarkerUndefined: Self = StObject.set(x, "renderMarker", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setScrollableAncestor(value: ReactNode | window): Self = StObject.set(x, "scrollableAncestor", value.asInstanceOf[js.Any])
      
      inline def setScrollableAncestorUndefined: Self = StObject.set(x, "scrollableAncestor", js.undefined)
      
      inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
