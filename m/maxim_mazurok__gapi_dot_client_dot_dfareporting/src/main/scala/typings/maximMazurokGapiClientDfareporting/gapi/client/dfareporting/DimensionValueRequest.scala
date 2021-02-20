package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionValueRequest extends StObject {
  
  /** The name of the dimension for which values should be requested. */
  var dimensionName: js.UndefOr[String] = js.native
  
  var endDate: js.UndefOr[String] = js.native
  
  /** The list of filters by which to filter values. The filters are ANDed. */
  var filters: js.UndefOr[js.Array[DimensionFilter]] = js.native
  
  /** The kind of request this is, in this case dfareporting#dimensionValueRequest . */
  var kind: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[String] = js.native
}
object DimensionValueRequest {
  
  @scala.inline
  def apply(): DimensionValueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValueRequest]
  }
  
  @scala.inline
  implicit class DimensionValueRequestMutableBuilder[Self <: DimensionValueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Array[DimensionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: DimensionFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
