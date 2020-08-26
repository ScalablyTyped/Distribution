package typings.ionicCliFramework.outputMod

import typings.ionicCliFramework.colorsMod.Colors
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogUpdateOutputStrategyOptions extends js.Object {
  val colors: js.UndefOr[Colors] = js.native
  val stream: js.UndefOr[WritableStream] = js.native
}

object LogUpdateOutputStrategyOptions {
  @scala.inline
  def apply(): LogUpdateOutputStrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogUpdateOutputStrategyOptions]
  }
  @scala.inline
  implicit class LogUpdateOutputStrategyOptionsOps[Self <: LogUpdateOutputStrategyOptions] (val x: Self) extends AnyVal {
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
    def setColors(value: Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
  
}

