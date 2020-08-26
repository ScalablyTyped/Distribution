package typings.got.mod

import typings.got.gotNumbers.`408`
import typings.got.gotNumbers.`413`
import typings.got.gotNumbers.`429`
import typings.got.gotNumbers.`500`
import typings.got.gotNumbers.`502`
import typings.got.gotNumbers.`503`
import typings.got.gotNumbers.`504`
import typings.got.gotStrings.DELETE
import typings.got.gotStrings.GET
import typings.got.gotStrings.HEAD
import typings.got.gotStrings.OPTIONS
import typings.got.gotStrings.POST
import typings.got.gotStrings.PUT
import typings.got.gotStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryOptions extends js.Object {
  /**
    * Allowed error codes.
    */
  var errorCodes: js.UndefOr[js.Array[String]] = js.native
  var maxRetryAfter: js.UndefOr[Double] = js.native
  var methods: js.UndefOr[js.Array[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE]] = js.native
  var retries: js.UndefOr[Double | RetryFunction] = js.native
  var statusCodes: js.UndefOr[js.Array[`408` | `413` | `429` | `500` | `502` | `503` | `504`]] = js.native
}

object RetryOptions {
  @scala.inline
  def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  @scala.inline
  implicit class RetryOptionsOps[Self <: RetryOptions] (val x: Self) extends AnyVal {
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
    def setErrorCodesVarargs(value: String*): Self = this.set("errorCodes", js.Array(value :_*))
    @scala.inline
    def setErrorCodes(value: js.Array[String]): Self = this.set("errorCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCodes: Self = this.set("errorCodes", js.undefined)
    @scala.inline
    def setMaxRetryAfter(value: Double): Self = this.set("maxRetryAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetryAfter: Self = this.set("maxRetryAfter", js.undefined)
    @scala.inline
    def setMethodsVarargs(value: (GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE)*): Self = this.set("methods", js.Array(value :_*))
    @scala.inline
    def setMethods(value: js.Array[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setRetriesFunction2(value: (/* retry */ Double, /* error */ js.Any) => Double): Self = this.set("retries", js.Any.fromFunction2(value))
    @scala.inline
    def setRetries(value: Double | RetryFunction): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setStatusCodesVarargs(value: (`408` | `413` | `429` | `500` | `502` | `503` | `504`)*): Self = this.set("statusCodes", js.Array(value :_*))
    @scala.inline
    def setStatusCodes(value: js.Array[`408` | `413` | `429` | `500` | `502` | `503` | `504`]): Self = this.set("statusCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCodes: Self = this.set("statusCodes", js.undefined)
  }
  
}

