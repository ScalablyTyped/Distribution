package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObaIcon extends StObject {
  
  /**
    * URL to redirect to when an OBA icon is clicked.
    */
  var iconClickThroughUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL to track click when an OBA icon is clicked.
    */
  var iconClickTrackingUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL to track view when an OBA icon is clicked.
    */
  var iconViewTrackingUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the industry initiative that the icon supports. For example, AdChoices.
    */
  var program: js.UndefOr[String | Null] = js.undefined
  
  /**
    * OBA icon resource URL. Campaign Manager only supports image and JavaScript icons. Learn more
    */
  var resourceUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * OBA icon size.
    */
  var size: js.UndefOr[SchemaSize] = js.undefined
  
  /**
    * OBA icon x coordinate position. Accepted values are left or right.
    */
  var xPosition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * OBA icon y coordinate position. Accepted values are top or bottom.
    */
  var yPosition: js.UndefOr[String | Null] = js.undefined
}
object SchemaObaIcon {
  
  inline def apply(): SchemaObaIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObaIcon]
  }
  
  extension [Self <: SchemaObaIcon](x: Self) {
    
    inline def setIconClickThroughUrl(value: String): Self = StObject.set(x, "iconClickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setIconClickThroughUrlNull: Self = StObject.set(x, "iconClickThroughUrl", null)
    
    inline def setIconClickThroughUrlUndefined: Self = StObject.set(x, "iconClickThroughUrl", js.undefined)
    
    inline def setIconClickTrackingUrl(value: String): Self = StObject.set(x, "iconClickTrackingUrl", value.asInstanceOf[js.Any])
    
    inline def setIconClickTrackingUrlNull: Self = StObject.set(x, "iconClickTrackingUrl", null)
    
    inline def setIconClickTrackingUrlUndefined: Self = StObject.set(x, "iconClickTrackingUrl", js.undefined)
    
    inline def setIconViewTrackingUrl(value: String): Self = StObject.set(x, "iconViewTrackingUrl", value.asInstanceOf[js.Any])
    
    inline def setIconViewTrackingUrlNull: Self = StObject.set(x, "iconViewTrackingUrl", null)
    
    inline def setIconViewTrackingUrlUndefined: Self = StObject.set(x, "iconViewTrackingUrl", js.undefined)
    
    inline def setProgram(value: String): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramNull: Self = StObject.set(x, "program", null)
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    inline def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    inline def setResourceUrlNull: Self = StObject.set(x, "resourceUrl", null)
    
    inline def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
    
    inline def setSize(value: SchemaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setXPosition(value: String): Self = StObject.set(x, "xPosition", value.asInstanceOf[js.Any])
    
    inline def setXPositionNull: Self = StObject.set(x, "xPosition", null)
    
    inline def setXPositionUndefined: Self = StObject.set(x, "xPosition", js.undefined)
    
    inline def setYPosition(value: String): Self = StObject.set(x, "yPosition", value.asInstanceOf[js.Any])
    
    inline def setYPositionNull: Self = StObject.set(x, "yPosition", null)
    
    inline def setYPositionUndefined: Self = StObject.set(x, "yPosition", js.undefined)
  }
}
