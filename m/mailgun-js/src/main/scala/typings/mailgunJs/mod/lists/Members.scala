package typings.mailgunJs.mod.lists

import typings.mailgunJs.mod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Members extends js.Object {
  def add(data: MemberAddMultipleData): js.Promise[_] = js.native
  def add(data: MemberAddMultipleData, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
  def create(data: MemberCreateData): js.Promise[_] = js.native
  def create(data: MemberCreateData, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
  def list(): js.Promise[_] = js.native
  def list(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
}

