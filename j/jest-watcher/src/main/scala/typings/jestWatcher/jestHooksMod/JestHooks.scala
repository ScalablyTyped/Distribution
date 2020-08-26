package typings.jestWatcher.jestHooksMod

import typings.jestWatcher.anon.ReadonlyJestHookEmitter
import typings.jestWatcher.anon.ReadonlyJestHookSubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JestHooks extends js.Object {
  var _emitter: js.Any = js.native
  var _listeners: js.Any = js.native
  var _subscriber: js.Any = js.native
  def getEmitter(): ReadonlyJestHookEmitter = js.native
  def getSubscriber(): ReadonlyJestHookSubscribe = js.native
  def isUsed(hook: AvailableHooks): Boolean = js.native
}

object JestHooks {
  @scala.inline
  def apply(
    _emitter: js.Any,
    _listeners: js.Any,
    _subscriber: js.Any,
    getEmitter: () => ReadonlyJestHookEmitter,
    getSubscriber: () => ReadonlyJestHookSubscribe,
    isUsed: AvailableHooks => Boolean
  ): JestHooks = {
    val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], _listeners = _listeners.asInstanceOf[js.Any], _subscriber = _subscriber.asInstanceOf[js.Any], getEmitter = js.Any.fromFunction0(getEmitter), getSubscriber = js.Any.fromFunction0(getSubscriber), isUsed = js.Any.fromFunction1(isUsed))
    __obj.asInstanceOf[JestHooks]
  }
  @scala.inline
  implicit class JestHooksOps[Self <: JestHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_emitter(value: js.Any): Self = this.set("_emitter", value.asInstanceOf[js.Any])
    @scala.inline
    def set_listeners(value: js.Any): Self = this.set("_listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def set_subscriber(value: js.Any): Self = this.set("_subscriber", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetEmitter(value: () => ReadonlyJestHookEmitter): Self = this.set("getEmitter", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubscriber(value: () => ReadonlyJestHookSubscribe): Self = this.set("getSubscriber", js.Any.fromFunction0(value))
    @scala.inline
    def setIsUsed(value: AvailableHooks => Boolean): Self = this.set("isUsed", js.Any.fromFunction1(value))
  }
  
}

