package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterconnectAttachmentPrivateInfo extends StObject {
  
  /** [Output Only] 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region. */
  var tag8021q: js.UndefOr[Double] = js.undefined
}
object InterconnectAttachmentPrivateInfo {
  
  @scala.inline
  def apply(): InterconnectAttachmentPrivateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectAttachmentPrivateInfo]
  }
  
  @scala.inline
  implicit class InterconnectAttachmentPrivateInfoMutableBuilder[Self <: InterconnectAttachmentPrivateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag8021q(value: Double): Self = StObject.set(x, "tag8021q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag8021qUndefined: Self = StObject.set(x, "tag8021q", js.undefined)
  }
}
