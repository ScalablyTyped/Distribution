package typings.knockback.KnockbackNs

import typings.backbone.backboneMod.ModelBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Knockback.TriggeredObservable")
@js.native
class TriggeredObservable protected () extends Destroyable {
  def this(emitter: ModelBase, event: String) = this()
  def emitter(): ModelBase = js.native
  def emitter(newEmitter: ModelBase): js.Any = js.native
}

