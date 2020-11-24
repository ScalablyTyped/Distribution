package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VM networking options.
  */
@js.native
trait SchemaNetwork extends js.Object {
  
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
  implicit class SchemaNetworkOps[Self <: SchemaNetwork] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = this.set("subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetwork: Self = this.set("subnetwork", js.undefined)
    
    @scala.inline
    def setUsePrivateAddress(value: Boolean): Self = this.set("usePrivateAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePrivateAddress: Self = this.set("usePrivateAddress", js.undefined)
  }
}
