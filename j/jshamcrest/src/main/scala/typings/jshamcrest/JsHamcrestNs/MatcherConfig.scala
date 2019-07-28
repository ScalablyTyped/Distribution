package typings.jshamcrest.JsHamcrestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the configurable methods for declaring a new matcher using JsHamcrest.SimpleMatcher.
  */
@js.native
trait MatcherConfig extends js.Object {
  @JSName("describeTo")
  var describeTo_Original: DescribeTo = js.native
  var describeValueTo: js.UndefOr[DescribeValueTo] = js.native
  @JSName("matches")
  var matches_Original: Matches = js.native
  def describeTo(description: Description): Unit = js.native
  def matches(value: js.Any): Boolean = js.native
}

