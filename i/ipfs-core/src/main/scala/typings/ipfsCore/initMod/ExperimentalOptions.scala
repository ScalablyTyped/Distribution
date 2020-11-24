package typings.ipfsCore.initMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExperimentalOptions extends js.Object {
  
  /**
    * - Enable pub-sub on IPNS. (Default: `false`)
    */
  var ipnsPubsub: js.UndefOr[Boolean] = js.native
  
  /**
    * - Enable directory sharding. Directories that have many child objects will be represented by multiple DAG nodes instead of just one. It can improve lookup performance when a directory has several thousand files or more. (Default: `false`)
    */
  var sharding: js.UndefOr[Boolean] = js.native
}
object ExperimentalOptions {
  
  @scala.inline
  def apply(): ExperimentalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentalOptions]
  }
  
  @scala.inline
  implicit class ExperimentalOptionsOps[Self <: ExperimentalOptions] (val x: Self) extends AnyVal {
    
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
    def setIpnsPubsub(value: Boolean): Self = this.set("ipnsPubsub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpnsPubsub: Self = this.set("ipnsPubsub", js.undefined)
    
    @scala.inline
    def setSharding(value: Boolean): Self = this.set("sharding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharding: Self = this.set("sharding", js.undefined)
  }
}
