package typings.atJestCore

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsMatch extends js.Object {
  var stat: String
  def isMatch(path: Path): Boolean
}

object Anon_IsMatch {
  @scala.inline
  def apply(isMatch: Path => Boolean, stat: String): Anon_IsMatch = {
    val __obj = js.Dynamic.literal(isMatch = js.Any.fromFunction1(isMatch), stat = stat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IsMatch]
  }
}

