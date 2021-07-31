package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoricalValue extends StObject {
  
  /**
    * Counts of all categories for the categorical feature. If there are more than ten categories, we return top ten (by count) and return one more CategoryCount with category "_OTHER_"
    * and count as aggregate counts of remaining categories.
    */
  var categoryCounts: js.UndefOr[js.Array[CategoryCount]] = js.undefined
}
object CategoricalValue {
  
  @scala.inline
  def apply(): CategoricalValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoricalValue]
  }
  
  @scala.inline
  implicit class CategoricalValueMutableBuilder[Self <: CategoricalValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryCounts(value: js.Array[CategoryCount]): Self = StObject.set(x, "categoryCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryCountsUndefined: Self = StObject.set(x, "categoryCounts", js.undefined)
    
    @scala.inline
    def setCategoryCountsVarargs(value: CategoryCount*): Self = StObject.set(x, "categoryCounts", js.Array(value :_*))
  }
}
