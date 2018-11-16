package typings
package jpmLib.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/request", JSImport.Namespace)
@js.native
object requestModMembers extends js.Object {
  def Request(options: jpmLib.Anon_Anonymous): Request = js.native
  def Request[ResponseType](options: jpmLib.Anon_AnonymousUrl[ResponseType]): STRequest[ResponseType] = js.native
}

