package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Number of errors per day for a specific error type (defined by platform and
  * category).
  */
@js.native
trait SchemaUrlCrawlErrorCountsPerType extends js.Object {
  
  /**
    * The crawl error type.
    */
  var category: js.UndefOr[String] = js.native
  
  /**
    * The error count entries time series.
    */
  var entries: js.UndefOr[js.Array[SchemaUrlCrawlErrorCount]] = js.native
  
  /**
    * The general type of Googlebot that made the request (see list of
    * Googlebot user-agents for the user-agents used).
    */
  var platform: js.UndefOr[String] = js.native
}
object SchemaUrlCrawlErrorCountsPerType {
  
  @scala.inline
  def apply(): SchemaUrlCrawlErrorCountsPerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorCountsPerType]
  }
  
  @scala.inline
  implicit class SchemaUrlCrawlErrorCountsPerTypeOps[Self <: SchemaUrlCrawlErrorCountsPerType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaUrlCrawlErrorCount*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[SchemaUrlCrawlErrorCount]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
  }
}
