package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgVideoPlayerCommercialsEmbeddedCommercial
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets the end second of the embedded commercial.
    *
    */
  var endTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the sponsored link of the embedded commercial.
    *
    */
  var link: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the start second of the embedded commercial.
    *
    */
  var startTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the tooltip for the bookmark of the embedded commercial.
    *
    */
  var title: js.UndefOr[String] = js.undefined
}
object IgVideoPlayerCommercialsEmbeddedCommercial {
  
  inline def apply(): IgVideoPlayerCommercialsEmbeddedCommercial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerCommercialsEmbeddedCommercial]
  }
  
  extension [Self <: IgVideoPlayerCommercialsEmbeddedCommercial](x: Self) {
    
    inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
