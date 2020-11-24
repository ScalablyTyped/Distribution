package typings.iitc.inteltypesMod.Intel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkUpPlayerType extends js.Object {
  
  var plain: String = js.native
  
  var team: String = js.native
}
object MarkUpPlayerType {
  
  @scala.inline
  def apply(plain: String, team: String): MarkUpPlayerType = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkUpPlayerType]
  }
  
  @scala.inline
  implicit class MarkUpPlayerTypeOps[Self <: MarkUpPlayerType] (val x: Self) extends AnyVal {
    
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
    def setPlain(value: String): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
  }
}
