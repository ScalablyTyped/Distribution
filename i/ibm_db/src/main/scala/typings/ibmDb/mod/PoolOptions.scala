package typings.ibmDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolOptions extends js.Object {
  var autoCleanIdle: js.UndefOr[Boolean] = js.native
  var connectTimeout: js.UndefOr[Double] = js.native
  var idleTimeout: js.UndefOr[Double] = js.native
  var maxPoolSize: js.UndefOr[Double] = js.native
  var systemNaming: js.UndefOr[js.Any] = js.native
}

object PoolOptions {
  @scala.inline
  def apply(): PoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolOptions]
  }
  @scala.inline
  implicit class PoolOptionsOps[Self <: PoolOptions] (val x: Self) extends AnyVal {
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
    def setAutoCleanIdle(value: Boolean): Self = this.set("autoCleanIdle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCleanIdle: Self = this.set("autoCleanIdle", js.undefined)
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    @scala.inline
    def setIdleTimeout(value: Double): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdleTimeout: Self = this.set("idleTimeout", js.undefined)
    @scala.inline
    def setMaxPoolSize(value: Double): Self = this.set("maxPoolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPoolSize: Self = this.set("maxPoolSize", js.undefined)
    @scala.inline
    def setSystemNaming(value: js.Any): Self = this.set("systemNaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemNaming: Self = this.set("systemNaming", js.undefined)
  }
  
}

