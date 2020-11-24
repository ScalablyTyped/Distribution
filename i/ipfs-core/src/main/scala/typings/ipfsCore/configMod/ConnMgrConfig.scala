package typings.ipfsCore.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnMgrConfig extends js.Object {
  
  /**
    * - The number of connections that, when
    * exceeded, will trigger a connection GC operation.
    *
    * {{LowWater?:number, HighWater?:number}} ConnMgr
    */
  var HighWater: js.UndefOr[Double] = js.native
  
  /**
    * - The minimum number of connections to
    * maintain.
    */
  var LowWater: js.UndefOr[Double] = js.native
}
object ConnMgrConfig {
  
  @scala.inline
  def apply(): ConnMgrConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnMgrConfig]
  }
  
  @scala.inline
  implicit class ConnMgrConfigOps[Self <: ConnMgrConfig] (val x: Self) extends AnyVal {
    
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
    def setHighWater(value: Double): Self = this.set("HighWater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighWater: Self = this.set("HighWater", js.undefined)
    
    @scala.inline
    def setLowWater(value: Double): Self = this.set("LowWater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowWater: Self = this.set("LowWater", js.undefined)
  }
}
