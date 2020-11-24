package typings.leafletFullscreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoFullscreen extends js.Object {
  
  var pseudoFullscreen: Boolean = js.native
}
object PseudoFullscreen {
  
  @scala.inline
  def apply(pseudoFullscreen: Boolean): PseudoFullscreen = {
    val __obj = js.Dynamic.literal(pseudoFullscreen = pseudoFullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoFullscreen]
  }
  
  @scala.inline
  implicit class PseudoFullscreenOps[Self <: PseudoFullscreen] (val x: Self) extends AnyVal {
    
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
    def setPseudoFullscreen(value: Boolean): Self = this.set("pseudoFullscreen", value.asInstanceOf[js.Any])
  }
}
