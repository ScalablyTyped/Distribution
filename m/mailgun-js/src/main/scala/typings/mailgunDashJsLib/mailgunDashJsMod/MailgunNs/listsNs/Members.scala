package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs.listsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Members extends js.Object {
  def add(data: js.Array[MemberCreateData]): stdLib.Promise[_] = js.native
  def add(
    data: js.Array[MemberCreateData],
    callback: js.Function2[
      /* err */ mailgunDashJsLib.mailgunDashJsMod.MailgunNs.Error, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ): stdLib.Promise[_] = js.native
  def create(data: MemberCreateData): stdLib.Promise[_] = js.native
  def create(
    data: MemberCreateData,
    callback: js.Function2[
      /* err */ mailgunDashJsLib.mailgunDashJsMod.MailgunNs.Error, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ): stdLib.Promise[_] = js.native
  def list(): stdLib.Promise[_] = js.native
  def list(
    callback: js.Function2[
      /* err */ mailgunDashJsLib.mailgunDashJsMod.MailgunNs.Error, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ): stdLib.Promise[_] = js.native
}

