package typings.jshamcrest.JsHamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matcher extends SelfDescribing {
  
  def describeValueTo(value: js.Any, description: Description): Unit = js.native
  @JSName("describeValueTo")
  var describeValueTo_Original: DescribeValueTo = js.native
  
  def matches(value: js.Any): Boolean = js.native
  @JSName("matches")
  var matches_Original: Matches = js.native
}
