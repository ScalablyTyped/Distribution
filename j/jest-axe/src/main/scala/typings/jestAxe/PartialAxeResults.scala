package typings.jestAxe

import typings.axeCore.mod.Result
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.TestEngine
import typings.axeCore.mod.TestEnvironment
import typings.axeCore.mod.TestRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<axe-core.axe-core.AxeResults> */
trait PartialAxeResults extends js.Object {
  var inapplicable: js.UndefOr[js.Array[Result]] = js.undefined
  var incomplete: js.UndefOr[js.Array[Result]] = js.undefined
  var passes: js.UndefOr[js.Array[Result]] = js.undefined
  var testEngine: js.UndefOr[TestEngine] = js.undefined
  var testEnvironment: js.UndefOr[TestEnvironment] = js.undefined
  var testRunner: js.UndefOr[TestRunner] = js.undefined
  var timestamp: js.UndefOr[String] = js.undefined
  var toolOptions: js.UndefOr[RunOptions] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var violations: js.UndefOr[js.Array[Result]] = js.undefined
}

object PartialAxeResults {
  @scala.inline
  def apply(
    inapplicable: js.Array[Result] = null,
    incomplete: js.Array[Result] = null,
    passes: js.Array[Result] = null,
    testEngine: TestEngine = null,
    testEnvironment: TestEnvironment = null,
    testRunner: TestRunner = null,
    timestamp: String = null,
    toolOptions: RunOptions = null,
    url: String = null,
    violations: js.Array[Result] = null
  ): PartialAxeResults = {
    val __obj = js.Dynamic.literal()
    if (inapplicable != null) __obj.updateDynamic("inapplicable")(inapplicable.asInstanceOf[js.Any])
    if (incomplete != null) __obj.updateDynamic("incomplete")(incomplete.asInstanceOf[js.Any])
    if (passes != null) __obj.updateDynamic("passes")(passes.asInstanceOf[js.Any])
    if (testEngine != null) __obj.updateDynamic("testEngine")(testEngine.asInstanceOf[js.Any])
    if (testEnvironment != null) __obj.updateDynamic("testEnvironment")(testEnvironment.asInstanceOf[js.Any])
    if (testRunner != null) __obj.updateDynamic("testRunner")(testRunner.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (toolOptions != null) __obj.updateDynamic("toolOptions")(toolOptions.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (violations != null) __obj.updateDynamic("violations")(violations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAxeResults]
  }
}

