package typings
package jsforceLib.jsforceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce", "Request")
@js.native
class Request[T] protected ()
  extends jsforceLib.apiChatterMod.Request[T] {
  def this(chatter: jsforceLib.apiChatterMod.Chatter, params: jsforceLib.apiChatterMod.RequestParams) = this()
}

