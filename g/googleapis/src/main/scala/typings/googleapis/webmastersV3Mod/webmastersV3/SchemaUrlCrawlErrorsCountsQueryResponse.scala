package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A time series of the number of URL crawl errors per error category and
  * platform.
  */
trait SchemaUrlCrawlErrorsCountsQueryResponse extends StObject {
  
  /**
    * The time series of the number of URL crawl errors per error category and
    * platform.
    */
  var countPerTypes: js.UndefOr[js.Array[SchemaUrlCrawlErrorCountsPerType]] = js.undefined
}
object SchemaUrlCrawlErrorsCountsQueryResponse {
  
  inline def apply(): SchemaUrlCrawlErrorsCountsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorsCountsQueryResponse]
  }
  
  extension [Self <: SchemaUrlCrawlErrorsCountsQueryResponse](x: Self) {
    
    inline def setCountPerTypes(value: js.Array[SchemaUrlCrawlErrorCountsPerType]): Self = StObject.set(x, "countPerTypes", value.asInstanceOf[js.Any])
    
    inline def setCountPerTypesUndefined: Self = StObject.set(x, "countPerTypes", js.undefined)
    
    inline def setCountPerTypesVarargs(value: SchemaUrlCrawlErrorCountsPerType*): Self = StObject.set(x, "countPerTypes", js.Array(value :_*))
  }
}
