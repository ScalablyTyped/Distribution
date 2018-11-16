package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs.listsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  def update(data: MemberUpdateData): stdLib.Promise[_] = js.native
  def update(
    data: MemberUpdateData,
    callback: js.Function2[
      /* err */ mailgunDashJsLib.mailgunDashJsMod.MailgunNs.Error, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ): stdLib.Promise[_] = js.native
}

