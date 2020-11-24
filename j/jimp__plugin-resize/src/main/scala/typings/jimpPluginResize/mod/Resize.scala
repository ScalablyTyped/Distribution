package typings.jimpPluginResize.mod

import typings.jimpPluginResize.anon.RESIZEBEZIER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resize extends js.Object {
  
  var `class`: ResizeClass = js.native
  
  var constants: RESIZEBEZIER = js.native
}
object Resize {
  
  @scala.inline
  def apply(`class`: ResizeClass, constants: RESIZEBEZIER): Resize = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resize]
  }
  
  @scala.inline
  implicit class ResizeOps[Self <: Resize] (val x: Self) extends AnyVal {
    
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
    def setClass(value: ResizeClass): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstants(value: RESIZEBEZIER): Self = this.set("constants", value.asInstanceOf[js.Any])
  }
}
