package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgVideoPlayerBookmark
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets whether the bookmark is disabled or not.
    *
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets where the bookmark will be positioned. Should be between 0 and movie duration in seconds.
    *
    */
  var time: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets bookmark title. It is shown as tooltip on hover.
    *
    */
  var title: js.UndefOr[String] = js.native
}
object IgVideoPlayerBookmark {
  
  @scala.inline
  def apply(): IgVideoPlayerBookmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerBookmark]
  }
  
  @scala.inline
  implicit class IgVideoPlayerBookmarkOps[Self <: IgVideoPlayerBookmark] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
