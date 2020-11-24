package typings.iitc.anon

import typings.iitc.iitcStrings.portal_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Health extends js.Object {
  
  var health: Double = js.native
  
  var image: String = js.native
  
  var latE6: Double = js.native
  
  var level: Double = js.native
  
  var lngE6: Double = js.native
  
  var resCount: Double = js.native
  
  var team: Double = js.native
  
  var title: String = js.native
  
  var `type`: portal_ = js.native
}
object Health {
  
  @scala.inline
  def apply(
    health: Double,
    image: String,
    latE6: Double,
    level: Double,
    lngE6: Double,
    resCount: Double,
    team: Double,
    title: String,
    `type`: portal_
  ): Health = {
    val __obj = js.Dynamic.literal(health = health.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any], resCount = resCount.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Health]
  }
  
  @scala.inline
  implicit class HealthOps[Self <: Health] (val x: Self) extends AnyVal {
    
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
    def setHealth(value: Double): Self = this.set("health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatE6(value: Double): Self = this.set("latE6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngE6(value: Double): Self = this.set("lngE6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResCount(value: Double): Self = this.set("resCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: Double): Self = this.set("team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: portal_): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
