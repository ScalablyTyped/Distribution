package typings.hooker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHookerOptions extends js.Object {
  
  var once: js.UndefOr[Boolean] = js.native
  
  var passName: js.UndefOr[Boolean] = js.native
  
  var post: js.UndefOr[HookerPostHookFunction] = js.native
  
  var pre: js.UndefOr[HookerPreHookFunction] = js.native
}
object IHookerOptions {
  
  @scala.inline
  def apply(): IHookerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHookerOptions]
  }
  
  @scala.inline
  implicit class IHookerOptionsOps[Self <: IHookerOptions] (val x: Self) extends AnyVal {
    
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
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    
    @scala.inline
    def setPassName(value: Boolean): Self = this.set("passName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassName: Self = this.set("passName", js.undefined)
    
    @scala.inline
    def setPost(value: (/* result */ js.Any, /* repeated */ js.Any) => IHookerPostHookResult | Unit): Self = this.set("post", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setPre(value: /* repeated */ js.Any => IHookerPreHookResult | Unit): Self = this.set("pre", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
  }
}
