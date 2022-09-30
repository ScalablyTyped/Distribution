package typings.hippyReact.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshWrapperProps
  extends StObject
     with LayoutableProps
     with ClickableProps
     with TouchableProps {
  
  var bounceTime: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var getRefresh: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var style: js.UndefOr[ViewStyleProp] = js.undefined
}
object RefreshWrapperProps {
  
  inline def apply(): RefreshWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshWrapperProps]
  }
  
  extension [Self <: RefreshWrapperProps](x: Self) {
    
    inline def setBounceTime(value: Double): Self = StObject.set(x, "bounceTime", value.asInstanceOf[js.Any])
    
    inline def setBounceTimeUndefined: Self = StObject.set(x, "bounceTime", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setGetRefresh(value: () => ReactElement): Self = StObject.set(x, "getRefresh", js.Any.fromFunction0(value))
    
    inline def setGetRefreshUndefined: Self = StObject.set(x, "getRefresh", js.undefined)
    
    inline def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
    
    inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    inline def setStyle(value: ViewStyleProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
