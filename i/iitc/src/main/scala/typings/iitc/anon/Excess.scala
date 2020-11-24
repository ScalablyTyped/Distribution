package typings.iitc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Excess extends js.Object {
  
  var excess: Double = js.native
  
  var linkDefenseBoost: Double = js.native
  
  var links: Double = js.native
  
  var shields: Double = js.native
}
object Excess {
  
  @scala.inline
  def apply(excess: Double, linkDefenseBoost: Double, links: Double, shields: Double): Excess = {
    val __obj = js.Dynamic.literal(excess = excess.asInstanceOf[js.Any], linkDefenseBoost = linkDefenseBoost.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], shields = shields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excess]
  }
  
  @scala.inline
  implicit class ExcessOps[Self <: Excess] (val x: Self) extends AnyVal {
    
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
    def setExcess(value: Double): Self = this.set("excess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkDefenseBoost(value: Double): Self = this.set("linkDefenseBoost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: Double): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShields(value: Double): Self = this.set("shields", value.asInstanceOf[js.Any])
  }
}
