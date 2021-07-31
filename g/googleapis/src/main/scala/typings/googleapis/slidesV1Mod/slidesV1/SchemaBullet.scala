package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the bullet of a paragraph.
  */
trait SchemaBullet extends StObject {
  
  /**
    * The paragraph specific text style applied to this bullet.
    */
  var bulletStyle: js.UndefOr[SchemaTextStyle] = js.undefined
  
  /**
    * The rendered bullet glyph for this paragraph.
    */
  var glyph: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the list this paragraph belongs to.
    */
  var listId: js.UndefOr[String] = js.undefined
  
  /**
    * The nesting level of this paragraph in the list.
    */
  var nestingLevel: js.UndefOr[Double] = js.undefined
}
object SchemaBullet {
  
  @scala.inline
  def apply(): SchemaBullet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBullet]
  }
  
  @scala.inline
  implicit class SchemaBulletMutableBuilder[Self <: SchemaBullet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulletStyle(value: SchemaTextStyle): Self = StObject.set(x, "bulletStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletStyleUndefined: Self = StObject.set(x, "bulletStyle", js.undefined)
    
    @scala.inline
    def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    @scala.inline
    def setNestingLevel(value: Double): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
  }
}
