package typings.atJestCore.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var roots: Double
  var testMatch: Double
  var testPathIgnorePatterns: Double
  var testPathPattern: js.UndefOr[Double] = js.undefined
  var testRegex: Double
}

object Stats {
  @scala.inline
  def apply(
    roots: Double,
    testMatch: Double,
    testPathIgnorePatterns: Double,
    testRegex: Double,
    testPathPattern: Int | Double = null
  ): Stats = {
    val __obj = js.Dynamic.literal(roots = roots, testMatch = testMatch, testPathIgnorePatterns = testPathIgnorePatterns, testRegex = testRegex)
    if (testPathPattern != null) __obj.updateDynamic("testPathPattern")(testPathPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

