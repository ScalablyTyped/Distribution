package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.hellosignEmbeddedStrings.cancel
import typings.hellosignEmbedded.hellosignEmbeddedStrings.close
import typings.hellosignEmbedded.hellosignEmbeddedStrings.createTemplate
import typings.hellosignEmbedded.hellosignEmbeddedStrings.decline
import typings.hellosignEmbedded.hellosignEmbeddedStrings.error
import typings.hellosignEmbedded.hellosignEmbeddedStrings.finish
import typings.hellosignEmbedded.hellosignEmbeddedStrings.message
import typings.hellosignEmbedded.hellosignEmbeddedStrings.open
import typings.hellosignEmbedded.hellosignEmbeddedStrings.ready
import typings.hellosignEmbedded.hellosignEmbeddedStrings.reassign
import typings.hellosignEmbedded.hellosignEmbeddedStrings.send
import typings.hellosignEmbedded.hellosignEmbeddedStrings.sign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends js.Object {
  
  var CANCEL: cancel = js.native
  
  var CLOSE: close = js.native
  
  var CREATE_TEMPLATE: createTemplate = js.native
  
  var DECLINE: decline = js.native
  
  var ERROR: error = js.native
  
  var FINISH: finish = js.native
  
  var MESSAGE: message = js.native
  
  var OPEN: open = js.native
  
  var READY: ready = js.native
  
  var REASSIGN: reassign = js.native
  
  var SEND: send = js.native
  
  var SIGN: sign = js.native
}
object Events {
  
  @scala.inline
  def apply(
    CANCEL: cancel,
    CLOSE: close,
    CREATE_TEMPLATE: createTemplate,
    DECLINE: decline,
    ERROR: error,
    FINISH: finish,
    MESSAGE: message,
    OPEN: open,
    READY: ready,
    REASSIGN: reassign,
    SEND: send,
    SIGN: sign
  ): Events = {
    val __obj = js.Dynamic.literal(CANCEL = CANCEL.asInstanceOf[js.Any], CLOSE = CLOSE.asInstanceOf[js.Any], CREATE_TEMPLATE = CREATE_TEMPLATE.asInstanceOf[js.Any], DECLINE = DECLINE.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FINISH = FINISH.asInstanceOf[js.Any], MESSAGE = MESSAGE.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], REASSIGN = REASSIGN.asInstanceOf[js.Any], SEND = SEND.asInstanceOf[js.Any], SIGN = SIGN.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    
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
    def setCANCEL(value: cancel): Self = this.set("CANCEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLOSE(value: close): Self = this.set("CLOSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCREATE_TEMPLATE(value: createTemplate): Self = this.set("CREATE_TEMPLATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDECLINE(value: decline): Self = this.set("DECLINE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: error): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFINISH(value: finish): Self = this.set("FINISH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMESSAGE(value: message): Self = this.set("MESSAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPEN(value: open): Self = this.set("OPEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREADY(value: ready): Self = this.set("READY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREASSIGN(value: reassign): Self = this.set("REASSIGN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSEND(value: send): Self = this.set("SEND", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGN(value: sign): Self = this.set("SIGN", value.asInstanceOf[js.Any])
  }
}
