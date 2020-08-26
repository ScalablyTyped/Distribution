package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgVideoPlayerCommercials
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Customizes the ad message settings of the commercial. Ad message shows the duration of the commercial and pops up when the commercial starts playing.
    *
    */
  var adMessage: js.UndefOr[IgVideoPlayerCommercialsAdMessage] = js.native
  /**
    * Gets/Sets whether the commercials will play againg during the repetitive video plays.
    *
    */
  var alwaysPlayCommercials: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets an array of embedded commercials objects. An embedded commercial is an ad that is contained in the original video file. It is suitable when you want to mark some sections of the video as commercials.
    *
    */
  var embeddedCommercials: js.UndefOr[js.Array[IgVideoPlayerCommercialsEmbeddedCommercial]] = js.native
  /**
    * Gets/Sets an array of linked commercial objects. A linked commercial is a separate video file that will be played in the specified position of the original movie clip by [startTime](ui.igvideoplayer#options:commercials.linkedCommercials.startTime). This feature is useful if you have frequently changing outside commercial sources.
    *
    */
  var linkedCommercials: js.UndefOr[js.Array[IgVideoPlayerCommercialsLinkedCommercial]] = js.native
  /**
    * Gets/Sets whether to show commercial locations or not.
    *
    */
  var showBookmarks: js.UndefOr[Boolean] = js.native
}

object IgVideoPlayerCommercials {
  @scala.inline
  def apply(): IgVideoPlayerCommercials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerCommercials]
  }
  @scala.inline
  implicit class IgVideoPlayerCommercialsOps[Self <: IgVideoPlayerCommercials] (val x: Self) extends AnyVal {
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
    def setAdMessage(value: IgVideoPlayerCommercialsAdMessage): Self = this.set("adMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdMessage: Self = this.set("adMessage", js.undefined)
    @scala.inline
    def setAlwaysPlayCommercials(value: Boolean): Self = this.set("alwaysPlayCommercials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysPlayCommercials: Self = this.set("alwaysPlayCommercials", js.undefined)
    @scala.inline
    def setEmbeddedCommercialsVarargs(value: IgVideoPlayerCommercialsEmbeddedCommercial*): Self = this.set("embeddedCommercials", js.Array(value :_*))
    @scala.inline
    def setEmbeddedCommercials(value: js.Array[IgVideoPlayerCommercialsEmbeddedCommercial]): Self = this.set("embeddedCommercials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddedCommercials: Self = this.set("embeddedCommercials", js.undefined)
    @scala.inline
    def setLinkedCommercialsVarargs(value: IgVideoPlayerCommercialsLinkedCommercial*): Self = this.set("linkedCommercials", js.Array(value :_*))
    @scala.inline
    def setLinkedCommercials(value: js.Array[IgVideoPlayerCommercialsLinkedCommercial]): Self = this.set("linkedCommercials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedCommercials: Self = this.set("linkedCommercials", js.undefined)
    @scala.inline
    def setShowBookmarks(value: Boolean): Self = this.set("showBookmarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBookmarks: Self = this.set("showBookmarks", js.undefined)
  }
  
}

