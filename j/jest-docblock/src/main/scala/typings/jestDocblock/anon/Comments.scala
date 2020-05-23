package typings.jestDocblock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comments extends js.Object {
  var comments: String
  var pragmas: typings.jestDocblock.mod.Pragmas
}

object Comments {
  @scala.inline
  def apply(comments: String, pragmas: typings.jestDocblock.mod.Pragmas): Comments = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], pragmas = pragmas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comments]
  }
}

