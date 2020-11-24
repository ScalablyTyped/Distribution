package typings.istanbulLibHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookRequireOptions extends Options {
  
  var extensions: js.Array[String] = js.native
  
  def postLoadHook(filename: String): Unit = js.native
}
object HookRequireOptions {
  
  @scala.inline
  def apply(extensions: js.Array[String], postLoadHook: String => Unit, verbose: Boolean): HookRequireOptions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], postLoadHook = js.Any.fromFunction1(postLoadHook), verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookRequireOptions]
  }
  
  @scala.inline
  implicit class HookRequireOptionsOps[Self <: HookRequireOptions] (val x: Self) extends AnyVal {
    
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
    def setPostLoadHook(value: String => Unit): Self = this.set("postLoadHook", js.Any.fromFunction1(value))
  }
}
