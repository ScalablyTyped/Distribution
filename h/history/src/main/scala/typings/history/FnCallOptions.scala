package typings.history

import typings.history.createHashHistoryMod.HashHistoryBuildOptions
import typings.history.mod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallOptions extends js.Object {
  def apply[S](): History[S] = js.native
  def apply[S](options: HashHistoryBuildOptions): History[S] = js.native
}

