package typings.grpcGrpcJs.callStreamMod

import typings.grpcGrpcJs.callCredentialsMod.CallCredentials
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def cancelWithStatus(status: Status, details: String): Unit = js.native
  
  def getCredentials(): CallCredentials = js.native
  
  def getDeadline(): Deadline = js.native
  
  def getHost(): String = js.native
  
  def getMethod(): String = js.native
  
  def getPeer(): String = js.native
  
  def halfClose(): Unit = js.native
  
  def sendMessageWithContext(context: MessageContext, message: Buffer): Unit = js.native
  
  def setCredentials(credentials: CallCredentials): Unit = js.native
  
  def start(metadata: Metadata, listener: InterceptingListener): Unit = js.native
  
  def startRead(): Unit = js.native
}
object Call {
  
  @scala.inline
  def apply(
    cancelWithStatus: (Status, String) => Unit,
    getCredentials: () => CallCredentials,
    getDeadline: () => Deadline,
    getHost: () => String,
    getMethod: () => String,
    getPeer: () => String,
    halfClose: () => Unit,
    sendMessageWithContext: (MessageContext, Buffer) => Unit,
    setCredentials: CallCredentials => Unit,
    start: (Metadata, InterceptingListener) => Unit,
    startRead: () => Unit
  ): Call = {
    val __obj = js.Dynamic.literal(cancelWithStatus = js.Any.fromFunction2(cancelWithStatus), getCredentials = js.Any.fromFunction0(getCredentials), getDeadline = js.Any.fromFunction0(getDeadline), getHost = js.Any.fromFunction0(getHost), getMethod = js.Any.fromFunction0(getMethod), getPeer = js.Any.fromFunction0(getPeer), halfClose = js.Any.fromFunction0(halfClose), sendMessageWithContext = js.Any.fromFunction2(sendMessageWithContext), setCredentials = js.Any.fromFunction1(setCredentials), start = js.Any.fromFunction2(start), startRead = js.Any.fromFunction0(startRead))
    __obj.asInstanceOf[Call]
  }
  
  @scala.inline
  implicit class CallOps[Self <: Call] (val x: Self) extends AnyVal {
    
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
    def setCancelWithStatus(value: (Status, String) => Unit): Self = this.set("cancelWithStatus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCredentials(value: () => CallCredentials): Self = this.set("getCredentials", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDeadline(value: () => Deadline): Self = this.set("getDeadline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHost(value: () => String): Self = this.set("getHost", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMethod(value: () => String): Self = this.set("getMethod", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPeer(value: () => String): Self = this.set("getPeer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHalfClose(value: () => Unit): Self = this.set("halfClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSendMessageWithContext(value: (MessageContext, Buffer) => Unit): Self = this.set("sendMessageWithContext", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetCredentials(value: CallCredentials => Unit): Self = this.set("setCredentials", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: (Metadata, InterceptingListener) => Unit): Self = this.set("start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartRead(value: () => Unit): Self = this.set("startRead", js.Any.fromFunction0(value))
  }
}
