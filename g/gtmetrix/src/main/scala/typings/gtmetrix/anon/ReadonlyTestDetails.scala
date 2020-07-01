package typings.gtmetrix.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<gtmetrix.gtmetrix.TestDetails> */
trait ReadonlyTestDetails extends js.Object {
  val error: js.UndefOr[String] = js.undefined
  val resources: StringDictionary[String]
  val results: StringDictionary[js.Any]
  val state: String
}

object ReadonlyTestDetails {
  @scala.inline
  def apply(
    resources: StringDictionary[String],
    results: StringDictionary[js.Any],
    state: String,
    error: String = null
  ): ReadonlyTestDetails = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyTestDetails]
  }
}

