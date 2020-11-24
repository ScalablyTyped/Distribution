package typings.koaIgnore.anon

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait If extends js.Object {
  
  def `if`(condition: js.Function1[/* context */ Context, Boolean]): Middleware[DefaultState, DefaultContext] = js.native
  
  def unless(condition: js.Function1[/* context */ Context, Boolean]): Middleware[DefaultState, DefaultContext] = js.native
}
object If {
  
  @scala.inline
  def apply(
    `if`: js.Function1[/* context */ Context, Boolean] => Middleware[DefaultState, DefaultContext],
    unless: js.Function1[/* context */ Context, Boolean] => Middleware[DefaultState, DefaultContext]
  ): If = {
    val __obj = js.Dynamic.literal(unless = js.Any.fromFunction1(unless))
    __obj.updateDynamic("if")(js.Any.fromFunction1(`if`))
    __obj.asInstanceOf[If]
  }
  
  @scala.inline
  implicit class IfOps[Self <: If] (val x: Self) extends AnyVal {
    
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
    def setIf(value: js.Function1[/* context */ Context, Boolean] => Middleware[DefaultState, DefaultContext]): Self = this.set("if", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnless(value: js.Function1[/* context */ Context, Boolean] => Middleware[DefaultState, DefaultContext]): Self = this.set("unless", js.Any.fromFunction1(value))
  }
}
