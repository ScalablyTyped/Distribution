package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var ascending: js.UndefOr[Boolean] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var maximumValue: js.UndefOr[Double] = js.undefined
  
  var minimumValue: js.UndefOr[Double] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
}
object Count {
  
  @scala.inline
  def apply(): Count = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
