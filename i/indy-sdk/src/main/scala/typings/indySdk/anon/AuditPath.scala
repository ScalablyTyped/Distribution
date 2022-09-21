package typings.indySdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditPath extends StObject {
  
  var auditPath: js.Array[String]
  
  var reqSignature: Type
  
  var rootHash: String
  
  var txn: Dictkey
  
  var txnMetadata: SeqNo
  
  var ver: String
}
object AuditPath {
  
  inline def apply(
    auditPath: js.Array[String],
    reqSignature: Type,
    rootHash: String,
    txn: Dictkey,
    txnMetadata: SeqNo,
    ver: String
  ): AuditPath = {
    val __obj = js.Dynamic.literal(auditPath = auditPath.asInstanceOf[js.Any], reqSignature = reqSignature.asInstanceOf[js.Any], rootHash = rootHash.asInstanceOf[js.Any], txn = txn.asInstanceOf[js.Any], txnMetadata = txnMetadata.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditPath]
  }
  
  extension [Self <: AuditPath](x: Self) {
    
    inline def setAuditPath(value: js.Array[String]): Self = StObject.set(x, "auditPath", value.asInstanceOf[js.Any])
    
    inline def setAuditPathVarargs(value: String*): Self = StObject.set(x, "auditPath", js.Array(value*))
    
    inline def setReqSignature(value: Type): Self = StObject.set(x, "reqSignature", value.asInstanceOf[js.Any])
    
    inline def setRootHash(value: String): Self = StObject.set(x, "rootHash", value.asInstanceOf[js.Any])
    
    inline def setTxn(value: Dictkey): Self = StObject.set(x, "txn", value.asInstanceOf[js.Any])
    
    inline def setTxnMetadata(value: SeqNo): Self = StObject.set(x, "txnMetadata", value.asInstanceOf[js.Any])
    
    inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
  }
}
