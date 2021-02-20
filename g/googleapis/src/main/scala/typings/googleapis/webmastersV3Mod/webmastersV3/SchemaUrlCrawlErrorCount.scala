package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An entry in a URL crawl errors time series.
  */
@js.native
trait SchemaUrlCrawlErrorCount extends StObject {
  
  /**
    * The error count at the given timestamp.
    */
  var count: js.UndefOr[String] = js.native
  
  /**
    * The date and time when the crawl attempt took place, in RFC 3339 format.
    */
  var timestamp: js.UndefOr[String] = js.native
}
object SchemaUrlCrawlErrorCount {
  
  @scala.inline
  def apply(): SchemaUrlCrawlErrorCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorCount]
  }
  
  @scala.inline
  implicit class SchemaUrlCrawlErrorCountMutableBuilder[Self <: SchemaUrlCrawlErrorCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
