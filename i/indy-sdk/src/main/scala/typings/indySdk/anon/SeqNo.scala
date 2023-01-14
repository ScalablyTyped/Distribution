package typings.indySdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeqNo extends StObject {
  
  var seqNo: Double
  
  var txnId: String
  
  var txnTime: Double
}
object SeqNo {
  
  inline def apply(seqNo: Double, txnId: String, txnTime: Double): SeqNo = {
    val __obj = js.Dynamic.literal(seqNo = seqNo.asInstanceOf[js.Any], txnId = txnId.asInstanceOf[js.Any], txnTime = txnTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeqNo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeqNo] (val x: Self) extends AnyVal {
    
    inline def setSeqNo(value: Double): Self = StObject.set(x, "seqNo", value.asInstanceOf[js.Any])
    
    inline def setTxnId(value: String): Self = StObject.set(x, "txnId", value.asInstanceOf[js.Any])
    
    inline def setTxnTime(value: Double): Self = StObject.set(x, "txnTime", value.asInstanceOf[js.Any])
  }
}
