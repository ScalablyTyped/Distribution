package typings.mailgunJs.mod

import typings.mailgunJs.mod.lists.Member
import typings.mailgunJs.mod.lists.Members
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lists_ extends js.Object {
  def info(): js.Promise[_] = js.native
  def info(callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
  def members(): Members = js.native
  def members(member: String): Member = js.native
}

