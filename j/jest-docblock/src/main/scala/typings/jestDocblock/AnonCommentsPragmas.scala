package typings.jestDocblock

import typings.jestDocblock.mod.Pragmas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsPragmas extends js.Object {
  var comments: js.UndefOr[String] = js.undefined
  var pragmas: js.UndefOr[Pragmas] = js.undefined
}

object AnonCommentsPragmas {
  @scala.inline
  def apply(comments: String = null, pragmas: Pragmas = null): AnonCommentsPragmas = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (pragmas != null) __obj.updateDynamic("pragmas")(pragmas.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsPragmas]
  }
}

