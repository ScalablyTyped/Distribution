package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VM networking options.
  */
@js.native
trait SchemaNetwork extends StObject {
  
  /**
    * The network name to attach the VM&#39;s network interface to. The value
    * will be prefixed with `global/networks/` unless it contains a `/`, in
    * which case it is assumed to be a fully specified network resource URL. If
    * unspecified, the global default network is used.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If the specified network is configured for custom subnet creation, the
    * name of the subnetwork to attach the instance to must be specified here.
    * The value is prefixed with `regions/x/subnetworks/` unless it contains a
    * `/`, in which case it is assumed to be a fully specified subnetwork
    * resource URL.  If the `*` character appears in the value, it is replaced
    * with the region that the virtual machine has been allocated in.
    */
  var subnetwork: js.UndefOr[String] = js.native
  
  /**
    * If set to true, do not attach a public IP address to the VM. Note that
    * without a public IP address, additional configuration is required to
    * allow the VM to access Google services.  See
    * https://cloud.google.com/vpc/docs/configure-private-google-access for
    * more information.
    */
  var usePrivateAddress: js.UndefOr[Boolean] = js.native
}
object SchemaNetwork {
  
  @scala.inline
  def apply(): SchemaNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetwork]
  }
  
  @scala.inline
  implicit class SchemaNetworkMutableBuilder[Self <: SchemaNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    @scala.inline
    def setUsePrivateAddress(value: Boolean): Self = StObject.set(x, "usePrivateAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePrivateAddressUndefined: Self = StObject.set(x, "usePrivateAddress", js.undefined)
  }
}
