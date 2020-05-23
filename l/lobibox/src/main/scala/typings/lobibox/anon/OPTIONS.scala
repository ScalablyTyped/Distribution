package typings.lobibox.anon

import typings.lobibox.LobiboxModule.NotifyDefault
import typings.lobibox.LobiboxModule.NotifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OPTIONS extends js.Object {
  var DEFAULTS: js.UndefOr[NotifyDefault] = js.native
  var OPTIONS: js.UndefOr[NotifyOptions] = js.native
  def apply[T /* <: NotifyDefault */](`type`: String): T = js.native
  def apply[T /* <: NotifyDefault */](`type`: String, options: NotifyOptions): T = js.native
}

