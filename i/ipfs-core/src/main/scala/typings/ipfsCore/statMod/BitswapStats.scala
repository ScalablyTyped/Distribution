package typings.ipfsCore.statMod

import typings.bignumberJs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitswapStats extends js.Object {
  
  var blocksReceived: default = js.native
  
  var blocksSent: default = js.native
  
  var dataReceived: default = js.native
  
  var dataSent: default = js.native
  
  var dupBlksReceived: default = js.native
  
  var dupDataReceived: default = js.native
  
  /**
    * - array of peer IDs as Strings
    */
  var peers: js.Array[String] = js.native
  
  /**
    * - an integer
    */
  var provideBufLen: Double = js.native
  
  var wantlist: js.Array[CID] = js.native
}
object BitswapStats {
  
  @scala.inline
  def apply(
    blocksReceived: default,
    blocksSent: default,
    dataReceived: default,
    dataSent: default,
    dupBlksReceived: default,
    dupDataReceived: default,
    peers: js.Array[String],
    provideBufLen: Double,
    wantlist: js.Array[CID]
  ): BitswapStats = {
    val __obj = js.Dynamic.literal(blocksReceived = blocksReceived.asInstanceOf[js.Any], blocksSent = blocksSent.asInstanceOf[js.Any], dataReceived = dataReceived.asInstanceOf[js.Any], dataSent = dataSent.asInstanceOf[js.Any], dupBlksReceived = dupBlksReceived.asInstanceOf[js.Any], dupDataReceived = dupDataReceived.asInstanceOf[js.Any], peers = peers.asInstanceOf[js.Any], provideBufLen = provideBufLen.asInstanceOf[js.Any], wantlist = wantlist.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitswapStats]
  }
  
  @scala.inline
  implicit class BitswapStatsOps[Self <: BitswapStats] (val x: Self) extends AnyVal {
    
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
    def setBlocksReceived(value: default): Self = this.set("blocksReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksSent(value: default): Self = this.set("blocksSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataReceived(value: default): Self = this.set("dataReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSent(value: default): Self = this.set("dataSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDupBlksReceived(value: default): Self = this.set("dupBlksReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDupDataReceived(value: default): Self = this.set("dupDataReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeersVarargs(value: String*): Self = this.set("peers", js.Array(value :_*))
    
    @scala.inline
    def setPeers(value: js.Array[String]): Self = this.set("peers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideBufLen(value: Double): Self = this.set("provideBufLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantlistVarargs(value: CID*): Self = this.set("wantlist", js.Array(value :_*))
    
    @scala.inline
    def setWantlist(value: js.Array[CID]): Self = this.set("wantlist", value.asInstanceOf[js.Any])
  }
}
