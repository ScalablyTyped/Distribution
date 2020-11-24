package typings.less.Less

import typings.less.LessStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plugin extends js.Object {
  
  def install(less: LessStatic, pluginManager: PluginManager): Unit = js.native
}
object Plugin {
  
  @scala.inline
  def apply(install: (LessStatic, PluginManager) => Unit): Plugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction2(install))
    __obj.asInstanceOf[Plugin]
  }
  
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
    
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
    def setInstall(value: (LessStatic, PluginManager) => Unit): Self = this.set("install", js.Any.fromFunction2(value))
  }
}
