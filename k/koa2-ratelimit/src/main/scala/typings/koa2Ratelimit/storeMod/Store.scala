package typings.koa2Ratelimit.storeMod

import typings.koa2Ratelimit.anon.Counter
import typings.koa2Ratelimit.anon.RateLimitOptionskeystring
import typings.koa2Ratelimit.mod.RateLimitOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store extends js.Object {
  
  def decrement(key: String, options: RateLimitOptions, weight: Double): js.Promise[Unit] = js.native
  
  def incr(key: String, options: RateLimitOptions, weight: Double): js.Promise[Counter] = js.native
  
  def saveAbuse(options: RateLimitOptionskeystring): js.Promise[Unit] | Unit = js.native
}
object Store {
  
  @scala.inline
  def apply(
    decrement: (String, RateLimitOptions, Double) => js.Promise[Unit],
    incr: (String, RateLimitOptions, Double) => js.Promise[Counter],
    saveAbuse: RateLimitOptionskeystring => js.Promise[Unit] | Unit
  ): Store = {
    val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction3(decrement), incr = js.Any.fromFunction3(incr), saveAbuse = js.Any.fromFunction1(saveAbuse))
    __obj.asInstanceOf[Store]
  }
  
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
    
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
    def setDecrement(value: (String, RateLimitOptions, Double) => js.Promise[Unit]): Self = this.set("decrement", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIncr(value: (String, RateLimitOptions, Double) => js.Promise[Counter]): Self = this.set("incr", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSaveAbuse(value: RateLimitOptionskeystring => js.Promise[Unit] | Unit): Self = this.set("saveAbuse", js.Any.fromFunction1(value))
  }
}
