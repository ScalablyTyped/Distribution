package typings
package jestLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spy extends js.Object {
  var and: SpyAnd = js.native
  var argsForCall: js.Array[_] = js.native
  var calls: Calls = js.native
  var identity: java.lang.String = js.native
  var mostRecentCall: jestLib.Anon_Args = js.native
  var wasCalled: scala.Boolean = js.native
  def apply(params: js.Any*): js.Any = js.native
}

