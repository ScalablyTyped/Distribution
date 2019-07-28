package typings.mailgunDashJs.mailgunDashJsMod

import typings.mailgunDashJs.mailgunDashJsMod.listsNs.Member
import typings.mailgunDashJs.mailgunDashJsMod.listsNs.Members
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lists extends js.Object {
  def info(): js.Promise[_] = js.native
  def info(callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
  def members(): Members = js.native
  def members(member: String): Member = js.native
}

