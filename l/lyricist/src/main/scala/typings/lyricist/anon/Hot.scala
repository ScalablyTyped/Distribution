package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hot extends js.Object {
  var hot: Boolean = js.native
  var pageviews: Double = js.native
  var unreviewed_annotations: Double = js.native
}

object Hot {
  @scala.inline
  def apply(hot: Boolean, pageviews: Double, unreviewed_annotations: Double): Hot = {
    val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any], pageviews = pageviews.asInstanceOf[js.Any], unreviewed_annotations = unreviewed_annotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hot]
  }
  @scala.inline
  implicit class HotOps[Self <: Hot] (val x: Self) extends AnyVal {
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
    def setHot(value: Boolean): Self = this.set("hot", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageviews(value: Double): Self = this.set("pageviews", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnreviewed_annotations(value: Double): Self = this.set("unreviewed_annotations", value.asInstanceOf[js.Any])
  }
  
}

