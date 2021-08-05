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
  
  inline def apply(): CategoryCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryCount]
  }
  
  extension [Self <: CategoryCount](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
