package typings.mailgunDashJs.mailgunDashJsMod.listsNs

import typings.mailgunDashJs.mailgunDashJsMod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  def update(data: MemberUpdateData): js.Promise[_] = js.native
  def update(data: MemberUpdateData, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
}

