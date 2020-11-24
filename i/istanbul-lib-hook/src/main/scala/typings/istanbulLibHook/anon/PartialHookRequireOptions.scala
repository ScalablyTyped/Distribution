package typings.istanbulLibHook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<istanbul-lib-hook.istanbul-lib-hook.HookRequireOptions> */
@js.native
trait PartialHookRequireOptions extends js.Object {
  
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  var postLoadHook: js.UndefOr[js.Function1[/* filename */ String, Unit]] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object PartialHookRequireOptions {
  
  @scala.inline
  def apply(): PartialHookRequireOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHookRequireOptions]
  }
  
  @scala.inline
  implicit class PartialHookRequireOptionsOps[Self <: PartialHookRequireOptions] (val x: Self) extends AnyVal {
    
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
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setPostLoadHook(value: /* filename */ String => Unit): Self = this.set("postLoadHook", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePostLoadHook: Self = this.set("postLoadHook", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
