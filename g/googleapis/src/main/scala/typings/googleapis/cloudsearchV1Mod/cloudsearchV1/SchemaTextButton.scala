package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextButton extends StObject {
  
  /**
    * The alternative text used for accessibility Next field number: 7.
    */
  var altText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional color of the button's background in RAISE mode. The default is the secondary color from addon's manifest.
    */
  var backgroundColor: js.UndefOr[String | Null] = js.undefined
  
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  var onClick: js.UndefOr[SchemaOnClick] = js.undefined
  
  var style: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Text color can be set via HTML markup.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaTextButton {
  
  inline def apply(): SchemaTextButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextButton]
  }
  
  extension [Self <: SchemaTextButton](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextNull: Self = StObject.set(x, "altText", null)
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnClick(value: SchemaOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
