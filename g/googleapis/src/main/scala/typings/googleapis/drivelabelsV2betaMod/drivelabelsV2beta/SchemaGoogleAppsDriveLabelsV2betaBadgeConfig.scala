package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaBadgeConfig extends StObject {
  
  /**
    * The color of the badge. When not specified, no badge is rendered. The background, foreground, and solo (light and dark mode) colors set here are changed in the Drive UI into the closest recommended supported color.
    */
  var color: js.UndefOr[SchemaGoogleTypeColor] = js.undefined
  
  /**
    * Override the default global priority of this badge. When set to 0, the default priority heuristic is used.
    */
  var priorityOverride: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaBadgeConfig {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaBadgeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaBadgeConfig]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaBadgeConfig](x: Self) {
    
    inline def setColor(value: SchemaGoogleTypeColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPriorityOverride(value: String): Self = StObject.set(x, "priorityOverride", value.asInstanceOf[js.Any])
    
    inline def setPriorityOverrideNull: Self = StObject.set(x, "priorityOverride", null)
    
    inline def setPriorityOverrideUndefined: Self = StObject.set(x, "priorityOverride", js.undefined)
  }
}
