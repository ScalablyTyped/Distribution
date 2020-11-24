package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEventsBatchInsertRequest extends js.Object {
  
  /** The set of custom events to insert. */
  var customEvents: js.UndefOr[js.Array[CustomEvent]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventsBatchInsertRequest". */
  var kind: js.UndefOr[String] = js.native
}
object CustomEventsBatchInsertRequest {
  
  @scala.inline
  def apply(): CustomEventsBatchInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventsBatchInsertRequest]
  }
  
  @scala.inline
  implicit class CustomEventsBatchInsertRequestOps[Self <: CustomEventsBatchInsertRequest] (val x: Self) extends AnyVal {
    
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
    def setCustomEventsVarargs(value: CustomEvent*): Self = this.set("customEvents", js.Array(value :_*))
    
    @scala.inline
    def setCustomEvents(value: js.Array[CustomEvent]): Self = this.set("customEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEvents: Self = this.set("customEvents", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
