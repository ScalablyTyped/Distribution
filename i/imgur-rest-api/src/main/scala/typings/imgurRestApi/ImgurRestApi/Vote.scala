package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vote extends js.Object {
  
  var downs: Double = js.native
  
  var ups: Double = js.native
}
object Vote {
  
  @scala.inline
  def apply(downs: Double, ups: Double): Vote = {
    val __obj = js.Dynamic.literal(downs = downs.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vote]
  }
  
  @scala.inline
  implicit class VoteOps[Self <: Vote] (val x: Self) extends AnyVal {
    
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
    def setDowns(value: Double): Self = this.set("downs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUps(value: Double): Self = this.set("ups", value.asInstanceOf[js.Any])
  }
}
