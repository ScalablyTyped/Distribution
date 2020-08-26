package typings.jasminewd2.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Env extends js.Object {
  def addMatchers(matchers: AsyncCustomMatcherFactories): Unit = js.native
}

object Env {
  @scala.inline
  def apply(addMatchers: AsyncCustomMatcherFactories => Unit): Env = {
    val __obj = js.Dynamic.literal(addMatchers = js.Any.fromFunction1(addMatchers))
    __obj.asInstanceOf[Env]
  }
  @scala.inline
  implicit class EnvOps[Self <: Env] (val x: Self) extends AnyVal {
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
    def setAddMatchers(value: AsyncCustomMatcherFactories => Unit): Self = this.set("addMatchers", js.Any.fromFunction1(value))
  }
  
}

