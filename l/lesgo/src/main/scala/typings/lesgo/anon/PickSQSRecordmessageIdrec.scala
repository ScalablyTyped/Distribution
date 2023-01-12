package typings.lesgo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<aws-lambda.aws-lambda.SQSRecord, 'messageId' | 'receiptHandle'> */
trait PickSQSRecordmessageIdrec extends StObject {
  
  var messageId: String
  
  var receiptHandle: String
}
object PickSQSRecordmessageIdrec {
  
  inline def apply(messageId: String, receiptHandle: String): PickSQSRecordmessageIdrec = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any], receiptHandle = receiptHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSQSRecordmessageIdrec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickSQSRecordmessageIdrec] (val x: Self) extends AnyVal {
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setReceiptHandle(value: String): Self = StObject.set(x, "receiptHandle", value.asInstanceOf[js.Any])
  }
}
