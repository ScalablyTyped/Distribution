package typings.grommet.anon

import typings.grommet.utilsMod.EdgeSizeType
import typings.grommet.utilsMod._EdgeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Start extends _EdgeType {
  var bottom: js.UndefOr[EdgeSizeType | String] = js.native
  var end: js.UndefOr[EdgeSizeType | String] = js.native
  var horizontal: js.UndefOr[EdgeSizeType | String] = js.native
  var left: js.UndefOr[EdgeSizeType | String] = js.native
  var right: js.UndefOr[EdgeSizeType | String] = js.native
  var start: js.UndefOr[EdgeSizeType | String] = js.native
  var top: js.UndefOr[EdgeSizeType | String] = js.native
  var vertical: js.UndefOr[EdgeSizeType | String] = js.native
}

object Start {
  @scala.inline
  def apply(): Start = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Start]
  }
  @scala.inline
  implicit class StartOps[Self <: Start] (val x: Self) extends AnyVal {
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
    def setBottom(value: EdgeSizeType | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setEnd(value: EdgeSizeType | String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setHorizontal(value: EdgeSizeType | String): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setLeft(value: EdgeSizeType | String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: EdgeSizeType | String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setStart(value: EdgeSizeType | String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTop(value: EdgeSizeType | String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setVertical(value: EdgeSizeType | String): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

