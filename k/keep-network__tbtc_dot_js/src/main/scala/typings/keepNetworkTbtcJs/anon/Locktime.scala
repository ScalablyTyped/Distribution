package typings.keepNetworkTbtcJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locktime extends js.Object {
  
  var locktime: js.Any = js.native
  
  var txInVector: js.Any = js.native
  
  var txOutVector: js.Any = js.native
  
  var version: js.Any = js.native
}
object Locktime {
  
  @scala.inline
  def apply(locktime: js.Any, txInVector: js.Any, txOutVector: js.Any, version: js.Any): Locktime = {
    val __obj = js.Dynamic.literal(locktime = locktime.asInstanceOf[js.Any], txInVector = txInVector.asInstanceOf[js.Any], txOutVector = txOutVector.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locktime]
  }
  
  @scala.inline
  implicit class LocktimeOps[Self <: Locktime] (val x: Self) extends AnyVal {
    
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
    def setLocktime(value: js.Any): Self = this.set("locktime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxInVector(value: js.Any): Self = this.set("txInVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxOutVector(value: js.Any): Self = this.set("txOutVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: js.Any): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
