package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PausedEventUIParam extends js.Object {
  /**
    * Get the current time in the video at which the event was fired.
    */
  var currentTime: js.UndefOr[Double] = js.native
  /**
    * Get the video duration in seconds.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Get the url of the playing video.
    */
  var source: js.UndefOr[String] = js.native
}

object PausedEventUIParam {
  @scala.inline
  def apply(): PausedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PausedEventUIParam]
  }
  @scala.inline
  implicit class PausedEventUIParamOps[Self <: PausedEventUIParam] (val x: Self) extends AnyVal {
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
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentTime: Self = this.set("currentTime", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

