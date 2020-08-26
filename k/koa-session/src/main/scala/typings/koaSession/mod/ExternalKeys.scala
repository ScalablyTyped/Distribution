package typings.koaSession.mod

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalKeys extends js.Object {
  /**
    * get session object by key
    */
  def get(ctx: Context): String = js.native
  /**
    * set session object for key, with a maxAge (in ms)
    */
  def set(ctx: Context, value: js.Any): Unit = js.native
}

object ExternalKeys {
  @scala.inline
  def apply(get: Context => String, set: (Context, js.Any) => Unit): ExternalKeys = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[ExternalKeys]
  }
  @scala.inline
  implicit class ExternalKeysOps[Self <: ExternalKeys] (val x: Self) extends AnyVal {
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
    def setGet(value: Context => String): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (Context, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

