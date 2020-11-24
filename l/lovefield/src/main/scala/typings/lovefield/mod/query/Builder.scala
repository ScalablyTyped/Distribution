package typings.lovefield.mod.query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Builder extends js.Object {
  
  def bind(values: js.Any*): Builder = js.native
  
  def exec(): js.Promise[js.Array[js.Object]] = js.native
  
  def explain(): String = js.native
  
  def toSql(): String = js.native
}
object Builder {
  
  @scala.inline
  def apply(
    bind: /* repeated */ js.Any => Builder,
    exec: () => js.Promise[js.Array[js.Object]],
    explain: () => String,
    toSql: () => String
  ): Builder = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), toSql = js.Any.fromFunction0(toSql))
    __obj.asInstanceOf[Builder]
  }
  
  @scala.inline
  implicit class BuilderOps[Self <: Builder] (val x: Self) extends AnyVal {
    
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
    def setBind(value: /* repeated */ js.Any => Builder): Self = this.set("bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExec(value: () => js.Promise[js.Array[js.Object]]): Self = this.set("exec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExplain(value: () => String): Self = this.set("explain", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSql(value: () => String): Self = this.set("toSql", js.Any.fromFunction0(value))
  }
}
