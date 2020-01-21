package typings.jestJasmine2.suiteMod

import typings.jestJasmine2.expectationResultFactoryMod.Options
import typings.jestTestResult.typesMod.FailedAssertion
import typings.jestTypes.configMod.Path
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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], failedExpectations = failedExpectations.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteResult]
  }
}

