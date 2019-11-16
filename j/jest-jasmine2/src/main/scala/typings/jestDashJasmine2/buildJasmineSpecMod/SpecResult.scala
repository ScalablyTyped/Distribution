package typings.jestDashJasmine2.buildJasmineSpecMod

import typings.atJestTestDashResult.buildTypesMod.FailedAssertion
import typings.atJestTestDashResult.buildTypesMod.Milliseconds
import typings.atJestTestDashResult.buildTypesMod.Status
import typings.atJestTypes.buildConfigMod.Path
import typings.jestDashJasmine2.Anon_GetColumnNumber
import typings.jestDashJasmine2.buildExpectationResultFactoryMod.Options
import typings.std.Error
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecResult extends js.Object {
  var __callsite: js.UndefOr[Anon_GetColumnNumber] = js.undefined
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
    __callsite: Anon_GetColumnNumber = null,
    duration: Int | Double = null
  ): SpecResult = {
    val __obj = js.Dynamic.literal(description = description, failedExpectations = failedExpectations, fullName = fullName, id = id, passedExpectations = passedExpectations, pendingReason = pendingReason, status = status, testPath = testPath)
    if (__callsite != null) __obj.updateDynamic("__callsite")(__callsite)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecResult]
  }
}

