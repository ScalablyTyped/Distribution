package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Number of errors per day for a specific error type (defined by platform and
  * category).
  */
trait SchemaUrlCrawlErrorCountsPerType extends StObject {
  
  /**
    * The crawl error type.
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * The error count entries time series.
    */
  var entries: js.UndefOr[js.Array[SchemaUrlCrawlErrorCount]] = js.undefined
  
  /**
    * The general type of Googlebot that made the request (see list of
    * Googlebot user-agents for the user-agents used).
    */
  var platform: js.UndefOr[String] = js.undefined
}
object SchemaUrlCrawlErrorCountsPerType {
  
  @scala.inline
  def apply(): SchemaUrlCrawlErrorCountsPerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorCountsPerType]
  }
  
  @scala.inline
  implicit class SchemaUrlCrawlErrorCountsPerTypeMutableBuilder[Self <: SchemaUrlCrawlErrorCountsPerType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setEntries(value: js.Array[SchemaUrlCrawlErrorCount]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaUrlCrawlErrorCount*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
