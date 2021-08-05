package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceResultCount extends StObject {
  
  /** Whether there are more search results for this source. */
  var hasMoreResults: js.UndefOr[Boolean] = js.undefined
  
  /** The estimated result count for this source. */
  var resultCountEstimate: js.UndefOr[String] = js.undefined
  
  /** The exact result count for this source. */
  var resultCountExact: js.UndefOr[String] = js.undefined
  
  /** The source the result count information is associated with. */
  var source: js.UndefOr[Source] = js.undefined
}
object SourceResultCount {
  
  inline def apply(): SourceResultCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceResultCount]
  }
  
  extension [Self <: SourceResultCount](x: Self) {
    
    inline def setHasMoreResults(value: Boolean): Self = StObject.set(x, "hasMoreResults", value.asInstanceOf[js.Any])
    
    inline def setHasMoreResultsUndefined: Self = StObject.set(x, "hasMoreResults", js.undefined)
    
    inline def setResultCountEstimate(value: String): Self = StObject.set(x, "resultCountEstimate", value.asInstanceOf[js.Any])
    
    inline def setResultCountEstimateUndefined: Self = StObject.set(x, "resultCountEstimate", js.undefined)
    
    inline def setResultCountExact(value: String): Self = StObject.set(x, "resultCountExact", value.asInstanceOf[js.Any])
    
    inline def setResultCountExactUndefined: Self = StObject.set(x, "resultCountExact", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
