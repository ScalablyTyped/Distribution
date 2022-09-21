package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummariesTogglingEventUIParam extends StObject {
  
  /**
    * Gets whether summaries are shown or not.
    */
  var isToShow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object SummariesTogglingEventUIParam {
  
  inline def apply(): SummariesTogglingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummariesTogglingEventUIParam]
  }
  
  extension [Self <: SummariesTogglingEventUIParam](x: Self) {
    
    inline def setIsToShow(value: Boolean): Self = StObject.set(x, "isToShow", value.asInstanceOf[js.Any])
    
    inline def setIsToShowUndefined: Self = StObject.set(x, "isToShow", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
