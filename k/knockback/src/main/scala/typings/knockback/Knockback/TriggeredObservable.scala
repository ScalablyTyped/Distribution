package typings.knockback.Knockback

import typings.backbone.mod.ModelBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggeredObservable
  extends StObject
     with Destroyable {
  
  def emitter(): ModelBase = js.native
  def emitter(newEmitter: ModelBase): Any = js.native
}
