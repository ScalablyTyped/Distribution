package typings.jshamcrest.JsHamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the configurable methods for declaring a new matcher using JsHamcrest.SimpleMatcher.
  */
@js.native
trait MatcherConfig extends js.Object {
  
  def describeTo(description: Description): Unit = js.native
  @JSName("describeTo")
  var describeTo_Original: DescribeTo = js.native
  
  var describeValueTo: js.UndefOr[DescribeValueTo] = js.native
  
  def matches(value: js.Any): Boolean = js.native
  @JSName("matches")
  var matches_Original: Matches = js.native
}
