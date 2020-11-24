package typings.highlightJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VuePlugin extends js.Object {
  
  def install(vue: js.Any): Unit = js.native
}
object VuePlugin {
  
  @scala.inline
  def apply(install: js.Any => Unit): VuePlugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction1(install))
    __obj.asInstanceOf[VuePlugin]
  }
  
  @scala.inline
  implicit class VuePluginOps[Self <: VuePlugin] (val x: Self) extends AnyVal {
    
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
    def setInstall(value: js.Any => Unit): Self = this.set("install", js.Any.fromFunction1(value))
  }
}
