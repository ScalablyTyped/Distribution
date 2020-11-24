package typings.jsforce.mod

import typings.jsforce.chatterMod.RequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce", "Request")
@js.native
class Request[T] protected ()
  extends typings.jsforce.chatterMod.Request[T] {
  def this(chatter: typings.jsforce.chatterMod.Chatter, params: RequestParams) = this()
}
