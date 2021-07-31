package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryCount extends StObject {
  
  /** The name of category. */
  var category: js.UndefOr[String] = js.undefined
  
  /** The count of training samples matching the category within the cluster. */
  var count: js.UndefOr[String] = js.undefined
}
object CategoryCount {
  
  @scala.inline
  def apply(): CategoryCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryCount]
  }
  
  @scala.inline
  implicit class CategoryCountMutableBuilder[Self <: CategoryCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
