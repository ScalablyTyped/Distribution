package typings.graphqlToolsLoad.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunAll[T] extends js.Object {
  def add(fn: js.Function0[T]): Unit = js.native
  def runAll(): Unit = js.native
}

object RunAll {
  @scala.inline
  def apply[T](add: js.Function0[T] => Unit, runAll: () => Unit): RunAll[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), runAll = js.Any.fromFunction0(runAll))
    __obj.asInstanceOf[RunAll[T]]
  }
  @scala.inline
  implicit class RunAllOps[Self <: RunAll[_], T] (val x: Self with RunAll[T]) extends AnyVal {
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
    def setAdd(value: js.Function0[T] => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setRunAll(value: () => Unit): Self = this.set("runAll", js.Any.fromFunction0(value))
  }
  
}

