package typings.instagramPrivateApi.postingOptionsMod

import typings.instagramPrivateApi.anon.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingUsertags extends js.Object {
  var in: js.Array[Position]
}

object PostingUsertags {
  @scala.inline
  def apply(in: js.Array[Position]): PostingUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingUsertags]
  }
}

