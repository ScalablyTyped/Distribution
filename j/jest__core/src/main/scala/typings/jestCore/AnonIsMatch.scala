package typings.jestCore

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsMatch extends js.Object {
  var stat: String
  def isMatch(path: Path): Boolean
}

object AnonIsMatch {
  @scala.inline
  def apply(isMatch: Path => Boolean, stat: String): AnonIsMatch = {
    val __obj = js.Dynamic.literal(isMatch = js.Any.fromFunction1(isMatch), stat = stat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsMatch]
  }
}

