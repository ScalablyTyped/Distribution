package typings.koaPassport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PauseStream extends js.Object {
  var pauseStream: Boolean = js.native
}

object PauseStream {
  @scala.inline
  def apply(pauseStream: Boolean): PauseStream = {
    val __obj = js.Dynamic.literal(pauseStream = pauseStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseStream]
  }
  @scala.inline
  implicit class PauseStreamOps[Self <: PauseStream] (val x: Self) extends AnyVal {
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
    def setPauseStream(value: Boolean): Self = this.set("pauseStream", value.asInstanceOf[js.Any])
  }
  
}

