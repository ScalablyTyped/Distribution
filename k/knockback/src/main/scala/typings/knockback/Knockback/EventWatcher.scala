package typings.knockback.Knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventWatcher extends Destroyable {
  def emitter(): Model[_, ModelSetOptions] = js.native
  def emitter(newEmitter: Model[_, ModelSetOptions]): js.Any = js.native
  def registerCallbacks(obj: js.Any, callback_info: js.Any): js.Any = js.native
  def releaseCallbacks(obj: js.Any): js.Any = js.native
}

