package typings.imapflow.mod

import typings.node.bufferMod.global.Buffer
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchMessageObject extends StObject {
  
  var bodyParts: Map[String, Buffer]
  
  var bodyStructure: MessageStructureObject
  
  var emailId: String
  
  var envelope: MessageEnvelopeObject
  
  var flags: Set[String]
  
  var headers: Buffer
  
  var internalDate: js.Date
  
  var labels: Set[String]
  
  var modseq: js.BigInt
  
  var seq: Double
  
  var size: Double
  
  var source: Buffer
  
  var threadId: String
  
  var uid: Double
}
object FetchMessageObject {
  
  inline def apply(
    bodyParts: Map[String, Buffer],
    bodyStructure: MessageStructureObject,
    emailId: String,
    envelope: MessageEnvelopeObject,
    flags: Set[String],
    headers: Buffer,
    internalDate: js.Date,
    labels: Set[String],
    modseq: js.BigInt,
    seq: Double,
    size: Double,
    source: Buffer,
    threadId: String,
    uid: Double
  ): FetchMessageObject = {
    val __obj = js.Dynamic.literal(bodyParts = bodyParts.asInstanceOf[js.Any], bodyStructure = bodyStructure.asInstanceOf[js.Any], emailId = emailId.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], internalDate = internalDate.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], modseq = modseq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMessageObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchMessageObject] (val x: Self) extends AnyVal {
    
    inline def setBodyParts(value: Map[String, Buffer]): Self = StObject.set(x, "bodyParts", value.asInstanceOf[js.Any])
    
    inline def setBodyStructure(value: MessageStructureObject): Self = StObject.set(x, "bodyStructure", value.asInstanceOf[js.Any])
    
    inline def setEmailId(value: String): Self = StObject.set(x, "emailId", value.asInstanceOf[js.Any])
    
    inline def setEnvelope(value: MessageEnvelopeObject): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Set[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Buffer): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setInternalDate(value: js.Date): Self = StObject.set(x, "internalDate", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: Set[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setModseq(value: js.BigInt): Self = StObject.set(x, "modseq", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setThreadId(value: String): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
