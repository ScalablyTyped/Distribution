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
  var owner: js.UndefOr[js.Any] = js.undefined
}
object SummariesTogglingEventUIParam {
  
  @scala.inline
  def apply(): SummariesTogglingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummariesTogglingEventUIParam]
  }
  
  @scala.inline
  implicit class SummariesTogglingEventUIParamMutableBuilder[Self <: SummariesTogglingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsToShow(value: Boolean): Self = StObject.set(x, "isToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsToShowUndefined: Self = StObject.set(x, "isToShow", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
