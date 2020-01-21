package typings.lodashDecorators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPost extends js.Object {
  var post: js.UndefOr[Boolean] = js.undefined
}

object AnonPost {
  @scala.inline
  def apply(post: js.UndefOr[Boolean] = js.undefined): AnonPost = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(post)) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPost]
  }
}

