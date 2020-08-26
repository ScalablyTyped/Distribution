package typings.libratoNode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LibratoRequestOptions extends js.Object {
  var authorization: js.UndefOr[String] = js.native
  var delayStrategy: js.UndefOr[js.Function0[Double]] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var maxAttempts: js.UndefOr[Double] = js.native
  var method: js.UndefOr[String] = js.native
  var retryDelay: js.UndefOr[Double] = js.native
  var uri: js.UndefOr[String] = js.native
  var `user-agent`: js.UndefOr[String] = js.native
}

object LibratoRequestOptions {
  @scala.inline
  def apply(): LibratoRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibratoRequestOptions]
  }
  @scala.inline
  implicit class LibratoRequestOptionsOps[Self <: LibratoRequestOptions] (val x: Self) extends AnyVal {
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
    def setAuthorization(value: String): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
    @scala.inline
    def setDelayStrategy(value: () => Double): Self = this.set("delayStrategy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDelayStrategy: Self = this.set("delayStrategy", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMaxAttempts(value: Double): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setRetryDelay(value: Double): Self = this.set("retryDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryDelay: Self = this.set("retryDelay", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    @scala.inline
    def `setUser-agent`(value: String): Self = this.set("user-agent", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUser-agent`: Self = this.set("user-agent", js.undefined)
  }
  
}

