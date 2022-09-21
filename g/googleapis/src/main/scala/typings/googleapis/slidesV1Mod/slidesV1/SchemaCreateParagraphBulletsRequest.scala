package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateParagraphBulletsRequest extends StObject {
  
  /**
    * The kinds of bullet glyphs to be used. Defaults to the `BULLET_DISC_CIRCLE_SQUARE` preset.
    */
  var bulletPreset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The optional table cell location if the text to be modified is in a table cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.undefined
  
  /**
    * The object ID of the shape or table containing the text to add bullets to.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The range of text to apply the bullet presets to, based on TextElement indexes.
    */
  var textRange: js.UndefOr[SchemaRange] = js.undefined
}
object SchemaCreateParagraphBulletsRequest {
  
  inline def apply(): SchemaCreateParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateParagraphBulletsRequest]
  }
  
  extension [Self <: SchemaCreateParagraphBulletsRequest](x: Self) {
    
    inline def setBulletPreset(value: String): Self = StObject.set(x, "bulletPreset", value.asInstanceOf[js.Any])
    
    inline def setBulletPresetNull: Self = StObject.set(x, "bulletPreset", null)
    
    inline def setBulletPresetUndefined: Self = StObject.set(x, "bulletPreset", js.undefined)
    
    inline def setCellLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
    inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setTextRange(value: SchemaRange): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
    
    inline def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
  }
}
