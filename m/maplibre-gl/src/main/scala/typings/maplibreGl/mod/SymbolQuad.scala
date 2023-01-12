package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolQuad extends StObject {
  
  var bl: ^
  
  var br: ^
  
  var glyphOffset: js.Tuple2[Double, Double]
  
  var isSDF: Boolean
  
  var minFontScaleX: Double
  
  var minFontScaleY: Double
  
  var pixelOffsetBR: ^
  
  var pixelOffsetTL: ^
  
  var sectionIndex: Double
  
  var tex: H
  
  var tl: ^
  
  var tr: ^
  
  var writingMode: Any | scala.Unit
}
object SymbolQuad {
  
  inline def apply(
    bl: ^,
    br: ^,
    glyphOffset: js.Tuple2[Double, Double],
    isSDF: Boolean,
    minFontScaleX: Double,
    minFontScaleY: Double,
    pixelOffsetBR: ^,
    pixelOffsetTL: ^,
    sectionIndex: Double,
    tex: H,
    tl: ^,
    tr: ^,
    writingMode: Any | scala.Unit
  ): SymbolQuad = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], glyphOffset = glyphOffset.asInstanceOf[js.Any], isSDF = isSDF.asInstanceOf[js.Any], minFontScaleX = minFontScaleX.asInstanceOf[js.Any], minFontScaleY = minFontScaleY.asInstanceOf[js.Any], pixelOffsetBR = pixelOffsetBR.asInstanceOf[js.Any], pixelOffsetTL = pixelOffsetTL.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], tex = tex.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], writingMode = writingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolQuad]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SymbolQuad] (val x: Self) extends AnyVal {
    
    inline def setBl(value: ^): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
    
    inline def setBr(value: ^): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setGlyphOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "glyphOffset", value.asInstanceOf[js.Any])
    
    inline def setIsSDF(value: Boolean): Self = StObject.set(x, "isSDF", value.asInstanceOf[js.Any])
    
    inline def setMinFontScaleX(value: Double): Self = StObject.set(x, "minFontScaleX", value.asInstanceOf[js.Any])
    
    inline def setMinFontScaleY(value: Double): Self = StObject.set(x, "minFontScaleY", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetBR(value: ^): Self = StObject.set(x, "pixelOffsetBR", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetTL(value: ^): Self = StObject.set(x, "pixelOffsetTL", value.asInstanceOf[js.Any])
    
    inline def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
    
    inline def setTex(value: H): Self = StObject.set(x, "tex", value.asInstanceOf[js.Any])
    
    inline def setTl(value: ^): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
    
    inline def setTr(value: ^): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
    
    inline def setWritingMode(value: Any | scala.Unit): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
  }
}
