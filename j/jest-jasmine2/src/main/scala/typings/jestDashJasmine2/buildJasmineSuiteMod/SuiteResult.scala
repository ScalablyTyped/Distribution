package typings.jestDashJasmine2.buildJasmineSuiteMod

import typings.atJestTestDashResult.buildTypesMod.FailedAssertion
import typings.atJestTypes.buildConfigMod.Path
import typings.jestDashJasmine2.buildExpectationResultFactoryMod.Options
import typings.std.Error
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteResult extends js.Object {
  var description: String
  var failedExpectations: js.Array[
    ReturnType[
      js.Function2[/* options */ Options, /* initError */ js.UndefOr[Error], FailedAssertion]
    ]
  ]
  var fullName: String
  var id: String
  var status: js.UndefOr[String] = js.undefined
  var testPath: Path
}

object SuiteResult {
  @scala.inline
  def apply(
    description: String,
    failedExpectations: js.Array[
      ReturnType[
        js.Function2[/* options */ Options, /* initError */ js.UndefOr[Error], FailedAssertion]
      ]
    ],
    fullName: String,
    id: String,
    testPath: Path,
    status: String = null
  ): SuiteResult = {
    val __obj = js.Dynamic.literal(description = description, failedExpectations = failedExpectations, fullName = fullName, id = id, testPath = testPath)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[SuiteResult]
  }
}

