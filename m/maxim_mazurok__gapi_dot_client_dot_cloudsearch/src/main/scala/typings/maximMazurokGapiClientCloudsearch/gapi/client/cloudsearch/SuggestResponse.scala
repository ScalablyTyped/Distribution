package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestResponse extends js.Object {
  
  /** List of suggestions. */
  var suggestResults: js.UndefOr[js.Array[SuggestResult]] = js.native
}
object SuggestResponse {
  
  @scala.inline
  def apply(): SuggestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestResponse]
  }
  
  @scala.inline
  implicit class SuggestResponseOps[Self <: SuggestResponse] (val x: Self) extends AnyVal {
    
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
    def setSuggestResultsVarargs(value: SuggestResult*): Self = this.set("suggestResults", js.Array(value :_*))
    
    @scala.inline
    def setSuggestResults(value: js.Array[SuggestResult]): Self = this.set("suggestResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestResults: Self = this.set("suggestResults", js.undefined)
  }
}
