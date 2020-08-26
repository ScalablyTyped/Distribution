package typings.knockout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.knockout.knockoutStrings.notifyAtFixedRate
import typings.knockout.knockoutStrings.notifyWhenChangesStop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimitOptions
  extends /* option */ StringDictionary[js.Any] {
  var method: js.UndefOr[notifyAtFixedRate | notifyWhenChangesStop | RateLimitMethod] = js.native
  var timeout: Double = js.native
}

object RateLimitOptions {
  @scala.inline
  def apply(timeout: Double): RateLimitOptions = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitOptions]
  }
  @scala.inline
  implicit class RateLimitOptionsOps[Self <: RateLimitOptions] (val x: Self) extends AnyVal {
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
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodFunction3(
      value: (/* callback */ js.Function0[Unit], /* timeout */ Double, /* options */ js.Any) => js.Function0[Unit]
    ): Self = this.set("method", js.Any.fromFunction3(value))
    @scala.inline
    def setMethod(value: notifyAtFixedRate | notifyWhenChangesStop | RateLimitMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

