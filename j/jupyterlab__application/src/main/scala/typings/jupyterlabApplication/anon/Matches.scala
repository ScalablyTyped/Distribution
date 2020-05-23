package typings.jupyterlabApplication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matches extends js.Object {
  var matches: js.Array[String]
  var patterns: js.Array[String]
}

object Matches {
  @scala.inline
  def apply(matches: js.Array[String], patterns: js.Array[String]): Matches = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches]
  }
}

