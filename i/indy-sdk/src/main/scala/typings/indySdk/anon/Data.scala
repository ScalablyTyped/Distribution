package typings.indySdk.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  // contains request specific data
  var data: Any
  
  var dest: String
  
  var identifier: String
  
  var reqId: Double
  
  var seqNo: Double
  
  var state_proof: Record[String, Any]
  
  var txnTime: Double
  
  var `type`: String
}
object Data {
  
  inline def apply(
    data: Any,
    dest: String,
    identifier: String,
    reqId: Double,
    seqNo: Double,
    state_proof: Record[String, Any],
    txnTime: Double,
    `type`: String
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any], seqNo = seqNo.asInstanceOf[js.Any], state_proof = state_proof.asInstanceOf[js.Any], txnTime = txnTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setReqId(value: Double): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
    
    inline def setSeqNo(value: Double): Self = StObject.set(x, "seqNo", value.asInstanceOf[js.Any])
    
    inline def setState_proof(value: Record[String, Any]): Self = StObject.set(x, "state_proof", value.asInstanceOf[js.Any])
    
    inline def setTxnTime(value: Double): Self = StObject.set(x, "txnTime", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
