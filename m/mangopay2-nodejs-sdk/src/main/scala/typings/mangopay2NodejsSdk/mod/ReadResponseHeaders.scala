package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Determines the shape of the response
@js.native
trait ReadResponseHeaders extends js.Object {
  var resolveWithFullResponse: `true` = js.native
}

object ReadResponseHeaders {
  @scala.inline
  def apply(resolveWithFullResponse: `true`): ReadResponseHeaders = {
    val __obj = js.Dynamic.literal(resolveWithFullResponse = resolveWithFullResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadResponseHeaders]
  }
  @scala.inline
  implicit class ReadResponseHeadersOps[Self <: ReadResponseHeaders] (val x: Self) extends AnyVal {
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
    def setResolveWithFullResponse(value: `true`): Self = this.set("resolveWithFullResponse", value.asInstanceOf[js.Any])
  }
  
}

