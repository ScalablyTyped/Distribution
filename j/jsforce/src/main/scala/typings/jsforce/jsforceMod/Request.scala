package typings.jsforce.jsforceMod

import typings.jsforce.apiChatterMod.RequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce", "Request")
@js.native
class Request[T] protected ()
  extends typings.jsforce.apiChatterMod.Request[T] {
  def this(chatter: typings.jsforce.apiChatterMod.Chatter, params: RequestParams) = this()
}

