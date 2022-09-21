package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.DeviceId
import typings.matrixJsSdk.anon.Ed25519
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "MatrixEvent")
@js.native
open class MatrixEvent[IEventContentType, EventTypeName] protected () extends StObject {
  //  True if this event is 'forward looking', meaning that getDirectionalContent() will return event.content and not event.prev_content.
  def this(event: RawEvent[IEventContentType, EventTypeName]) = this()
  
  def attemptDecryption(crypto: CryptoModule, isRetry: Boolean): js.Promise[Unit] = js.native
  
  def cancelAndResendKeyRequest(crypto: CryptoModule, userId: String): js.Promise[Unit] = js.native
  
  //  The sending status of the event.
  var error: js.Error = js.native
  
  //  The raw (possibly encrypted) event. Do not access this property directly unless you absolutely have to. Prefer the getter methods defined
  var event: RawEvent[IEventContentType, EventTypeName] = js.native
  
  def flagCancelled(): Unit = js.native
  def flagCancelled(cancelled: Boolean): Unit = js.native
  
  //  most recent error associated with sending the event, if any
  var forwardLooking: Boolean = js.native
  
  def getAge(): Double = js.native
  
  def getAssociatedId(): js.UndefOr[String] = js.native
  
  def getAssociatedStatus(): EventStatus = js.native
  
  def getClaimedEd25519Key(): String = js.native
  
  def getClearContent(): IEventContentType = js.native
  
  def getContent(): IEventContentType = js.native
  
  def getDate(): js.Date = js.native
  
  def getDirectionalContent(): js.Object = js.native
  
  def getForwardingCurve25519KeyChain(): js.Array[String] = js.native
  
  def getId(): String = js.native
  
  def getKeyRequestRecipients(userId: String): js.Array[DeviceId] = js.native
  
  def getKeysClaimed(): Ed25519 = js.native
  
  def getLocalAge(): Double = js.native
  
  def getOriginalContent(): IEventContentType = js.native
  
  def getPrevContent(): js.Object = js.native
  
  def getPushActions(): js.Array[PushAction] = js.native
  
  def getRelation(): IEventContentType | Null = js.native
  
  def getRoomId(): String = js.native
  
  def getSender(): String = js.native
  
  def getSenderKey(): String = js.native
  
  def getServerAggregatedRelation(relType: String): js.Array[Any] = js.native
  
  def getStateKey(): String = js.native
  
  def getTs(): Double = js.native
  
  def getTxnId(): String = js.native
  
  def getType(): EventTypeName = js.native
  
  def getUnsigned(): Any = js.native
  
  def getWireContent(): IEventContentType = js.native
  
  def getWireType(): String = js.native
  
  def handleRemoteEcho(event: MatrixEvent[EventContentTypeMessage, EventType]): Unit = js.native
  
  def hasAssocation(): Boolean = js.native
  
  def isBeingDecrypted(): Boolean = js.native
  
  def isCancelled(): Boolean = js.native
  
  def isDecryptionFailure(): Boolean = js.native
  
  def isEncrypted(): Boolean = js.native
  
  def isKeySourceUntrusted(): Boolean = js.native
  
  def isRedacted(): Boolean = js.native
  
  def isRedaction(): Boolean = js.native
  
  def isRelation(): Boolean = js.native
  def isRelation(relType: String): Boolean = js.native
  
  def isSending(): Boolean = js.native
  
  def isState(): Boolean = js.native
  
  def localRedactionEvent(): MatrixEvent[EventContentTypeMessage, EventType] = js.native
  
  def makeEncrypted(
    crypto_type: String,
    crypto_content: js.Object,
    senderCurve25519Key: String,
    claimedEd25519Key: String
  ): Unit = js.native
  
  def makeRedacted(redaction_event: MatrixEvent[EventContentTypeMessage, EventType]): Unit = js.native
  
  def makeReplaced(): Unit = js.native
  def makeReplaced(newEvent: MatrixEvent[EventContentTypeMessage, EventType]): Unit = js.native
  
  def markLocallyRedacted(redactionEvent: MatrixEvent[EventContentTypeMessage, EventType]): Unit = js.native
  
  def replaceLocalEventId(eventId: String): Unit = js.native
  
  def replacingEvent(): js.UndefOr[String] = js.native
  
  def replacingEventDate(): js.UndefOr[js.Date] = js.native
  
  def replacingEventId(): js.UndefOr[String] = js.native
  
  var sender: RoomMember = js.native
  
  def setPushActions(pushActions: js.Array[PushAction]): Unit = js.native
  
  def setStatus(status: EventStatus): Unit = js.native
  
  def setTxnId(txnId: String): Unit = js.native
  
  def setVerificationRequest(request: Any): Unit = js.native
  
  //  The room member who is the target of this event, e.g. the invitee, the person being banned, etc.
  var status: EventStatus = js.native
  
  //  The room member who sent this event, or null e.g. this is a presence event. This is only guaranteed to be set for events that appear in
  var target: RoomMember = js.native
  
  def toJSON(): Any = js.native
  
  def unmarkLocallyRedacted(): Boolean = js.native
  
  def updateAssociatedId(eventId: String): Unit = js.native
}
