package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to search for an unused range within allocated ranges.
  */
@js.native
trait SchemaSearchRangeRequest extends js.Object {
  
  /**
    * Required. The prefix length of the IP range. Use usual CIDR range
    * notation. For example, &#39;30&#39; to find unused x.x.x.x/30 CIDR range.
    * Actual range will be determined using allocated range for the consumer
    * peered network and returned in the result.
    */
  var ipPrefixLength: js.UndefOr[Double] = js.native
  
  /**
    * Network name in the consumer project.   This network must have been
    * already peered with a shared VPC network using CreateConnection method.
    * Must be in a form &#39;projects/{project}/global/networks/{network}&#39;.
    * {project} is a project number, as in &#39;12345&#39; {network} is network
    * name.
    */
  var network: js.UndefOr[String] = js.native
}
object SchemaSearchRangeRequest {
  
  @scala.inline
  def apply(): SchemaSearchRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaSearchRangeRequestOps[Self <: SchemaSearchRangeRequest] (val x: Self) extends AnyVal {
    
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
    def setIpPrefixLength(value: Double): Self = this.set("ipPrefixLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpPrefixLength: Self = this.set("ipPrefixLength", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
  }
}
