package typings.jestJasmine2.specMod

import typings.jestJasmine2.AnonGetColumnNumber
import typings.jestJasmine2.expectationResultFactoryMod.Options
import typings.jestTestResult.typesMod.FailedAssertion
import typings.jestTestResult.typesMod.Milliseconds
import typings.jestTestResult.typesMod.Status
import typings.jestTypes.configMod.Path
import typings.std.Error
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecResult extends js.Object {
  var __callsite: js.UndefOr[AnonGetColumnNumber] = js.undefined
  var description: String
  var duration: js.UndefOr[Milliseconds] = js.undefined
  var failedExpectations: js.Array[FailedAssertion]
  var fullName: String
  var id: String
  var passedExpectations: js.Array[
    ReturnType[
      js.Function2[/* options */ Options, /* initError */ js.UndefOr[Error], FailedAssertion]
    ]
  ]
  var pendingReason: String
  var status: Status
  var testPath: Path
}

object SpecResult {
  @scala.inline
  def apply(
    description: String,
    failedExpectations: js.Array[FailedAssertion],
    fullName: String,
    id: String,
    passedExpectations: js.Array[
      ReturnType[
        js.Function2[/* options */ Options, /* initError */ js.UndefOr[Error], FailedAssertion]
      ]
    ],
    pendingReason: String,
    status: Status,
    testPath: Path,
    __callsite: AnonGetColumnNumber = null,
    duration: Int | Double = null
  ): SpecResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], failedExpectations = failedExpectations.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], passedExpectations = passedExpectations.asInstanceOf[js.Any], pendingReason = pendingReason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    if (__callsite != null) __obj.updateDynamic("__callsite")(__callsite.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecResult]
  }
}

