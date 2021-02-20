package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Status of a NAT contained in this router. Next tag: 9
  */
@js.native
trait SchemaRouterStatusNatStatus extends StObject {
  
  /**
    * A list of IPs auto-allocated for NAT. Example: [&quot;1.1.1.1&quot;,
    * &quot;129.2.16.89&quot;]
    */
  var autoAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The number of extra IPs to allocate. This will be greater than 0 only if
    * user-specified IPs are NOT enough to allow all configured VMs to use NAT.
    * This value is meaningful only when auto-allocation of NAT IPs is *not*
    * used.
    */
  var minExtraNatIpsNeeded: js.UndefOr[Double] = js.native
  
  /**
    * Unique name of this NAT.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Number of VM endpoints (i.e., Nics) that can use NAT.
    */
  var numVmEndpointsWithNatMappings: js.UndefOr[Double] = js.native
  
  /**
    * A list of fully qualified URLs of reserved IP address resources.
    */
  var userAllocatedNatIpResources: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of IPs user-allocated for NAT. They will be raw IP strings like
    * &quot;179.12.26.133&quot;.
    */
  var userAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
}
object SchemaRouterStatusNatStatus {
  
  @scala.inline
  def apply(): SchemaRouterStatusNatStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatusNatStatus]
  }
  
  @scala.inline
  implicit class SchemaRouterStatusNatStatusMutableBuilder[Self <: SchemaRouterStatusNatStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoAllocatedNatIps(value: js.Array[String]): Self = StObject.set(x, "autoAllocatedNatIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAllocatedNatIpsUndefined: Self = StObject.set(x, "autoAllocatedNatIps", js.undefined)
    
    @scala.inline
    def setAutoAllocatedNatIpsVarargs(value: String*): Self = StObject.set(x, "autoAllocatedNatIps", js.Array(value :_*))
    
    @scala.inline
    def setMinExtraNatIpsNeeded(value: Double): Self = StObject.set(x, "minExtraNatIpsNeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinExtraNatIpsNeededUndefined: Self = StObject.set(x, "minExtraNatIpsNeeded", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumVmEndpointsWithNatMappings(value: Double): Self = StObject.set(x, "numVmEndpointsWithNatMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumVmEndpointsWithNatMappingsUndefined: Self = StObject.set(x, "numVmEndpointsWithNatMappings", js.undefined)
    
    @scala.inline
    def setUserAllocatedNatIpResources(value: js.Array[String]): Self = StObject.set(x, "userAllocatedNatIpResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAllocatedNatIpResourcesUndefined: Self = StObject.set(x, "userAllocatedNatIpResources", js.undefined)
    
    @scala.inline
    def setUserAllocatedNatIpResourcesVarargs(value: String*): Self = StObject.set(x, "userAllocatedNatIpResources", js.Array(value :_*))
    
    @scala.inline
    def setUserAllocatedNatIps(value: js.Array[String]): Self = StObject.set(x, "userAllocatedNatIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAllocatedNatIpsUndefined: Self = StObject.set(x, "userAllocatedNatIps", js.undefined)
    
    @scala.inline
    def setUserAllocatedNatIpsVarargs(value: String*): Self = StObject.set(x, "userAllocatedNatIps", js.Array(value :_*))
  }
}
