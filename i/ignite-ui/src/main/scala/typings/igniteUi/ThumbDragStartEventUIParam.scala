package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbDragStartEventUIParam extends StObject {
  
  /**
    * Gets which axis is being used to scroll - horizontal(true) or vertical(false).
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets a reference to the igScroll.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ThumbDragStartEventUIParam {
  
  inline def apply(): ThumbDragStartEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbDragStartEventUIParam]
  }
  
  extension [Self <: ThumbDragStartEventUIParam](x: Self) {
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
