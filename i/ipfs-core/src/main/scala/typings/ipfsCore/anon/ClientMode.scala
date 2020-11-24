package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientMode extends js.Object {
  
  var clientMode: Boolean = js.native
  
  var enabled: Boolean = js.native
  
  var kBucketSize: Double = js.native
  
  var randomWalk: Enabled = js.native
  
  var selectors: `5` = js.native
  
  var validators: IpnsFunc = js.native
}
object ClientMode {
  
  @scala.inline
  def apply(
    clientMode: Boolean,
    enabled: Boolean,
    kBucketSize: Double,
    randomWalk: Enabled,
    selectors: `5`,
    validators: IpnsFunc
  ): ClientMode = {
    val __obj = js.Dynamic.literal(clientMode = clientMode.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], kBucketSize = kBucketSize.asInstanceOf[js.Any], randomWalk = randomWalk.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMode]
  }
  
  @scala.inline
  implicit class ClientModeOps[Self <: ClientMode] (val x: Self) extends AnyVal {
    
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
    def setClientMode(value: Boolean): Self = this.set("clientMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKBucketSize(value: Double): Self = this.set("kBucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomWalk(value: Enabled): Self = this.set("randomWalk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectors(value: `5`): Self = this.set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidators(value: IpnsFunc): Self = this.set("validators", value.asInstanceOf[js.Any])
  }
}
