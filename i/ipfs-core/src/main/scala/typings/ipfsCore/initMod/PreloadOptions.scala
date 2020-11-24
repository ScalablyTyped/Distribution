package typings.ipfsCore.initMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreloadOptions extends js.Object {
  
  /**
    * - Multiaddr API addresses of nodes that should preload content.
    * **NOTE:** nodes specified here should also be added to your node's bootstrap address list at `config.Boostrap`.
    */
  var addresses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * - Enable content preloading (Default: `true`)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[Double] = js.native
}
object PreloadOptions {
  
  @scala.inline
  def apply(): PreloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreloadOptions]
  }
  
  @scala.inline
  implicit class PreloadOptionsOps[Self <: PreloadOptions] (val x: Self) extends AnyVal {
    
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
    def setAddressesVarargs(value: String*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
  }
}
