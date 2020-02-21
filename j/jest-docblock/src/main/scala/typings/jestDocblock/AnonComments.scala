package typings.jestDocblock

import typings.jestDocblock.mod.Pragmas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComments extends js.Object {
  var comments: String
  var pragmas: Pragmas
}

object AnonComments {
  @scala.inline
  def apply(comments: String, pragmas: Pragmas): AnonComments = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], pragmas = pragmas.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComments]
  }
}

