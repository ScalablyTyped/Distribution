package typings.matrixJsSdk.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickleKey extends js.Object {
  
  var pickleKey: String = js.native
  
  var pickledAccount: String = js.native
  
  var sessions: js.Array[Record[String, _]] = js.native
}
object PickleKey {
  
  @scala.inline
  def apply(pickleKey: String, pickledAccount: String, sessions: js.Array[Record[String, _]]): PickleKey = {
    val __obj = js.Dynamic.literal(pickleKey = pickleKey.asInstanceOf[js.Any], pickledAccount = pickledAccount.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickleKey]
  }
  
  @scala.inline
  implicit class PickleKeyOps[Self <: PickleKey] (val x: Self) extends AnyVal {
    
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
    def setPickleKey(value: String): Self = this.set("pickleKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickledAccount(value: String): Self = this.set("pickledAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionsVarargs(value: (Record[String, js.Any])*): Self = this.set("sessions", js.Array(value :_*))
    
    @scala.inline
    def setSessions(value: js.Array[Record[String, _]]): Self = this.set("sessions", value.asInstanceOf[js.Any])
  }
}
