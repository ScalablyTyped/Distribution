package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Position extends js.Object {
  
  var position: js.Tuple2[Double, Double] = js.native
  
  var user_id: Double | String = js.native
}
object Position {
  
  @scala.inline
  def apply(position: js.Tuple2[Double, Double], user_id: Double | String): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: js.Tuple2[Double, Double]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: Double | String): Self = this.set("user_id", value.asInstanceOf[js.Any])
  }
}
