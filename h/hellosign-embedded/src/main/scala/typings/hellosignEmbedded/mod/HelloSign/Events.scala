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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends StObject {
  
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
  implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCANCEL(value: cancel): Self = StObject.set(x, "CANCEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLOSE(value: close): Self = StObject.set(x, "CLOSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCREATE_TEMPLATE(value: createTemplate): Self = StObject.set(x, "CREATE_TEMPLATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDECLINE(value: decline): Self = StObject.set(x, "DECLINE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFINISH(value: finish): Self = StObject.set(x, "FINISH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMESSAGE(value: message): Self = StObject.set(x, "MESSAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPEN(value: open): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREADY(value: ready): Self = StObject.set(x, "READY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREASSIGN(value: reassign): Self = StObject.set(x, "REASSIGN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSEND(value: send): Self = StObject.set(x, "SEND", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGN(value: sign): Self = StObject.set(x, "SIGN", value.asInstanceOf[js.Any])
  }
}
