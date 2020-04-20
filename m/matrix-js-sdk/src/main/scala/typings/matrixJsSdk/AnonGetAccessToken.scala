package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetAccessToken extends js.Object {
  def getAccessToken(): js.Promise[String]
}

object AnonGetAccessToken {
  @scala.inline
  def apply(getAccessToken: () => js.Promise[String]): AnonGetAccessToken = {
    val __obj = js.Dynamic.literal(getAccessToken = js.Any.fromFunction0(getAccessToken))
    __obj.asInstanceOf[AnonGetAccessToken]
  }
}

