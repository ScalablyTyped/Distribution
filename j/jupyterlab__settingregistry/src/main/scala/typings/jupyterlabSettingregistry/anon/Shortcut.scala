package typings.jupyterlabSettingregistry.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shortcut extends js.Object {
  
  var shortcut: Properties = js.native
}
object Shortcut {
  
  @scala.inline
  def apply(shortcut: Properties): Shortcut = {
    val __obj = js.Dynamic.literal(shortcut = shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shortcut]
  }
  
  @scala.inline
  implicit class ShortcutOps[Self <: Shortcut] (val x: Self) extends AnyVal {
    
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
    def setShortcut(value: Properties): Self = this.set("shortcut", value.asInstanceOf[js.Any])
  }
}
