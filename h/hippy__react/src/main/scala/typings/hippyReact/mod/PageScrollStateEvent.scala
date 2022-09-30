package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageScrollStateEvent extends StObject {
  
  var pageScrollState: PageScrollState
}
object PageScrollStateEvent {
  
  inline def apply(pageScrollState: PageScrollState): PageScrollStateEvent = {
    val __obj = js.Dynamic.literal(pageScrollState = pageScrollState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageScrollStateEvent]
  }
  
  extension [Self <: PageScrollStateEvent](x: Self) {
    
    inline def setPageScrollState(value: PageScrollState): Self = StObject.set(x, "pageScrollState", value.asInstanceOf[js.Any])
  }
}
