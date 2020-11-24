package typings.ipfsCore.dhtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryEvent extends js.Object {
  
  var extra: String = js.native
  
  var id: typings.peerId.mod.^ = js.native
  
  var responses: js.Array[PeerInfo] = js.native
  
  var `type`: Double = js.native
}
object QueryEvent {
  
  @scala.inline
  def apply(extra: String, id: typings.peerId.mod.^, responses: js.Array[PeerInfo], `type`: Double): QueryEvent = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryEvent]
  }
  
  @scala.inline
  implicit class QueryEventOps[Self <: QueryEvent] (val x: Self) extends AnyVal {
    
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
    def setExtra(value: String): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: typings.peerId.mod.^): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesVarargs(value: PeerInfo*): Self = this.set("responses", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: js.Array[PeerInfo]): Self = this.set("responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
