package typings.libp2pInterfacePubsub.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishResult extends StObject {
  
  var recipients: js.Array[PeerId]
}
object PublishResult {
  
  inline def apply(recipients: js.Array[PeerId]): PublishResult = {
    val __obj = js.Dynamic.literal(recipients = recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishResult] (val x: Self) extends AnyVal {
    
    inline def setRecipients(value: js.Array[PeerId]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsVarargs(value: PeerId*): Self = StObject.set(x, "recipients", js.Array(value*))
  }
}
