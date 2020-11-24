package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information for an interconnect attachment when this belongs to an
  * interconnect of type DEDICATED.
  */
@js.native
trait SchemaInterconnectAttachmentPrivateInfo extends js.Object {
  
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
  implicit class SchemaInterconnectAttachmentPrivateInfoOps[Self <: SchemaInterconnectAttachmentPrivateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTag8021q(value: Double): Self = this.set("tag8021q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag8021q: Self = this.set("tag8021q", js.undefined)
  }
}
