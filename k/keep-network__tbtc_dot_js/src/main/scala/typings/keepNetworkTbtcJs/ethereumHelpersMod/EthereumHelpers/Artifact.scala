package typings.keepNetworkTbtcJs.ethereumHelpersMod.EthereumHelpers

import org.scalablytyped.runtime.StringDictionary
import typings.keepNetworkTbtcJs.anon.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Artifact extends js.Object {
  
  var abi: js.Any = js.native
  
  var contractName: String = js.native
  
  var networks: StringDictionary[Address] = js.native
}
object Artifact {
  
  @scala.inline
  def apply(abi: js.Any, contractName: String, networks: StringDictionary[Address]): Artifact = {
    val __obj = js.Dynamic.literal(abi = abi.asInstanceOf[js.Any], contractName = contractName.asInstanceOf[js.Any], networks = networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifact]
  }
  
  @scala.inline
  implicit class ArtifactOps[Self <: Artifact] (val x: Self) extends AnyVal {
    
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
    def setAbi(value: js.Any): Self = this.set("abi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContractName(value: String): Self = this.set("contractName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworks(value: StringDictionary[Address]): Self = this.set("networks", value.asInstanceOf[js.Any])
  }
}
