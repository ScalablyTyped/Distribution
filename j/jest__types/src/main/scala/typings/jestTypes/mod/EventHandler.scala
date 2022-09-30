package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandler extends StObject {
  
  def apply(event: AsyncEvent, state: State): Unit | js.Promise[Unit] = js.native
  def apply(event: SyncEvent, state: State): Unit = js.native
}
