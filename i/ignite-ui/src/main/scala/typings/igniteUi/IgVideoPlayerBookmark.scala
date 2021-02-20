package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class IgVideoPlayerBookmarkMutableBuilder[Self <: IgVideoPlayerBookmark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
