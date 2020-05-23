package typings.jestCore.typesMod

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
    testPathPattern: js.UndefOr[Double] = js.undefined
  ): Stats = {
    val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any])
    if (!js.isUndefined(testPathPattern)) __obj.updateDynamic("testPathPattern")(testPathPattern.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

