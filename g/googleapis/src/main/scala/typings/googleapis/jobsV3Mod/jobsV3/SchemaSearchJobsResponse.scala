package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchJobsResponse extends StObject {
  
  /**
    * If query broadening is enabled, we may append additional results from the broadened query. This number indicates how many of the jobs returned in the jobs field are from the broadened query. These results are always at the end of the jobs list. In particular, a value of 0, or if the field isn't set, all the jobs in the jobs list are from the original (without broadening) query. If this field is non-zero, subsequent requests with offset after this result set should contain all broadened results.
    */
  var broadenedQueryJobsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * An estimation of the number of jobs that match the specified query. This number is not guaranteed to be accurate. For accurate results, see SearchJobsResponse.total_size.
    */
  var estimatedTotalSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The histogram results that match specified SearchJobsRequest.histogram_facets.
    */
  var histogramResults: js.UndefOr[SchemaHistogramResults] = js.undefined
  
  /**
    * The location filters that the service applied to the specified query. If any filters are lat-lng based, the JobLocation.location_type is JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
    */
  var locationFilters: js.UndefOr[js.Array[SchemaLocation]] = js.undefined
  
  /**
    * The Job entities that match the specified SearchJobsRequest.
    */
  var matchingJobs: js.UndefOr[js.Array[SchemaMatchingJob]] = js.undefined
  
  /**
    * Additional information for the API invocation, such as the request tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.undefined
  
  /**
    * The token that specifies the starting position of the next page of results. This field is empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The spell checking result, and correction.
    */
  var spellCorrection: js.UndefOr[SchemaSpellingCorrection] = js.undefined
  
  /**
    * The precise result count with limit 100,000.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSearchJobsResponse {
  
  inline def apply(): SchemaSearchJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchJobsResponse]
  }
  
  extension [Self <: SchemaSearchJobsResponse](x: Self) {
    
    inline def setBroadenedQueryJobsCount(value: Double): Self = StObject.set(x, "broadenedQueryJobsCount", value.asInstanceOf[js.Any])
    
    inline def setBroadenedQueryJobsCountNull: Self = StObject.set(x, "broadenedQueryJobsCount", null)
    
    inline def setBroadenedQueryJobsCountUndefined: Self = StObject.set(x, "broadenedQueryJobsCount", js.undefined)
    
    inline def setEstimatedTotalSize(value: Double): Self = StObject.set(x, "estimatedTotalSize", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTotalSizeNull: Self = StObject.set(x, "estimatedTotalSize", null)
    
    inline def setEstimatedTotalSizeUndefined: Self = StObject.set(x, "estimatedTotalSize", js.undefined)
    
    inline def setHistogramResults(value: SchemaHistogramResults): Self = StObject.set(x, "histogramResults", value.asInstanceOf[js.Any])
    
    inline def setHistogramResultsUndefined: Self = StObject.set(x, "histogramResults", js.undefined)
    
    inline def setLocationFilters(value: js.Array[SchemaLocation]): Self = StObject.set(x, "locationFilters", value.asInstanceOf[js.Any])
    
    inline def setLocationFiltersUndefined: Self = StObject.set(x, "locationFilters", js.undefined)
    
    inline def setLocationFiltersVarargs(value: SchemaLocation*): Self = StObject.set(x, "locationFilters", js.Array(value*))
    
    inline def setMatchingJobs(value: js.Array[SchemaMatchingJob]): Self = StObject.set(x, "matchingJobs", value.asInstanceOf[js.Any])
    
    inline def setMatchingJobsUndefined: Self = StObject.set(x, "matchingJobs", js.undefined)
    
    inline def setMatchingJobsVarargs(value: SchemaMatchingJob*): Self = StObject.set(x, "matchingJobs", js.Array(value*))
    
    inline def setMetadata(value: SchemaResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSpellCorrection(value: SchemaSpellingCorrection): Self = StObject.set(x, "spellCorrection", value.asInstanceOf[js.Any])
    
    inline def setSpellCorrectionUndefined: Self = StObject.set(x, "spellCorrection", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
