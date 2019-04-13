package typings
package mailgunDashJsLib.mailgunDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lists extends js.Object {
  def info(): js.Promise[_] = js.native
  def info(callback: js.Function2[/* error */ Error, /* data */ js.Any, scala.Unit]): js.Promise[_] = js.native
  def members(): mailgunDashJsLib.mailgunDashJsMod.listsNs.Members = js.native
  def members(member: java.lang.String): mailgunDashJsLib.mailgunDashJsMod.listsNs.Member = js.native
}

