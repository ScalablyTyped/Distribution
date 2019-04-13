package typings
package mailgunDashJsLib.mailgunDashJsMod.listsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  def update(data: MemberUpdateData): js.Promise[_] = js.native
  def update(
    data: MemberUpdateData,
    callback: js.Function2[/* err */ mailgunDashJsLib.mailgunDashJsMod.Error, /* data */ js.Any, scala.Unit]
  ): js.Promise[_] = js.native
}

