package typings.imgurRestApi.ImgurRestApi

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
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagVote]
  }
}

