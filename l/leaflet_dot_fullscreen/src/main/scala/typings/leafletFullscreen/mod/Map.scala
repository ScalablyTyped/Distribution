package typings.leafletFullscreen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map extends js.Object {
  
  def toggleFullScreen(): Unit = js.native
}
object Map {
  
  @scala.inline
  def apply(toggleFullScreen: () => Unit): Map = {
    val __obj = js.Dynamic.literal(toggleFullScreen = js.Any.fromFunction0(toggleFullScreen))
    __obj.asInstanceOf[Map]
  }
  
  @scala.inline
  implicit class MapOps[Self <: Map] (val x: Self) extends AnyVal {
    
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
    def setToggleFullScreen(value: () => Unit): Self = this.set("toggleFullScreen", js.Any.fromFunction0(value))
  }
}
