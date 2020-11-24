package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateOccurrencesRequest extends js.Object {
  
  /** Required. The occurrences to create. Max allowed length is 1000. */
  var occurrences: js.UndefOr[js.Array[Occurrence]] = js.native
}
object BatchCreateOccurrencesRequest {
  
  @scala.inline
  def apply(): BatchCreateOccurrencesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateOccurrencesRequest]
  }
  
  @scala.inline
  implicit class BatchCreateOccurrencesRequestOps[Self <: BatchCreateOccurrencesRequest] (val x: Self) extends AnyVal {
    
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
    def setOccurrencesVarargs(value: Occurrence*): Self = this.set("occurrences", js.Array(value :_*))
    
    @scala.inline
    def setOccurrences(value: js.Array[Occurrence]): Self = this.set("occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrences: Self = this.set("occurrences", js.undefined)
  }
}
