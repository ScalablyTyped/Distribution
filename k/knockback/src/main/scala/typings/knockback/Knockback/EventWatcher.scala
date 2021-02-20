package typings.knockback.Knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventWatcher extends Destroyable {
  
  def emitter(): Model[_, ModelSetOptions, js.Object] = js.native
  def emitter(newEmitter: Model[_, ModelSetOptions, js.Object]): js.Any = js.native
  
  def registerCallbacks(obj: js.Any, callback_info: js.Any): js.Any = js.native
  
  def releaseCallbacks(obj: js.Any): js.Any = js.native
}
