package typings.jestJasmine2.typesMod

import typings.jestJasmine2.expectationResultFactoryMod.Options
import typings.jestTestResult.typesMod.FailedAssertion
import typings.std.Error
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunDetails extends js.Object {
  var failedExpectations: js.UndefOr[
    js.Array[
      ReturnType[
        js.Function2[/* options */ Options, /* initError */ js.UndefOr[Error], FailedAssertion]
      ]
    ]
  ] = js.undefined
  var totalSpecsDefined: js.UndefOr[Double] = js.undefined
}

object RunDetails {
  @scala.inline
  def apply(
    failedExpectations: js.Array[
      ReturnType[
        js.Function2[/* options */ Options, /* initError */ js.UndefOr[Error], FailedAssertion]
      ]
    ] = null,
    totalSpecsDefined: Int | Double = null
  ): RunDetails = {
    val __obj = js.Dynamic.literal()
    if (failedExpectations != null) __obj.updateDynamic("failedExpectations")(failedExpectations.asInstanceOf[js.Any])
    if (totalSpecsDefined != null) __obj.updateDynamic("totalSpecsDefined")(totalSpecsDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunDetails]
  }
}

