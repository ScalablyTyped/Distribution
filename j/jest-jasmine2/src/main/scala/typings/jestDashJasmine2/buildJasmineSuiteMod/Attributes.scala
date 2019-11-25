package typings.jestDashJasmine2.buildJasmineSuiteMod

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var description: String
  var id: String
  var parentSuite: js.UndefOr[Suite] = js.undefined
  var throwOnExpectationFailure: js.UndefOr[Boolean] = js.undefined
  def getTestPath(): Path
}

object Attributes {
  @scala.inline
  def apply(
    description: String,
    getTestPath: () => Path,
    id: String,
    parentSuite: Suite = null,
    throwOnExpectationFailure: js.UndefOr[Boolean] = js.undefined
  ): Attributes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], getTestPath = js.Any.fromFunction0(getTestPath), id = id.asInstanceOf[js.Any])
    if (parentSuite != null) __obj.updateDynamic("parentSuite")(parentSuite.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnExpectationFailure)) __obj.updateDynamic("throwOnExpectationFailure")(throwOnExpectationFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

