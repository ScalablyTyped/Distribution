package typings.jshamcrest.JsHamcrestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matcher extends SelfDescribing {
  @JSName("describeValueTo")
  var describeValueTo_Original: DescribeValueTo = js.native
  @JSName("matches")
  var matches_Original: Matches = js.native
  def describeValueTo(value: js.Any, description: Description): Unit = js.native
  def matches(value: js.Any): Boolean = js.native
}

