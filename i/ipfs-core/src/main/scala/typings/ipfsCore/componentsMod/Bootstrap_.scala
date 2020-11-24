package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.FnCallHasAddAll
import typings.ipfsCore.anon.FnCallHasKeychain
import typings.ipfsCore.anon.FnCallHasRmAll
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bootstrap_ extends js.Object {
  
  var add: ReturnType[FnCallHasAddAll] = js.native
  
  var list: ReturnType[FnCallHasKeychain] = js.native
  
  var rm: ReturnType[FnCallHasRmAll] = js.native
}
object Bootstrap_ {
  
  @scala.inline
  def apply(
    add: ReturnType[FnCallHasAddAll],
    list: ReturnType[FnCallHasKeychain],
    rm: ReturnType[FnCallHasRmAll]
  ): Bootstrap_ = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], rm = rm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bootstrap_]
  }
  
  @scala.inline
  implicit class Bootstrap_Ops[Self <: Bootstrap_] (val x: Self) extends AnyVal {
    
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
    def setList(value: ReturnType[FnCallHasKeychain]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRm(value: ReturnType[FnCallHasRmAll]): Self = this.set("rm", value.asInstanceOf[js.Any])
  }
}
