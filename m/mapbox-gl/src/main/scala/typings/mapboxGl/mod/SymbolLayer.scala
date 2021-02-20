package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolLayer
  extends LayerBase
     with Layer {
  
  var layout: js.UndefOr[SymbolLayout] = js.native
  
  var paint: js.UndefOr[SymbolPaint] = js.native
  
  var `type`: symbol = js.native
}
object SymbolLayer {
  
  @scala.inline
  def apply(id: String, `type`: symbol): SymbolLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolLayer]
  }
  
  @scala.inline
  implicit class SymbolLayerMutableBuilder[Self <: SymbolLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: SymbolLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setPaint(value: SymbolPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    @scala.inline
    def setType(value: symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
