package typings.libp2pInterfaces.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Direction extends js.Object {
  
  var direction: String = js.native
  
  var encryption: js.UndefOr[String] = js.native
  
  var multiplexer: js.UndefOr[String] = js.native
  
  var timeline: Open = js.native
}
object Direction {
  
  @scala.inline
  def apply(direction: String, timeline: Open): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class DirectionOps[Self <: Direction] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeline(value: Open): Self = this.set("timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption(value: String): Self = this.set("encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    
    @scala.inline
    def setMultiplexer(value: String): Self = this.set("multiplexer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplexer: Self = this.set("multiplexer", js.undefined)
  }
}
