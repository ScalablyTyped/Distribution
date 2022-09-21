package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateParagraphBulletsRequest extends StObject {
  
  /**
    * The kinds of bullet glyphs to be used.
    */
  var bulletPreset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The range to apply the bullet preset to.
    */
  var range: js.UndefOr[SchemaRange] = js.undefined
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
    
    inline def setRange(value: SchemaRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
