package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultCounts extends js.Object {
  
  /** Result count information for each source with results. */
  var sourceResultCounts: js.UndefOr[js.Array[SourceResultCount]] = js.native
}
object ResultCounts {
  
  @scala.inline
  def apply(): ResultCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultCounts]
  }
  
  @scala.inline
  implicit class ResultCountsOps[Self <: ResultCounts] (val x: Self) extends AnyVal {
    
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
    def setSourceResultCountsVarargs(value: SourceResultCount*): Self = this.set("sourceResultCounts", js.Array(value :_*))
    
    @scala.inline
    def setSourceResultCounts(value: js.Array[SourceResultCount]): Self = this.set("sourceResultCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceResultCounts: Self = this.set("sourceResultCounts", js.undefined)
  }
}
