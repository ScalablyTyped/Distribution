package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2DocumentStyle extends StObject {
  
  /**
    * Text background color.
    */
  var backgroundColor: js.UndefOr[SchemaGoogleTypeColor] = js.undefined
  
  /**
    * Text color.
    */
  var color: js.UndefOr[SchemaGoogleTypeColor] = js.undefined
  
  /**
    * Font size.
    */
  var fontSize: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2DocumentStyleFontSize] = js.undefined
  
  /**
    * Font weight. Possible values are normal, bold, bolder, and lighter. https://www.w3schools.com/cssref/pr_font_weight.asp
    */
  var fontWeight: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Text anchor indexing into the Document.text.
    */
  var textAnchor: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2DocumentTextAnchor] = js.undefined
  
  /**
    * Text decoration. Follows CSS standard. https://www.w3schools.com/cssref/pr_text_text-decoration.asp
    */
  var textDecoration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Text style. Possible values are normal, italic, and oblique. https://www.w3schools.com/cssref/pr_font_font-style.asp
    */
  var textStyle: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2DocumentStyle {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2DocumentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2DocumentStyle]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2DocumentStyle](x: Self) {
    
    inline def setBackgroundColor(value: SchemaGoogleTypeColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setColor(value: SchemaGoogleTypeColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontSize(value: SchemaGoogleCloudDocumentaiV1beta2DocumentStyleFontSize): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightNull: Self = StObject.set(x, "fontWeight", null)
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setTextAnchor(value: SchemaGoogleCloudDocumentaiV1beta2DocumentTextAnchor): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationNull: Self = StObject.set(x, "textDecoration", null)
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    inline def setTextStyle(value: String): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
