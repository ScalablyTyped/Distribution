package typings.maplibreGl.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entry extends StObject {
  
  var glyphs: NumberDictionary[StyleGlyph | Null]
  
  var ranges: NumberDictionary[Boolean | Null]
  
  var requests: NumberDictionary[js.Array[Callback[NumberDictionary[StyleGlyph | Null]]]]
  
  var tinySDF: js.UndefOr[typings.mapboxTinySdf.mod.default] = js.undefined
}
object Entry {
  
  inline def apply(
    glyphs: NumberDictionary[StyleGlyph | Null],
    ranges: NumberDictionary[Boolean | Null],
    requests: NumberDictionary[js.Array[Callback[NumberDictionary[StyleGlyph | Null]]]]
  ): Entry = {
    val __obj = js.Dynamic.literal(glyphs = glyphs.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
    
    inline def setGlyphs(value: NumberDictionary[StyleGlyph | Null]): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
    
    inline def setRanges(value: NumberDictionary[Boolean | Null]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRequests(value: NumberDictionary[js.Array[Callback[NumberDictionary[StyleGlyph | Null]]]]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setTinySDF(value: typings.mapboxTinySdf.mod.default): Self = StObject.set(x, "tinySDF", value.asInstanceOf[js.Any])
    
    inline def setTinySDFUndefined: Self = StObject.set(x, "tinySDF", js.undefined)
  }
}
