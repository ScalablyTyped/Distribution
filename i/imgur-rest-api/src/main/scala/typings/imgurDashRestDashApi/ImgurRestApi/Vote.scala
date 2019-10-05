package typings.imgurDashRestDashApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vote extends js.Object {
  var downs: Double
  var ups: Double
}

object Vote {
  @scala.inline
  def apply(downs: Double, ups: Double): Vote = {
    val __obj = js.Dynamic.literal(downs = downs, ups = ups)
  
    __obj.asInstanceOf[Vote]
  }
}

