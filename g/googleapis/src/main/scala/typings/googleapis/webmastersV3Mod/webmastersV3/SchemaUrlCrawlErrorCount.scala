package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An entry in a URL crawl errors time series.
  */
trait SchemaUrlCrawlErrorCount extends StObject {
  
  /**
    * The error count at the given timestamp.
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the crawl attempt took place, in RFC 3339 format.
    */
  var timestamp: js.UndefOr[String] = js.undefined
}
object SchemaUrlCrawlErrorCount {
  
  inline def apply(): SchemaUrlCrawlErrorCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorCount]
  }
  
  extension [Self <: SchemaUrlCrawlErrorCount](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
