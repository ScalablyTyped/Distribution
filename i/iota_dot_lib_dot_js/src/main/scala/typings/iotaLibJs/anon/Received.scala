package typings.iotaLibJs.anon

import typings.iotaLibJs.mod.TransactionObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Received extends StObject {
  
  var received: js.Array[TransactionObject]
  
  var sent: js.Array[TransactionObject]
}
object Received {
  
  inline def apply(received: js.Array[TransactionObject], sent: js.Array[TransactionObject]): Received = {
    val __obj = js.Dynamic.literal(received = received.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Received]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Received] (val x: Self) extends AnyVal {
    
    inline def setReceived(value: js.Array[TransactionObject]): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
    
    inline def setReceivedVarargs(value: TransactionObject*): Self = StObject.set(x, "received", js.Array(value*))
    
    inline def setSent(value: js.Array[TransactionObject]): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setSentVarargs(value: TransactionObject*): Self = StObject.set(x, "sent", js.Array(value*))
  }
}
