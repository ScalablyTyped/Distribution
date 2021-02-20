package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information for an interconnect attachment when this belongs to an
  * interconnect of type DEDICATED.
  */
@js.native
trait SchemaInterconnectAttachmentPrivateInfo extends StObject {
  
  /**
    * [Output Only] 802.1q encapsulation tag to be used for traffic between
    * Google and the customer, going to and from this network and region.
    */
  var tag8021q: js.UndefOr[Double] = js.native
}
object SchemaInterconnectAttachmentPrivateInfo {
  
  @scala.inline
  def apply(): SchemaInterconnectAttachmentPrivateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachmentPrivateInfo]
  }
  
  @scala.inline
  implicit class SchemaInterconnectAttachmentPrivateInfoMutableBuilder[Self <: SchemaInterconnectAttachmentPrivateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag8021q(value: Double): Self = StObject.set(x, "tag8021q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag8021qUndefined: Self = StObject.set(x, "tag8021q", js.undefined)
  }
}
