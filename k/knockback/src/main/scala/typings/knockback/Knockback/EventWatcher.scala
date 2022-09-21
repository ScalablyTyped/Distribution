package typings.knockback.Knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventWatcher
  extends StObject
     with Destroyable {
  
  def emitter(): Model[Any, ModelSetOptions, Any] = js.native
  def emitter(newEmitter: Model[Any, ModelSetOptions, Any]): Any = js.native
  
  def registerCallbacks(obj: Any, callback_info: Any): Any = js.native
  
  def releaseCallbacks(obj: Any): Any = js.native
}
