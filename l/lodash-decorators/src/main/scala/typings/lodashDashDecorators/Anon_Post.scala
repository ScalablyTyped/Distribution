package typings.lodashDashDecorators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Post extends js.Object {
  var post: js.UndefOr[Boolean] = js.undefined
}

object Anon_Post {
  @scala.inline
  def apply(post: js.UndefOr[Boolean] = js.undefined): Anon_Post = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(post)) __obj.updateDynamic("post")(post)
    __obj.asInstanceOf[Anon_Post]
  }
}

