package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.AccountId
import typings.googleapis.anon.ColumnType
import typings.googleapis.anon.ConversionPathValue
import typings.googleapis.anon.Dimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMcfData extends StObject {
  
  /**
    * Column headers that list dimension names followed by the metric names. The order of dimensions and metrics is same as specified in the request.
    */
  var columnHeaders: js.UndefOr[js.Array[ColumnType] | Null] = js.undefined
  
  /**
    * Determines if the Analytics data contains sampled data.
    */
  var containsSampledData: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Unique ID for this data response.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of rows the response can contain, regardless of the actual number of rows returned. Its value ranges from 1 to 10,000 with a value of 1000 by default, or otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to next page for this Analytics data query.
    */
  var nextLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to previous page for this Analytics data query.
    */
  var previousLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information for the view (profile), for which the Analytics data was requested.
    */
  var profileInfo: js.UndefOr[AccountId | Null] = js.undefined
  
  /**
    * Analytics data request query parameters.
    */
  var query: js.UndefOr[Dimensions | Null] = js.undefined
  
  /**
    * Analytics data rows, where each row contains a list of dimension values followed by the metric values. The order of dimensions and metrics is same as specified in the request.
    */
  var rows: js.UndefOr[js.Array[js.Array[ConversionPathValue]] | Null] = js.undefined
  
  /**
    * The number of samples used to calculate the result.
    */
  var sampleSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total size of the sample space from which the samples were selected.
    */
  var sampleSpace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to this page.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of rows for the query, regardless of the number of rows in the response.
    */
  var totalResults: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Total values for the requested metrics over all the results, not just the results returned in this response. The order of the metric totals is same as the metric order specified in the request.
    */
  var totalsForAllResults: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaMcfData {
  
  inline def apply(): SchemaMcfData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMcfData]
  }
  
  extension [Self <: SchemaMcfData](x: Self) {
    
    inline def setColumnHeaders(value: js.Array[ColumnType]): Self = StObject.set(x, "columnHeaders", value.asInstanceOf[js.Any])
    
    inline def setColumnHeadersNull: Self = StObject.set(x, "columnHeaders", null)
    
    inline def setColumnHeadersUndefined: Self = StObject.set(x, "columnHeaders", js.undefined)
    
    inline def setColumnHeadersVarargs(value: ColumnType*): Self = StObject.set(x, "columnHeaders", js.Array(value*))
    
    inline def setContainsSampledData(value: Boolean): Self = StObject.set(x, "containsSampledData", value.asInstanceOf[js.Any])
    
    inline def setContainsSampledDataNull: Self = StObject.set(x, "containsSampledData", null)
    
    inline def setContainsSampledDataUndefined: Self = StObject.set(x, "containsSampledData", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    inline def setItemsPerPageNull: Self = StObject.set(x, "itemsPerPage", null)
    
    inline def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    
    inline def setNextLinkNull: Self = StObject.set(x, "nextLink", null)
    
    inline def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
    
    inline def setPreviousLink(value: String): Self = StObject.set(x, "previousLink", value.asInstanceOf[js.Any])
    
    inline def setPreviousLinkNull: Self = StObject.set(x, "previousLink", null)
    
    inline def setPreviousLinkUndefined: Self = StObject.set(x, "previousLink", js.undefined)
    
    inline def setProfileInfo(value: AccountId): Self = StObject.set(x, "profileInfo", value.asInstanceOf[js.Any])
    
    inline def setProfileInfoNull: Self = StObject.set(x, "profileInfo", null)
    
    inline def setProfileInfoUndefined: Self = StObject.set(x, "profileInfo", js.undefined)
    
    inline def setQuery(value: Dimensions): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRows(value: js.Array[js.Array[ConversionPathValue]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsNull: Self = StObject.set(x, "rows", null)
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: js.Array[ConversionPathValue]*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSampleSize(value: String): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    inline def setSampleSizeNull: Self = StObject.set(x, "sampleSize", null)
    
    inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    inline def setSampleSpace(value: String): Self = StObject.set(x, "sampleSpace", value.asInstanceOf[js.Any])
    
    inline def setSampleSpaceNull: Self = StObject.set(x, "sampleSpace", null)
    
    inline def setSampleSpaceUndefined: Self = StObject.set(x, "sampleSpace", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsNull: Self = StObject.set(x, "totalResults", null)
    
    inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
    
    inline def setTotalsForAllResults(value: StringDictionary[String]): Self = StObject.set(x, "totalsForAllResults", value.asInstanceOf[js.Any])
    
    inline def setTotalsForAllResultsNull: Self = StObject.set(x, "totalsForAllResults", null)
    
    inline def setTotalsForAllResultsUndefined: Self = StObject.set(x, "totalsForAllResults", js.undefined)
  }
}
