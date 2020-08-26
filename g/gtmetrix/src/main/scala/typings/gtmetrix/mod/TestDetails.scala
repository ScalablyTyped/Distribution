package typings.gtmetrix.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestDetails extends js.Object {
  var error: js.UndefOr[String] = js.native
  var resources: StringDictionary[String] = js.native
  var results: StringDictionary[js.Any] = js.native
  var state: String = js.native
}

object TestDetails {
  @scala.inline
  def apply(resources: StringDictionary[String], results: StringDictionary[js.Any], state: String): TestDetails = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestDetails]
  }
  @scala.inline
  implicit class TestDetailsOps[Self <: TestDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResources(value: StringDictionary[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setResults(value: StringDictionary[js.Any]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

