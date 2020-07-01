package typings.gtmetrix.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestDetails extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var resources: StringDictionary[String]
  var results: StringDictionary[js.Any]
  var state: String
}

object TestDetails {
  @scala.inline
  def apply(
    resources: StringDictionary[String],
    results: StringDictionary[js.Any],
    state: String,
    error: String = null
  ): TestDetails = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestDetails]
  }
}

