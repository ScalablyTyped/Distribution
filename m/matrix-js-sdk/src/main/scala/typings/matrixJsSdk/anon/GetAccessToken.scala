package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessToken extends js.Object {
  def getAccessToken(): js.Promise[String] = js.native
}

object GetAccessToken {
  @scala.inline
  def apply(getAccessToken: () => js.Promise[String]): GetAccessToken = {
    val __obj = js.Dynamic.literal(getAccessToken = js.Any.fromFunction0(getAccessToken))
    __obj.asInstanceOf[GetAccessToken]
  }
  @scala.inline
  implicit class GetAccessTokenOps[Self <: GetAccessToken] (val x: Self) extends AnyVal {
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
    def setGetAccessToken(value: () => js.Promise[String]): Self = this.set("getAccessToken", js.Any.fromFunction0(value))
  }
  
}

