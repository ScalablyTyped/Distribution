package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2BadgeColors extends StObject {
  
  /**
    * Output only. Badge background that pairs with the foreground.
    */
  var backgroundColor: js.UndefOr[SchemaGoogleTypeColor] = js.undefined
  
  /**
    * Output only. Badge foreground that pairs with the background.
    */
  var foregroundColor: js.UndefOr[SchemaGoogleTypeColor] = js.undefined
  
  /**
    * Output only. Color that can be used for text without a background.
    */
  var soloColor: js.UndefOr[SchemaGoogleTypeColor] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2BadgeColors {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2BadgeColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2BadgeColors]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2BadgeColors](x: Self) {
    
    inline def setBackgroundColor(value: SchemaGoogleTypeColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setForegroundColor(value: SchemaGoogleTypeColor): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setSoloColor(value: SchemaGoogleTypeColor): Self = StObject.set(x, "soloColor", value.asInstanceOf[js.Any])
    
    inline def setSoloColorUndefined: Self = StObject.set(x, "soloColor", js.undefined)
  }
}
