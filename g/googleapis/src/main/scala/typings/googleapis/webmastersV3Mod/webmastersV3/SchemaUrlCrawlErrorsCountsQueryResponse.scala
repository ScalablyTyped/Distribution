package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A time series of the number of URL crawl errors per error category and
  * platform.
  */
@js.native
trait SchemaUrlCrawlErrorsCountsQueryResponse extends js.Object {
  
  /**
    * The time series of the number of URL crawl errors per error category and
    * platform.
    */
  var countPerTypes: js.UndefOr[js.Array[SchemaUrlCrawlErrorCountsPerType]] = js.native
}
object SchemaUrlCrawlErrorsCountsQueryResponse {
  
  @scala.inline
  def apply(): SchemaUrlCrawlErrorsCountsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorsCountsQueryResponse]
  }
  
  @scala.inline
  implicit class SchemaUrlCrawlErrorsCountsQueryResponseOps[Self <: SchemaUrlCrawlErrorsCountsQueryResponse] (val x: Self) extends AnyVal {
    
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
    def setCountPerTypesVarargs(value: SchemaUrlCrawlErrorCountsPerType*): Self = this.set("countPerTypes", js.Array(value :_*))
    
    @scala.inline
    def setCountPerTypes(value: js.Array[SchemaUrlCrawlErrorCountsPerType]): Self = this.set("countPerTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountPerTypes: Self = this.set("countPerTypes", js.undefined)
  }
}
