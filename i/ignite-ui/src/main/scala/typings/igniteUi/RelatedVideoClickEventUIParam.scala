package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedVideoClickEventUIParam extends js.Object {
  /**
    * Get the relatedVideo object from the relatedVideos array.
    */
  var relatedVideo: js.UndefOr[js.Any] = js.native
  /**
    * Get the relatedVideo html element in the DOM.
    */
  var relatedVideoElement: js.UndefOr[js.Any] = js.native
}

object RelatedVideoClickEventUIParam {
  @scala.inline
  def apply(): RelatedVideoClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedVideoClickEventUIParam]
  }
  @scala.inline
  implicit class RelatedVideoClickEventUIParamOps[Self <: RelatedVideoClickEventUIParam] (val x: Self) extends AnyVal {
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
    def setRelatedVideo(value: js.Any): Self = this.set("relatedVideo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedVideo: Self = this.set("relatedVideo", js.undefined)
    @scala.inline
    def setRelatedVideoElement(value: js.Any): Self = this.set("relatedVideoElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedVideoElement: Self = this.set("relatedVideoElement", js.undefined)
  }
  
}

