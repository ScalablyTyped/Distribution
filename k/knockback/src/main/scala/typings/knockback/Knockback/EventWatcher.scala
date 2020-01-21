package typings.knockback.Knockback

import typings.backbone.mod.Model
import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Knockback.EventWatcher")
@js.native
class EventWatcher () extends Destroyable {
  def emitter(): Model = js.native
  def emitter(newEmitter: Model): js.Any = js.native
  def registerCallbacks(obj: js.Any, callback_info: js.Any): js.Any = js.native
  def releaseCallbacks(obj: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("Knockback.EventWatcher")
@js.native
object EventWatcher extends js.Object {
  def useOptionsOrCreate(options: js.Any, emitter: KnockoutObservable[_], obj: Model, callback_options: js.Any): js.Any = js.native
}

