package typings.lodashDecorators.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends js.Object {
  var post: js.UndefOr[Boolean] = js.undefined
}

object Post {
  @scala.inline
  def apply(post: js.UndefOr[Boolean] = js.undefined): Post = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(post)) __obj.updateDynamic("post")(post.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post]
  }
}

