package typings.ionicons.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildNode extends js.Object {
  
  var vattrs: js.UndefOr[js.Any] = js.native
  
  var vchildren: js.UndefOr[js.Array[VNode]] = js.native
  
  var vkey: js.UndefOr[String | Double] = js.native
  
  var vname: js.UndefOr[String] = js.native
  
  var vtag: js.UndefOr[String | Double | js.Function] = js.native
  
  var vtext: js.UndefOr[String] = js.native
}
object ChildNode {
  
  @scala.inline
  def apply(): ChildNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildNode]
  }
  
  @scala.inline
  implicit class ChildNodeOps[Self <: ChildNode] (val x: Self) extends AnyVal {
    
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
    def setVattrs(value: js.Any): Self = this.set("vattrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVattrs: Self = this.set("vattrs", js.undefined)
    
    @scala.inline
    def setVchildrenVarargs(value: VNode*): Self = this.set("vchildren", js.Array(value :_*))
    
    @scala.inline
    def setVchildren(value: js.Array[VNode]): Self = this.set("vchildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVchildren: Self = this.set("vchildren", js.undefined)
    
    @scala.inline
    def setVkey(value: String | Double): Self = this.set("vkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVkey: Self = this.set("vkey", js.undefined)
    
    @scala.inline
    def setVname(value: String): Self = this.set("vname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVname: Self = this.set("vname", js.undefined)
    
    @scala.inline
    def setVtag(value: String | Double | js.Function): Self = this.set("vtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVtag: Self = this.set("vtag", js.undefined)
    
    @scala.inline
    def setVtext(value: String): Self = this.set("vtext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVtext: Self = this.set("vtext", js.undefined)
  }
}
