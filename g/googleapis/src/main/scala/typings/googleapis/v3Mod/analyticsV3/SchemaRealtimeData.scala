package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.AccountId
import typings.googleapis.anon.ColumnType
import typings.googleapis.anon.Filters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Real time data for a given view (profile).
  */
@js.native
trait SchemaRealtimeData extends StObject {
  
  /**
    * Column headers that list dimension names followed by the metric names.
    * The order of dimensions and metrics is same as specified in the request.
    */
  var columnHeaders: js.UndefOr[js.Array[ColumnType]] = js.native
  
  /**
    * Unique ID for this data response.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Information for the view (profile), for which the real time data was
    * requested.
    */
  var profileInfo: js.UndefOr[AccountId] = js.native
  
  /**
    * Real time data request query parameters.
    */
  var query: js.UndefOr[Filters] = js.native
  
  /**
    * Real time data rows, where each row contains a list of dimension values
    * followed by the metric values. The order of dimensions and metrics is
    * same as specified in the request.
    */
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  /**
    * Link to this page.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * The total number of rows for the query, regardless of the number of rows
    * in the response.
    */
  var totalResults: js.UndefOr[Double] = js.native
  
  /**
    * Total values for the requested metrics over all the results, not just the
    * results returned in this response. The order of the metric totals is same
    * as the metric order specified in the request.
    */
  var totalsForAllResults: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaRealtimeData {
  
  @scala.inline
  def apply(): SchemaRealtimeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRealtimeData]
  }
  
  @scala.inline
  implicit class SchemaRealtimeDataMutableBuilder[Self <: SchemaRealtimeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnHeaders(value: js.Array[ColumnType]): Self = StObject.set(x, "columnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHeadersUndefined: Self = StObject.set(x, "columnHeaders", js.undefined)
    
    @scala.inline
    def setColumnHeadersVarargs(value: ColumnType*): Self = StObject.set(x, "columnHeaders", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProfileInfo(value: AccountId): Self = StObject.set(x, "profileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileInfoUndefined: Self = StObject.set(x, "profileInfo", js.undefined)
    
    @scala.inline
    def setQuery(value: Filters): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[js.Array[String]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Array[String]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
    
    @scala.inline
    def setTotalsForAllResults(value: StringDictionary[String]): Self = StObject.set(x, "totalsForAllResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalsForAllResultsUndefined: Self = StObject.set(x, "totalsForAllResults", js.undefined)
  }
}
