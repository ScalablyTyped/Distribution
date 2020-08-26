package typings.ionicUtilsStream.mod

import typings.node.streamMod.ReadableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamBufferOptions extends ReadableOptions {
  var allocSize: js.UndefOr[Double] = js.native
  var chunkSize: js.UndefOr[Double] = js.native
  var growSize: js.UndefOr[Double] = js.native
}

object ReadableStreamBufferOptions {
  @scala.inline
  def apply(): ReadableStreamBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadableStreamBufferOptions]
  }
  @scala.inline
  implicit class ReadableStreamBufferOptionsOps[Self <: ReadableStreamBufferOptions] (val x: Self) extends AnyVal {
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
    def setAllocSize(value: Double): Self = this.set("allocSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocSize: Self = this.set("allocSize", js.undefined)
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    @scala.inline
    def setGrowSize(value: Double): Self = this.set("growSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrowSize: Self = this.set("growSize", js.undefined)
  }
  
}

