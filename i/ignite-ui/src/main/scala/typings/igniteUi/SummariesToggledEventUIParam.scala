package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummariesToggledEventUIParam extends StObject {
  
  /**
    * Gets whether summaries are shown or not.
    */
  var isToShow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object SummariesToggledEventUIParam {
  
  inline def apply(): SummariesToggledEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummariesToggledEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SummariesToggledEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setIsToShow(value: Boolean): Self = StObject.set(x, "isToShow", value.asInstanceOf[js.Any])
    
    inline def setIsToShowUndefined: Self = StObject.set(x, "isToShow", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
