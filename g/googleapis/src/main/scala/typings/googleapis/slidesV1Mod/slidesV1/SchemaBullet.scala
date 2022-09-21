package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBullet extends StObject {
  
  /**
    * The paragraph specific text style applied to this bullet.
    */
  var bulletStyle: js.UndefOr[SchemaTextStyle] = js.undefined
  
  /**
    * The rendered bullet glyph for this paragraph.
    */
  var glyph: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the list this paragraph belongs to.
    */
  var listId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The nesting level of this paragraph in the list.
    */
  var nestingLevel: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBullet {
  
  inline def apply(): SchemaBullet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBullet]
  }
  
  extension [Self <: SchemaBullet](x: Self) {
    
    inline def setBulletStyle(value: SchemaTextStyle): Self = StObject.set(x, "bulletStyle", value.asInstanceOf[js.Any])
    
    inline def setBulletStyleUndefined: Self = StObject.set(x, "bulletStyle", js.undefined)
    
    inline def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    inline def setGlyphNull: Self = StObject.set(x, "glyph", null)
    
    inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
    
    inline def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    inline def setListIdNull: Self = StObject.set(x, "listId", null)
    
    inline def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    inline def setNestingLevel(value: Double): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
    
    inline def setNestingLevelNull: Self = StObject.set(x, "nestingLevel", null)
    
    inline def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
  }
}
