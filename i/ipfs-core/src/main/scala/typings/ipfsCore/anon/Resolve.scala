package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resolve extends js.Object {
  
  var ipld: js.Any = js.native
  
  var preload: js.Any = js.native
  
  var resolve: js.Any = js.native
}
object Resolve {
  
  @scala.inline
  def apply(ipld: js.Any, preload: js.Any, resolve: js.Any): Resolve = {
    val __obj = js.Dynamic.literal(ipld = ipld.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolve]
  }
  
  @scala.inline
  implicit class ResolveOps[Self <: Resolve] (val x: Self) extends AnyVal {
    
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
    def setIpld(value: js.Any): Self = this.set("ipld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: js.Any): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: js.Any): Self = this.set("resolve", value.asInstanceOf[js.Any])
  }
}
