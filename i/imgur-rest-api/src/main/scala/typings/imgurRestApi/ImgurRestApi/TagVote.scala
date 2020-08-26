package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagVote extends js.Object {
  var author: String = js.native
  var downs: Double = js.native
  var name: String = js.native
  var ups: Double = js.native
}

object TagVote {
  @scala.inline
  def apply(author: String, downs: Double, name: String, ups: Double): TagVote = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagVote]
  }
  @scala.inline
  implicit class TagVoteOps[Self <: TagVote] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setDowns(value: Double): Self = this.set("downs", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUps(value: Double): Self = this.set("ups", value.asInstanceOf[js.Any])
  }
  
}

