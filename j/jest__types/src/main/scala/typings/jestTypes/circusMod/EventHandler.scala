package typings.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandler extends js.Object {
  
  def apply(event: AsyncEvent, state: State): Unit | js.Promise[Unit] = js.native
  def apply(event: SyncEvent, state: State): Unit = js.native
}
