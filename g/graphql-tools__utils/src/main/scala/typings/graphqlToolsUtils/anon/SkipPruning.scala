package typings.graphqlToolsUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipPruning extends js.Object {
  var skipPruning: Boolean
}

object SkipPruning {
  @scala.inline
  def apply(skipPruning: Boolean): SkipPruning = {
    val __obj = js.Dynamic.literal(skipPruning = skipPruning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipPruning]
  }
}

