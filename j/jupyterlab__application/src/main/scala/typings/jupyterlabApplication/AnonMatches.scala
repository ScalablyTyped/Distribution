package typings.jupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatches extends js.Object {
  var matches: js.Array[String]
  var patterns: js.Array[String]
}

object AnonMatches {
  @scala.inline
  def apply(matches: js.Array[String], patterns: js.Array[String]): AnonMatches = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatches]
  }
}

