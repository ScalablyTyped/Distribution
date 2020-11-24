package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEventStatus extends js.Object {
  
  /** The original custom event that was inserted. */
  var customEvent: js.UndefOr[CustomEvent] = js.native
  
  /** A list of errors related to this custom event. */
  var errors: js.UndefOr[js.Array[CustomEventError]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventStatus". */
  var kind: js.UndefOr[String] = js.native
}
object CustomEventStatus {
  
  @scala.inline
  def apply(): CustomEventStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventStatus]
  }
  
  @scala.inline
  implicit class CustomEventStatusOps[Self <: CustomEventStatus] (val x: Self) extends AnyVal {
    
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
    def setCustomEvent(value: CustomEvent): Self = this.set("customEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEvent: Self = this.set("customEvent", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: CustomEventError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[CustomEventError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
