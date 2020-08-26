package typings.istextorbinary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var chunkBegin: js.UndefOr[Double] = js.native
  var chunkLength: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setChunkBegin(value: Double): Self = this.set("chunkBegin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkBegin: Self = this.set("chunkBegin", js.undefined)
    @scala.inline
    def setChunkLength(value: Double): Self = this.set("chunkLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkLength: Self = this.set("chunkLength", js.undefined)
  }
  
}

