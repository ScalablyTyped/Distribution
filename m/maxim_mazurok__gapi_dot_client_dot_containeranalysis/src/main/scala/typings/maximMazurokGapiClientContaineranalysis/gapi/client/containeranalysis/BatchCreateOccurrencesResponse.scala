package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateOccurrencesResponse extends js.Object {
  
  /** The occurrences that were created. */
  var occurrences: js.UndefOr[js.Array[Occurrence]] = js.native
}
object BatchCreateOccurrencesResponse {
  
  @scala.inline
  def apply(): BatchCreateOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateOccurrencesResponse]
  }
  
  @scala.inline
  implicit class BatchCreateOccurrencesResponseOps[Self <: BatchCreateOccurrencesResponse] (val x: Self) extends AnyVal {
    
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
