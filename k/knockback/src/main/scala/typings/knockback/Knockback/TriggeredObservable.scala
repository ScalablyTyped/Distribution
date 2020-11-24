package typings.knockback.Knockback

import typings.backbone.mod.ModelBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggeredObservable extends Destroyable {
  
  def emitter(): ModelBase = js.native
  def emitter(newEmitter: ModelBase): js.Any = js.native
}
