package typings.graphqlDashFields.graphqlDashFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var excludedFields: js.UndefOr[js.Array[String]] = js.undefined
  var processArguments: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(excludedFields: js.Array[String] = null, processArguments: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (excludedFields != null) __obj.updateDynamic("excludedFields")(excludedFields)
    if (!js.isUndefined(processArguments)) __obj.updateDynamic("processArguments")(processArguments)
    __obj.asInstanceOf[Options]
  }
}

