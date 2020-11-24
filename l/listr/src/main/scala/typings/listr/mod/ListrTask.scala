package typings.listr.mod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListrTask[Ctx] extends js.Object {
  
  var enabled: js.UndefOr[
    js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean] | Observable_[Boolean]]
  ] = js.native
  
  var skip: js.UndefOr[js.Function1[/* ctx */ Ctx, Unit | Boolean | String | js.Promise[Boolean]]] = js.native
  
  def task(ctx: Ctx, task: ListrTaskWrapper[Ctx]): Unit | ListrTaskResult[Ctx] = js.native
  
  var title: String = js.native
}
object ListrTask {
  
  @scala.inline
  def apply[Ctx](task: (Ctx, ListrTaskWrapper[Ctx]) => Unit | ListrTaskResult[Ctx], title: String): ListrTask[Ctx] = {
    val __obj = js.Dynamic.literal(task = js.Any.fromFunction2(task), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListrTask[Ctx]]
  }
  
  @scala.inline
  implicit class ListrTaskOps[Self <: ListrTask[_], Ctx] (val x: Self with ListrTask[Ctx]) extends AnyVal {
    
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
    def setTask(value: (Ctx, ListrTaskWrapper[Ctx]) => Unit | ListrTaskResult[Ctx]): Self = this.set("task", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: /* ctx */ Ctx => Boolean | js.Promise[Boolean] | Observable_[Boolean]): Self = this.set("enabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setSkip(value: /* ctx */ Ctx => Unit | Boolean | String | js.Promise[Boolean]): Self = this.set("skip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
  }
}
