package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccessToken extends js.Object {
  def getAccessToken(): js.Promise[String]
}

object GetAccessToken {
  @scala.inline
  def apply(getAccessToken: () => js.Promise[String]): GetAccessToken = {
    val __obj = js.Dynamic.literal(getAccessToken = js.Any.fromFunction0(getAccessToken))
    __obj.asInstanceOf[GetAccessToken]
  }
}

