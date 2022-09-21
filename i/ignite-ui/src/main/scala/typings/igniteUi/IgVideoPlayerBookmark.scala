package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgVideoPlayerBookmark
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets/Sets whether the bookmark is disabled or not.
    *
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets where the bookmark will be positioned. Should be between 0 and movie duration in seconds.
    *
    */
  var time: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets bookmark title. It is shown as tooltip on hover.
    *
    */
  var title: js.UndefOr[String] = js.undefined
}
object IgVideoPlayerBookmark {
  
  inline def apply(): IgVideoPlayerBookmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerBookmark]
  }
  
  extension [Self <: IgVideoPlayerBookmark](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
