package typings.imgurDashRestDashApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagVote extends js.Object {
  var author: String
  var downs: Double
  var name: String
  var ups: Double
}

object TagVote {
  @scala.inline
  def apply(author: String, downs: Double, name: String, ups: Double): TagVote = {
    val __obj = js.Dynamic.literal(author = author, downs = downs, name = name, ups = ups)
  
    __obj.asInstanceOf[TagVote]
  }
}

