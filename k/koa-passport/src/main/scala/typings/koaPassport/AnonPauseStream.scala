package typings.koaPassport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPauseStream extends js.Object {
  var pauseStream: Boolean
}

object AnonPauseStream {
  @scala.inline
  def apply(pauseStream: Boolean): AnonPauseStream = {
    val __obj = js.Dynamic.literal(pauseStream = pauseStream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPauseStream]
  }
}

