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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var CANCEL: cancel
  
  var CLOSE: close
  
  var CREATE_TEMPLATE: createTemplate
  
  var DECLINE: decline
  
  var ERROR: error
  
  var FINISH: finish
  
  var MESSAGE: message
  
  var OPEN: open
  
  var READY: ready
  
  var REASSIGN: reassign
  
  var SEND: send
  
  var SIGN: sign
}
object Events {
  
  @scala.inline
  def apply(): Events = {
    val __obj = js.Dynamic.literal(CANCEL = "cancel", CLOSE = "close", CREATE_TEMPLATE = "createTemplate", DECLINE = "decline", ERROR = "error", FINISH = "finish", MESSAGE = "message", OPEN = "open", READY = "ready", REASSIGN = "reassign", SEND = "send", SIGN = "sign")
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
