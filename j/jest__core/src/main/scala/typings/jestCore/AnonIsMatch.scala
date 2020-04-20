package typings.jestCore

import typings.jestCore.jestCoreStrings.roots
import typings.jestCore.jestCoreStrings.testMatch
import typings.jestCore.jestCoreStrings.testPathIgnorePatterns
import typings.jestCore.jestCoreStrings.testPathPattern
import typings.jestCore.jestCoreStrings.testRegex
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsMatch extends js.Object {
  var stat: roots | testMatch | testPathIgnorePatterns | testRegex | testPathPattern
  def isMatch(path: Path): Boolean
}

object AnonIsMatch {
  @scala.inline
  def apply(
    isMatch: Path => Boolean,
    stat: roots | testMatch | testPathIgnorePatterns | testRegex | testPathPattern
  ): AnonIsMatch = {
    val __obj = js.Dynamic.literal(isMatch = js.Any.fromFunction1(isMatch), stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsMatch]
  }
}

