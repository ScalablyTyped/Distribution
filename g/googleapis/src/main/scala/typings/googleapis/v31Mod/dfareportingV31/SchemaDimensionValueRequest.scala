package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a DimensionValuesRequest.
  */
@js.native
trait SchemaDimensionValueRequest extends StObject {
  
  /**
    * The name of the dimension for which values should be requested.
    */
  var dimensionName: js.UndefOr[String] = js.native
  
  /**
    * The end date of the date range for which to retrieve dimension values. A
    * string of the format &quot;yyyy-MM-dd&quot;.
    */
  var endDate: js.UndefOr[String] = js.native
  
  /**
    * The list of filters by which to filter values. The filters are ANDed.
    */
  var filters: js.UndefOr[js.Array[SchemaDimensionFilter]] = js.native
  
  /**
    * The kind of request this is, in this case
    * dfareporting#dimensionValueRequest.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The start date of the date range for which to retrieve dimension values.
    * A string of the format &quot;yyyy-MM-dd&quot;.
    */
  var startDate: js.UndefOr[String] = js.native
}
object SchemaDimensionValueRequest {
  
  @scala.inline
  def apply(): SchemaDimensionValueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionValueRequest]
  }
  
  @scala.inline
  implicit class SchemaDimensionValueRequestMutableBuilder[Self <: SchemaDimensionValueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Array[SchemaDimensionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: SchemaDimensionFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
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
