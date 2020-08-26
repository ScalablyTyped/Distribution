package typings.leveldown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelDownBatchOptions extends js.Object {
  var sync: js.UndefOr[Boolean] = js.native
}

object LevelDownBatchOptions {
  @scala.inline
  def apply(): LevelDownBatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelDownBatchOptions]
  }
  @scala.inline
  implicit class LevelDownBatchOptionsOps[Self <: LevelDownBatchOptions] (val x: Self) extends AnyVal {
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
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
  
}

