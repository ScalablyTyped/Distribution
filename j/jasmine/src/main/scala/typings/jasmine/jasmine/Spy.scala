package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spy
  extends _Expected[js.Any] {
  var and: SpyAnd = js.native
  var calls: Calls = js.native
  def apply(params: js.Any*): js.Any = js.native
  def withArgs(args: js.Any*): Spy = js.native
}

