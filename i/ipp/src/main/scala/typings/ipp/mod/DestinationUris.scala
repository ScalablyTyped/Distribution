package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationUris extends js.Object {
  var `destination-attributes`: js.UndefOr[js.Array[js.Object]] = js.native
  var `destination-uri`: js.UndefOr[String] = js.native
  var `feed-orientation`: js.UndefOr[FeedOrientation] = js.native
  var `post-dial-string`: js.UndefOr[String] = js.native
  var `pre-dial-string`: js.UndefOr[String] = js.native
  var `t33-subaddress`: js.UndefOr[Double] = js.native
}

object DestinationUris {
  @scala.inline
  def apply(): DestinationUris = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationUris]
  }
  @scala.inline
  implicit class DestinationUrisOps[Self <: DestinationUris] (val x: Self) extends AnyVal {
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
    def `setDestination-attributesVarargs`(value: js.Object*): Self = this.set("destination-attributes", js.Array(value :_*))
    @scala.inline
    def `setDestination-attributes`(value: js.Array[js.Object]): Self = this.set("destination-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDestination-attributes`: Self = this.set("destination-attributes", js.undefined)
    @scala.inline
    def `setDestination-uri`(value: String): Self = this.set("destination-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDestination-uri`: Self = this.set("destination-uri", js.undefined)
    @scala.inline
    def `setFeed-orientation`(value: FeedOrientation): Self = this.set("feed-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFeed-orientation`: Self = this.set("feed-orientation", js.undefined)
    @scala.inline
    def `setPost-dial-string`(value: String): Self = this.set("post-dial-string", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePost-dial-string`: Self = this.set("post-dial-string", js.undefined)
    @scala.inline
    def `setPre-dial-string`(value: String): Self = this.set("pre-dial-string", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePre-dial-string`: Self = this.set("pre-dial-string", js.undefined)
    @scala.inline
    def `setT33-subaddress`(value: Double): Self = this.set("t33-subaddress", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteT33-subaddress`: Self = this.set("t33-subaddress", js.undefined)
  }
  
}

