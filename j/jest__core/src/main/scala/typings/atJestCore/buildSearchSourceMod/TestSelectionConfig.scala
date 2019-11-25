package typings.atJestCore.buildSearchSourceMod

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSelectionConfig extends js.Object {
  var findRelatedTests: js.UndefOr[Boolean] = js.undefined
  var input: js.UndefOr[String] = js.undefined
  var onlyChanged: js.UndefOr[Boolean] = js.undefined
  var paths: js.UndefOr[js.Array[Path]] = js.undefined
  var shouldTreatInputAsPattern: js.UndefOr[Boolean] = js.undefined
  var testPathPattern: js.UndefOr[String] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
}

object TestSelectionConfig {
  @scala.inline
  def apply(
    findRelatedTests: js.UndefOr[Boolean] = js.undefined,
    input: String = null,
    onlyChanged: js.UndefOr[Boolean] = js.undefined,
    paths: js.Array[Path] = null,
    shouldTreatInputAsPattern: js.UndefOr[Boolean] = js.undefined,
    testPathPattern: String = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): TestSelectionConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(findRelatedTests)) __obj.updateDynamic("findRelatedTests")(findRelatedTests.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyChanged)) __obj.updateDynamic("onlyChanged")(onlyChanged.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldTreatInputAsPattern)) __obj.updateDynamic("shouldTreatInputAsPattern")(shouldTreatInputAsPattern.asInstanceOf[js.Any])
    if (testPathPattern != null) __obj.updateDynamic("testPathPattern")(testPathPattern.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSelectionConfig]
  }
}

