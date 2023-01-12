package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortOptions extends StObject {
  
  /** The name of the operator corresponding to the field to sort on. The corresponding property must be marked as sortable. */
  var operatorName: js.UndefOr[String] = js.undefined
  
  /** Ascending is the default sort order */
  var sortOrder: js.UndefOr[String] = js.undefined
}
object SortOptions {
  
  inline def apply(): SortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortOptions] (val x: Self) extends AnyVal {
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
