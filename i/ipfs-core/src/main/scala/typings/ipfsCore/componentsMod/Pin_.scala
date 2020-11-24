package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.FnCallHasAddAll
import typings.ipfsCore.anon.FnCallHasBlockGcLockPreloadPinOptions
import typings.ipfsCore.anon.FnCallHasPinManagerDag
import typings.ipfsCore.anon.FnCallHasRmAll
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pin_ extends js.Object {
  
  var add: ReturnType[FnCallHasAddAll] = js.native
  
  var addAll: ReturnType[FnCallHasBlockGcLockPreloadPinOptions] = js.native
  
  var ls: ReturnType[FnCallHasPinManagerDag] = js.native
  
  var rm: ReturnType[FnCallHasRmAll] = js.native
}
object Pin_ {
  
  @scala.inline
  def apply(
    add: ReturnType[FnCallHasAddAll],
    addAll: ReturnType[FnCallHasBlockGcLockPreloadPinOptions],
    ls: ReturnType[FnCallHasPinManagerDag],
    rm: ReturnType[FnCallHasRmAll]
  ): Pin_ = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], addAll = addAll.asInstanceOf[js.Any], ls = ls.asInstanceOf[js.Any], rm = rm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pin_]
  }
  
  @scala.inline
  implicit class Pin_Ops[Self <: Pin_] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: ReturnType[FnCallHasAddAll]): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAll(value: ReturnType[FnCallHasBlockGcLockPreloadPinOptions]): Self = this.set("addAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLs(value: ReturnType[FnCallHasPinManagerDag]): Self = this.set("ls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRm(value: ReturnType[FnCallHasRmAll]): Self = this.set("rm", value.asInstanceOf[js.Any])
  }
}
