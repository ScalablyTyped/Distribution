package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of the suggest API.
  */
@js.native
trait SchemaSuggestResponse extends js.Object {
  
  /**
    * List of suggestion results.
    */
  var suggestResults: js.UndefOr[js.Array[SchemaSuggestResult]] = js.native
}
object SchemaSuggestResponse {
  
  @scala.inline
  def apply(): SchemaSuggestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestResponse]
  }
  
  @scala.inline
  implicit class SchemaSuggestResponseOps[Self <: SchemaSuggestResponse] (val x: Self) extends AnyVal {
    
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
    def setSuggestResultsVarargs(value: SchemaSuggestResult*): Self = this.set("suggestResults", js.Array(value :_*))
    
    @scala.inline
    def setSuggestResults(value: js.Array[SchemaSuggestResult]): Self = this.set("suggestResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestResults: Self = this.set("suggestResults", js.undefined)
  }
}
