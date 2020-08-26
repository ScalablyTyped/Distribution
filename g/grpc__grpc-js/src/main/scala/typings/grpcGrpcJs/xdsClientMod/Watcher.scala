package typings.grpcGrpcJs.xdsClientMod

import typings.grpcGrpcJs.callStreamMod.StatusObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watcher[UpdateType] extends js.Object {
  def onResourceDoesNotExist(): Unit = js.native
  def onTransientError(error: StatusObject): Unit = js.native
  def onValidUpdate(update: UpdateType): Unit = js.native
}

object Watcher {
  @scala.inline
  def apply[UpdateType](
    onResourceDoesNotExist: () => Unit,
    onTransientError: StatusObject => Unit,
    onValidUpdate: UpdateType => Unit
  ): Watcher[UpdateType] = {
    val __obj = js.Dynamic.literal(onResourceDoesNotExist = js.Any.fromFunction0(onResourceDoesNotExist), onTransientError = js.Any.fromFunction1(onTransientError), onValidUpdate = js.Any.fromFunction1(onValidUpdate))
    __obj.asInstanceOf[Watcher[UpdateType]]
  }
  @scala.inline
  implicit class WatcherOps[Self <: Watcher[_], UpdateType] (val x: Self with Watcher[UpdateType]) extends AnyVal {
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
    def setOnResourceDoesNotExist(value: () => Unit): Self = this.set("onResourceDoesNotExist", js.Any.fromFunction0(value))
    @scala.inline
    def setOnTransientError(value: StatusObject => Unit): Self = this.set("onTransientError", js.Any.fromFunction1(value))
    @scala.inline
    def setOnValidUpdate(value: UpdateType => Unit): Self = this.set("onValidUpdate", js.Any.fromFunction1(value))
  }
  
}

