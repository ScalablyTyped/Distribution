package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.FnCall
import typings.ipfsCore.anon.FnCallHasIpldPinGcLockPreload
import typings.ipfsCore.anon.FnCallHasRepo
import typings.ipfsCore.anon.FnCallHasRmAll
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block_ extends js.Object {
  
  var get: ReturnType[FnCall] = js.native
  
  var put: ReturnType[FnCallHasIpldPinGcLockPreload] = js.native
  
  var rm: ReturnType[FnCallHasRmAll] = js.native
  
  var stat: ReturnType[FnCallHasRepo] = js.native
}
object Block_ {
  
  @scala.inline
  def apply(
    get: ReturnType[FnCall],
    put: ReturnType[FnCallHasIpldPinGcLockPreload],
    rm: ReturnType[FnCallHasRmAll],
    stat: ReturnType[FnCallHasRepo]
  ): Block_ = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], rm = rm.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block_]
  }
  
  @scala.inline
  implicit class Block_Ops[Self <: Block_] (val x: Self) extends AnyVal {
    
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
    def setGet(value: ReturnType[FnCall]): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPut(value: ReturnType[FnCallHasIpldPinGcLockPreload]): Self = this.set("put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRm(value: ReturnType[FnCallHasRmAll]): Self = this.set("rm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(value: ReturnType[FnCallHasRepo]): Self = this.set("stat", value.asInstanceOf[js.Any])
  }
}
