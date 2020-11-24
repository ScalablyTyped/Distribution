package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialTimeout extends js.Object {
  
  var dialTimeout: Double = js.native
  
  var maxDialsPerPeer: Double = js.native
  
  var maxParallelDials: Double = js.native
}
object DialTimeout {
  
  @scala.inline
  def apply(dialTimeout: Double, maxDialsPerPeer: Double, maxParallelDials: Double): DialTimeout = {
    val __obj = js.Dynamic.literal(dialTimeout = dialTimeout.asInstanceOf[js.Any], maxDialsPerPeer = maxDialsPerPeer.asInstanceOf[js.Any], maxParallelDials = maxParallelDials.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialTimeout]
  }
  
  @scala.inline
  implicit class DialTimeoutOps[Self <: DialTimeout] (val x: Self) extends AnyVal {
    
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
    def setDialTimeout(value: Double): Self = this.set("dialTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDialsPerPeer(value: Double): Self = this.set("maxDialsPerPeer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxParallelDials(value: Double): Self = this.set("maxParallelDials", value.asInstanceOf[js.Any])
  }
}
