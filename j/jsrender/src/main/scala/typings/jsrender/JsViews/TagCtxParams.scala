package typings.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagCtxParams extends js.Object {
  
  /* tagCtx.params object */
  var args: js.Array[String] = js.native
  
  var ctx: Hash[String] = js.native
  
  var props: Hash[String] = js.native
}
object TagCtxParams {
  
  @scala.inline
  def apply(args: js.Array[String], ctx: Hash[String], props: Hash[String]): TagCtxParams = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagCtxParams]
  }
  
  @scala.inline
  implicit class TagCtxParamsOps[Self <: TagCtxParams] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: Hash[String]): Self = this.set("ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: Hash[String]): Self = this.set("props", value.asInstanceOf[js.Any])
  }
}
