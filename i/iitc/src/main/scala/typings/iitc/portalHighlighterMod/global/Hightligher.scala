package typings.iitc.portalHighlighterMod.global

import typings.iitc.iitctypesMod.IITC.Portal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hightligher extends js.Object {
  
  def hightlight(portal: Portal): Unit = js.native
}
object Hightligher {
  
  @scala.inline
  def apply(hightlight: Portal => Unit): Hightligher = {
    val __obj = js.Dynamic.literal(hightlight = js.Any.fromFunction1(hightlight))
    __obj.asInstanceOf[Hightligher]
  }
  
  @scala.inline
  implicit class HightligherOps[Self <: Hightligher] (val x: Self) extends AnyVal {
    
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
    def setHightlight(value: Portal => Unit): Self = this.set("hightlight", js.Any.fromFunction1(value))
  }
}
