package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrolledEventUIParam extends StObject {
  
  /**
    * Gets if the content is scrolled by the scrollbar track areas. 0 - none used, -1 - Scrolled Up/Left, 1 - Scrolled Down/Right.
    */
  var bigIncrement: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets which axis is being used to scroll - horizontal(true) or vertical(false).
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets a reference to the igScroll.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets if the content is scrolled by the arrows. 0 - none used, -1 - Arrow Up/Left, 1 - Arrow Down/Right.
    */
  var smallIncrement: js.UndefOr[Double] = js.undefined
}
object ScrolledEventUIParam {
  
  inline def apply(): ScrolledEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrolledEventUIParam]
  }
  
  extension [Self <: ScrolledEventUIParam](x: Self) {
    
    inline def setBigIncrement(value: Double): Self = StObject.set(x, "bigIncrement", value.asInstanceOf[js.Any])
    
    inline def setBigIncrementUndefined: Self = StObject.set(x, "bigIncrement", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSmallIncrement(value: Double): Self = StObject.set(x, "smallIncrement", value.asInstanceOf[js.Any])
    
    inline def setSmallIncrementUndefined: Self = StObject.set(x, "smallIncrement", js.undefined)
  }
}
