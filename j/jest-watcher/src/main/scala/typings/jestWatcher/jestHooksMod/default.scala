package typings.jestWatcher.jestHooksMod

import typings.jestWatcher.anon.ReadonlyJestHookEmitter
import typings.jestWatcher.anon.ReadonlyJestHookSubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-watcher/build/JestHooks", JSImport.Default)
@js.native
class default () extends JestHooks {
  /* CompleteClass */
  override var _emitter: js.Any = js.native
  /* CompleteClass */
  override var _listeners: js.Any = js.native
  /* CompleteClass */
  override var _subscriber: js.Any = js.native
  /* CompleteClass */
  override def getEmitter(): ReadonlyJestHookEmitter = js.native
  /* CompleteClass */
  override def getSubscriber(): ReadonlyJestHookSubscribe = js.native
  /* CompleteClass */
  override def isUsed(hook: AvailableHooks): Double = js.native
}

